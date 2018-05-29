use strict;
use warnings;

print "type q or quit to exit\n";
print "Enter your input:";
my $input = <>;
chomp $input;

my $regex = '^\w+@([a-z]+\.)+[a-z]{2,}$';

until(($input eq "quit")||($input eq "q")) {
	if($input =~ /$regex/) { print "ACCEPTED\n"; }
	else { print "FAILED\n";}
	print "type q or quit to exit\n";
	print "Enter your input:";
	$input = <>;
	chomp $input;
}
