#! /usr/bin/env python
# encoding: utf-8

print "ejercicio 13"

B = raw_input("Cuants fills tens?: ")
B = int(B) #Ingreso un string y con esta linea de codigo se convierte en un int (Integer)
if (B<0):
	print "error, no pots tenir menys que 0 fills!"
elif (B==0):
	print "tot el que t'has estalviat en bolquers!"
elif (B==1):
	print "compte de no mimar-lo massa!"
elif (B>1 and B<5):
	print "no t'avorreixes a casa eh?"
elif (B>4):
	print "tu sí fas país!"
