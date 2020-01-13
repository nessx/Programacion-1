#! /usr/bin/env python
# encoding: utf-8
import sys

print "activitat 6"
A = int(raw_input("Introduce un mes (09): "))
if A>12:
	print "Solo hay 12 meses en un año"
	sys.exit()
B = int(raw_input("Introduce un año (2013): "))

B1 = B
M1 = A-1
M2 = A+1


if M2>12: #Si el mes introducido es mayor que 12 el mes pasara a ser igual a 1 y suma un año
	if M2>12:
		M2=1
		B+=1

if M1<1: #Si el mes introducido despues de la resta es igual a 0 sera igual a 12 y se restara un año
	M1=12
	B1-=1

print M1,"/",B1, " mes anterior" 
print M2,"/",B, " mes posterior"
