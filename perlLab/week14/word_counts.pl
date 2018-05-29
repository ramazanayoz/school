use strict;
use warnings;

my $file = $ARGV[0];

open IN, '<', $file or die "Can not open the $file: $!\n";

my @lines = <IN>;
close IN;


my %word_counts = ();

foreach my $line (@lines){
   chomp $line;
   my @row = split(/\s/,$line);

   foreach my $word (@row){
	if(exists $word_counts{$word}){
		$word_counts{$word}+=1;	
	}
	else{
		$word_counts{$word}=1;
	}
   }
}

my @words = keys %word_counts;

foreach my $w (@words){
	print "$w\t -> $word_counts{$w}\n";
}
