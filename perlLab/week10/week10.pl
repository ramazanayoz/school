use strict;
use warnings;

my $filename = $ARGV[0];
open IN, "<", $filename or die "Can not open the file: $!"; 

while(<IN>){
    chomp;
    my @cols = split('\t', $_); #second line
	print "$cols[0] | $cols[1] | $cols[6]\n" ;

