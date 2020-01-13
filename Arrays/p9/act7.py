#! /usr/bin/env python
# encoding: utf-8
# Programita 7
import sys
import os

nbuena=0
nota1=0
for contador in range(0,10,1):
	nombrealumno=raw_input("Nombre del alumno: ")
	notalumno=int(raw_input("Nota del alumno: "))
	if contador ==0:
		nota1+=notalumno
		notabaja=notalumno
		peornota=nombrealumno
	if contador >0:
		nota1+=notalumno
		if notabaja>notalumno:
			notabaja=notalumno
			peornota=nombrealumno
	
	media = nota1/10

print "La media es: " , media
print "El alumno con la peor nota es:", peornota,"con", notabaja,"\n"
print "No pada nada seguiremos siendo, F·R·I·E·N·D·S"

