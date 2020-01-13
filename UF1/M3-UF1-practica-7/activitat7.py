#! /usr/bin/env python
# encoding: utf-8
# Programita 1
import math
import os
import sys

A = "" #El valor de a inicia siendo 0

M1 = 0 #El valor de los billetes inicialmente es 0
M2 = 0 
B5 = 0
B10 = 0
B20 = 0
B50 = 0
B100 = 0
B500 = 0

while (A>= 0):
	print "\n--------------------------------------------------------"
	print "===== maquina expendedora de billetes GRATIS $$$ ======"
	print "------------------------------------------------------- \n"
	
	R = 0 #Reiniciar el contador a 0
	
	M1 = 0 #El valor de los billetes inicialmente es 0
	M2 = 0 
	B5 = 0
	B10 = 0
	B20 = 0
	B50 = 0
	B100 = 0
	B500 = 0
	
	R = int (raw_input("Cuanto dinero quieres?: "))
	
	if (R<=0):
		print "--------------------------------------------------------"
		print "Yo pensaba que querias dinerito rico :("
		print "-------------------------------------------------------- \n"
	
	while (R>=500):
		R-=500 #Al numero introducido le restas la moneda
		B500+=1 #recuento de numero de monedas
		
	while (R>=100):
		R-=100
		B100+=1
		
	while (R>=50):
		R-=50
		B50+=1
	
	while (R>=20):
		R-=20
		B20+=1
	
	while (R>=10):
		R-=10
		B10+=1
		
	while (R>=5):
		R-=5
		B5+=1
		
	while (R>=2):
		R-=2
		M2+=1
		
	while (R>=1):
		R-=1
		M1+=1
	
	os.system("clear")

	print "\n============================="
	print "Por favor recoge tu dinero."
	print "=============================\n"
	
	if (M1>=1):
		print "Monedas de 1$:", "[",M1,"]"
		
	if (M2>=1):
		print "Monedas de 2$:", "[",M2,"]"
		
	if (B5>=1):
		print "Billetes de 5$", "[",B5,"]"
	
	if (B10>=1):
		print "Billetes de 10$:", "[",B10,"]"
	
	if (B20>=1):
		print "Billetes de 20$:", "[",B20,"]"
		
	if (B50>=1):
		print "Billetes de 50$:", "[",B50,"]"
		
	if (B100>=1):	
		print "Billetes de 100$:", "[",B100,"]"
		
	if (B500>=1):
		print "Billetes de 500$:", "[",B500,"]"
		
	print "\n-----------------------------"
	
	S = raw_input("Quieres más?: ")
	while S!="si" and S!="sí" and  S!="si" and S!="Sí" and S!="Si" and S!="Si!" and S!="Sí!" and S!="si!" and S!="sí!" and S!="no" and S!="No" and S!="No!" and S!="no!":
		S = raw_input("··· Pedazo de gañan, quieres más?: (si/no) :")
	if S =="no":
		print "Saliendo..."
		os.system("sleep 2")
		sys.exit()
	elif S=="si":
		os.system("clear")
