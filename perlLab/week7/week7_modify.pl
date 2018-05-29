

#flags
use strict;
use warnings;


print "Hello, this is my first perl script\n";

#ilk veriable string boolen integer depolanabilir

my $scalar_veriable = 5;

#tek tırnak eğer araya değişken konulcaksa ve javada + ike burda . kullanırız çift tırnaak ? 

print 'The value of $scalar_veriable is ' . $scalar_veriable . "\n";

$scalar_veriable = "this is a string ";
# böyle birşey java python gibi dillerde yapamayz tpe değişikliği gerekir
print 'The value of $scalar_veriable is now ' . $scalar_veriable . "\n";


#array için @ kullanırız
my @a = (10, 20, 30);

print "@a\n";

my @a = (10, "this is a string", 5.9, $scalar_veriable);

print "@a\n";