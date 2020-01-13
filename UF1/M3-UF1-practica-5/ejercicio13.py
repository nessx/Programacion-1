#! /usr/bin/env python
# encoding: utf-8
# Programita 1
print "Perpsi cola inc."
cola = raw_input("Introduce numero de ventas de producto cola:")
cola = int(cola)
cp = raw_input("Introduce el precio de cola:")
cp = float(cp)
toronja = raw_input("Introduce numero de ventas de producto toronja:")
toronja = int(toronja)
tp = raw_input("Introduce el precio de toronja:")
tp = float(tp)
limon = raw_input("Introduce numero de ventas de producto limon:")
limon = int(limon)
lp = raw_input("Introduce el precio de limon:")
lp = float(lp)
totalc = cola*cp
totalt = toronja*tp
totall = limon*lp
total = totalc+totalt+totall
print	"-------------------------------------------------"
print	"Producto	Ventas	Precio		Total\t"
print	"-------------------------------------------------\n"
print	"Cola		",cola,"	",cp,"		",totalc,"\n"
print	"Toronja	\t",toronja,"	",tp,"	\t",totalt,"\n"
print	"Limon		",limon,"	",lp,"		",totall,"\n"
print	"-------------------------------------------------\n"

print 	"TOTAL\t\t\t\t\t",total							 							
