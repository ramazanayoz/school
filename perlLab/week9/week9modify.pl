use strict;
use warnings;

print "type q or quit to exit\n";
print "Enter your input:";
my $input = <>;
chomp $input; ##enterı temizlemek için kullanılır

#my $regex = '^\d+\.\d+$';# \d any digit crachter + at least one, .single cracter \.  real dot  , noktanun sağında solunda en az 1 numara olmalı    float number isteniyor  

#my $regex = '^\d+.*\d+$';# \d any digit crachter + at least one, .single cracter \.  real dot  , noktanun sağında solunda en az 1 numara olmalı    float number isteniyor  

#my $regex = '^\w+@([a-z]+\.)+[a-z]{2,}$'; # min 2 

my $regex = '^\w+@([a-z]+\.)+[a-z]{2,}$'; # min 2 
#loop

until(($input eq "quit")||($input eq "q")) {
	if($input =~ /$regex/) { print "ACCEPTED\n"; }
	else { print "FAILED\n";}
	print "type q or quit to exit\n";
	print "Enter your input:";
	$input = <>;
	chomp $input;
}