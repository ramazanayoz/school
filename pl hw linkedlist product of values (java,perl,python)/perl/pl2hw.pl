#!/usr/bin/env perl -w
use strict;
use warnings;



sub read_file($){

    my ($file) = @_;
    my @linkedlist = ();
    open my $info, $file or die "Could not open $file: $!";
    my $i=0;
    while( my $line = <$info>) {
        if ($line =~ /^[-+]?\d+$/) {
            #^[0-9]{1,2}([,.][0-9]{1,2})?$

            push @linkedlist, $line;

           # my $item = $linkedlist[$i];
            $i = $i + 1;

        }
    }
	close $info; 
    return @linkedlist;
     }

my @Linkedlist1 = read_file('plhw');

my @Linkedlist2 = read_file('plhw2');




sub productOfList(){
    my $i=0;
    while(1){
        my $result=$Linkedlist1[$i]*$Linkedlist2[$i];
        print $result, "\n";
        $i=$i + 1;
        my $size = scalar( @Linkedlist1);
        my $size2 = scalar( @Linkedlist2 );
		
        if(($size==$i)||($size2==$i)){
        last;
        }

    }
}

productOfList()


