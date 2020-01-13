#! /usr/bin/env python
# encoding: utf-8
import sys
import os
opc = ""
while opc != "0":
	print "#### MENU ####"
	print "1-Sumar"
	print "2-Restar"
	print "3-Multiplicación"
	print "4-División\n"
	print "0-Salir"
	opc=raw_input("Elige una opción: ")
	if opc=="1":
		os.system("clear")
		print "==SUMA=="
		A = int(raw_input("Introduce el primer numero: "))
		B = int(raw_input("Introduce el segundo numero: "))
		print "Resultado de la suma es ",A+B
	elif opc=="2":
		os.system("clear")
		print "==RESTA=="
		A = int(raw_input("Introduce el primer numero: "))
		B = int(raw_input("Introduce el segundo numero: "))
		print "Resultado de la resta es ",A-B
	elif opc=="3":
		os.system("clear")
		print "==MULTIPLICACION=="
		A = int(raw_input("Introduce el primer numero: "))
		B = int(raw_input("Introduce el segundo numero: "))
		print "Resultado de la multiplicación es ",A*B
	elif opc=="4":
		os.system("clear")
		print "==DIVISION=="
		A = int(raw_input("Introduce el primer numero: "))
		if A<=0:
			print "oops, No es la llama que buscas..."
			print "==Razón: No puedes dividir entre 0 =="
			sys.exit()
		B = int(raw_input("Introduce el segundo numero: "))
		if B<=0:
			print "oops, No es la llama que buscas..."
			print "==Razón: No puedes dividir entre 0 =="
			sys.exit()
		print "Resultado de la división es ",A/B
	elif opc=="0":
		os.system("clear")
		print "=====Adiós!!!!====="
		sys.exit()
		
	else:
		os.system("clear")
		print "oops, No es la llama que buscas..."
		print "==Code: Opción erronea=="
		
