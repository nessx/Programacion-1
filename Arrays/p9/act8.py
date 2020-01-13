#! /usr/bin/env python
# encoding: utf-8
# Programita 7
import sys
import os

nbuena=0
nota1=0
key = ""
contador=0
while key !="si" or key !="s":
		nombrealumno=raw_input("Nombre del alumno: ")
		notalumno=int(raw_input("Nota del alumno: "))
		if contador ==0:
			nota1+=notalumno
			notabaja=notalumno
			peornota=nombrealumno
		elif contador >0:
			nota1+=notalumno
			if notabaja>notalumno:
				notabaja=notalumno
				peornota=nombrealumno
				
		contador+=1
		pregunta=raw_input("Desea finalizar (S/N)?: ")
		if pregunta=="si" or pregunta =="s":
			media = nota1/contador
			print "La media es: " , media
			print "El alumno con la peor nota es:", peornota,"con un", notabaja,"\n"
			print "Pero no pasa nada seguiremos siendo, F·R·I·E·N·D·S"
			os.system("sleep 1")
			sys.exit()
		

