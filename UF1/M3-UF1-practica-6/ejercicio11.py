#! /usr/bin/env python
# encoding: utf-8
import sys
import os

print "#### MENU - MEDICO VIRTUAL ####"
print "1-Estornudos y dolores de cabeza"
print "2-Tos"
print "0-Ninguna de las anteriores"
opc=raw_input("Elige una opción: ")
if opc=="1":
	os.system("clear")
	print "==Enfermedad: Estornudos y dolores de cabeza=="
	A = raw_input("Tiene usted estornudos y dolores de cabeza?")
	B = raw_input("Tiene usted dolor de estomago?")

	if (A=="si" and B=="no"):
		print "te recomiendo que tomes paracetamol."
	elif (A=="si" and B=="si"):
		print "Te recomiendo que tomes Ácido acetil salicílico (AAS)."
	
elif opc=="2":
	os.system("clear")
	print "==Enfermedad: Tos=="
	A = raw_input("Tiene usted tos?")
	B = raw_input("Que edad tines?")
	B = int(B)

	if (A=="si" and B<12):
		print "te recomiendo que tomes un carmelo de miel."
	elif (A=="si" and B>12):
		print "Te recomiendo un caramelo de eucaliptus."

elif opc=="0":
	os.system("clear")
	print "=====Le recomiendo que valla a la consulta presencial====="
	sys.exit()
		
else:
	os.system("clear")
	print "oops, No es la llama que buscas..."
	print "==Code: Opción erronea=="
		
