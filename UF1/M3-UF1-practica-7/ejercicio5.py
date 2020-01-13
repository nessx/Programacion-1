#! /usr/bin/env python
# encoding: utf-8
import sys
import os
opc = ""
while opc != "0":
	os.system("clear")
	print "===== MENU ====="
	print "1-Sumar"
	print "2-Restar"
	print "3-multiplicacion"
	print "4-division\n"
	print "0-Salir"
	opc=raw_input("Elige una opción: ")
	if opc=="1":
		os.system("clear")
		print "===== SUMA ====="
		B = int(raw_input("Intruce el primer numero: "))
		C = int(raw_input("Intruce el segundo numero: "))
		E = B+C
	elif opc=="2":
		os.system("clear")
		print "===== RESTA ====="
		B = int(raw_input("Intruce el primer numero: "))
		C = int(raw_input("Intruce el segundo numero: "))
		E = B-C
	elif opc=="3":
		os.system("clear")
		print "====== MULTIPLICACION ====="
		B = int(raw_input("Intruce el primer numero: "))
		C = int(raw_input("Intruce el segundo numero: "))
		E = B*C
	elif opc=="4":
		os.system("clear")
		print "====== DIVISION ====="
		B = int(raw_input("Intruce el primer numero: "))
		C = int(raw_input("Intruce el segundo numero: "))
		if C!=0:
			E = B/C
		else:
			E="Infinito"
			print "NO PUEDES DIVIDIR ENTRE 0 EINSTENIN"
	elif opc=="0":
		os.system("clear")
		print "===== Has elegido salir ====="
		sys.exit()
			
	print "------------------------"
	print "El resultado es [", E, "]"
	print "------------------------\n"

	R = raw_input("Quieres continuar? si o no: ")
	if R=="si":
		print "==== FELICIDADES VAMOS A CALCULAR ====\n"
	else:
		print "\nADIOS"
		sys.exit()
