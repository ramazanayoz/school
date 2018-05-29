use strict;
use warnings;

print "Hello, this is my first perl script\n";

my $scalar_variable = 5;


print 'The value of $scalar_variable is ' . "$scalar_variable" . "\n";

$scalar_variable = "this is a string";

print 'The value of $scalar_variable is now ' . "$scalar_variable" . "\n";

my @a = (10,20,30);

print "@a\n";

@a = (10, "this is a string", 5.9, $scalar_variable);


print "@a\n";
