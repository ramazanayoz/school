use strict;
use warnings;


my %grades = ("Ahmet"=>80,"Zeynep"=>50,"Kemal"=>100) ;


print "Sort by key -alphabetical order\n";
foreach my $student (sort keys %grades){
	print "$student $grades{$student}\n";
}


print "Sort by key -numerical order\n";

foreach my $student(sort { $grades{$b} <=> $grades{$a}}keys %grades){
	print "$student $grades{$student}\n";
}


#Two dimensional array example

my @a = ([1,2,3],[4,5,6],[7,8,9]);
print "$a[2][1] $a[1][2]\n";

my $row = scalar @a;
my $columns = scalar @{$a[0]};


for(my $i=0;$i<$row;$i++){
	for(my $j=0;$j<$columns;$j++){
       printf "$a[$i][$j] "; #in order to calculate transpose of a matrix simply change the order 								 $a[$j][$i]
	}
	print "\n";
}	

#array of hash example


my @AoH = ({husband=>"Barney" , wife=>"Betty" , son=>"Bambam" },
		   {husband=> "George", wife=>"Jane" , son=>"Elroy" },
		   {husband=>"Homer" , wife=>"Marge" , son=>"Bart" });


my %hash = %{$AoH[1]};
print "${$AoH[1]}{wife}\n";
print "$hash{wife}\n";

foreach my $element (@AoH){
	my %tmp_hash = %{$element};
	foreach my $key(sort keys %tmp_hash){
	  print "$key : $tmp_hash{$key}\t";

	}
	printf "\n";
}

