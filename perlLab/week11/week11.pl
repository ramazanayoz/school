#!/usr/bin/perl

use strict;
use warnings;

#pribt $0, "\n"; //class ismini söyler

my $file = $ARGV[0];

open IN, "<", $file or die "Can not open $file: $! \n";  # IN yerine herhangi bir isimde konulabilir

my @lines = <IN>;

close IN;

foreach my $line(@lines){ #satır satır dolaşıyor
 
chomp $line;
	my $host =  ""; my $time = ""; my $status = 0;
	if($line =~ /^(.*)\s(.*\s){2}\[(.*)\]\s".*"\s(\d{3})\s(\d+|-)/){
		$host = $1;
		$time = $3;
		$status = $4;
		
		print "$host\t$time\t$status\n";
	}
}

exit;

