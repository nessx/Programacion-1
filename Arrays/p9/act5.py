#! /usr/bin/env python
# encoding: utf-8
# Programita 1
import sys
import os

S = ""
print "====CALCULADORA DE AÑOS====\n"
while S !="no":
	A = raw_input("Introduce tu nombre: ")
	B = int(raw_input("Introduce tu edad: "))
	while B<=0:
		print "No puedes introducir un valor negativo"
		B = int(raw_input("Introduce tu edad: "))

	C = int(raw_input("Introduce el año actual: "))
	 
	D = C-B
	E = 0

	print "En", D, "Naciste", A
	for R in range(D+1,C,1):
		print "En", R, "Tenias", E, "Años"
		E+=1
	S = raw_input("quieres continuar? si/no:")
	os.system("clear")
	print "=====Comenzamos de nuevo====\n"
print "Adiós", A
'''
for(R=D+1;R<C;R++){

}

	for R in range(C,D+1,-1):
	for(R=C;R>D+1;i--)

'''
