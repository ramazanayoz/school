use strict;
use warnings;

hello();
my $avg = average(10,20,30);
print "average of 10,20 and 30 is equal to: $avg.\n";

print"Enter a DNA:";
my $DNA = <>;
chomp($DNA);
$DNA = myfunc($DNA);
print $DNA, "\n";
#-------------------------------------------------------------passing by reference-------------------------------------
print"Enter a DNA: ";
my $DNA2 = <>;
chomp($DNA2);
myfunc2(\$DNA2);
print $DNA2, "\n";
#--------------------------------------------------------------end---------------------------------------------------

sub hello{
	print "Hello world!\n";
}

sub average{
	my $size = scalar @_;
	my $total = 0;
	
	for(my $a = 0; $a < $size; $a++){
	
		$total += $_[$a];
	}
	my $avg = $total / $size;
	return $avg;
}

sub myfunc{
	my($DNA) = @_;
	if($DNA =~ /atg/){
	   $DNA =~ s/atg/ATG/g;
	}
	return $DNA;

}

sub myfunc2{
	my $DNAref = shift;
	if(${$DNAref} =~ /atg/){
	   $$DNAref  =~ s/atg/ATG/g;
		}

		
		
}
