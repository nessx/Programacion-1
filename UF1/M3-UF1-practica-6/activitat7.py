#! /usr/bin/env python
# encoding: utf-8

print "ejercicio 7"

DD = int(raw_input("Indroduce un Dia: "))
MM = int(raw_input("Indroduce un Mes: "))
AAAA = int(raw_input("Indroduce un Año: "))
HH = int(raw_input("Indroduce una Hora: "))
MnMn = int(raw_input("Indroduce el valor Minutos: "))
SS = int(raw_input("Indroduce el valor Segundos : "))

SS+=1
if SS>59:
	SS=0
	MnMn=+1
if MnMn>59:
	MnMn=0
	HH+=1
if HH>23:
	HH=0
	DD+=1
if DD>30:
	DD=1
	MM+=1
if MM>12:
	MM=1
	AAAA+=1

print DD, "/", MM, "/", AAAA," ",HH, ":", MnMn, ":",SS
	

