#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  sense títol.py
#  
#  Copyright 2020 cf17nestor.santana <cf17nestor.santana@pc-jda>
#  
#  This program is free software; you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation; either version 2 of the License, or
#  (at your option) any later version.
#  
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
#  
#  You should have received a copy of the GNU General Public License
#  along with this program; if not, write to the Free Software
#  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
#  MA 02110-1301, USA.
nnnnm
nota=[]
nalumnos = int(raw_input("Cuantos alumnos quieres introducir?: "))

def media ():
	med = float (sum(nota))/float(len(nota))	
	print "nota media:", med
	print "minima:", min(nota)
	print "maxima:", max(nota)
	print "\n"

while nalumnos<0 or nalumnos>50:
	print "la cantidad de alumnos tiene que ser mayor que 1 y menor que 50"
	nalumnos = int(raw_input("Cuantos alimnos quieres introducir?: "))

for i in range(0,nalumnos,1):
	nota.append(int(raw_input("Introduce la nota del alumno: ")))
	while nota[i]<0 or nota[i]>10:
		print "la nota tiene que ser mayor que 0 y menor que 10"
		nota.append(int(raw_input("Introduce la nota del alumno: ")))
        #añado un if que hace que toda nota menor que 5 sea igual a 5 para que todos los alumnos aprueben
        if nota [i] < 5:
            nota [i] = 5

print "INICIAL:",
for i in range (0, nalumnos,1):
	if i<len(nota)-1:
		print str(nota[i])+",",
	else:
		print nota[i]
media()
pos = int(raw_input( "Que posicion quieres modificar?: "))
while pos>len(nota) or pos<0:
	print "La posicion no existe!"
	pos = int(raw_input( "Que posicion quieres modificar?: "))

nota [pos-1] = int(raw_input( "Que nota deceas poner?: "))
#añado un if que hace que toda nota menor que 5 sea igual a 5 para que todos los alumnos aprueben
if nota [pos-1] < 5:
        nota [pos-1] = 5

while nota[pos-1]<0 or nota[pos-1]>10:
	print "Solo se aceptan notas entre 0 y 10!"
	nota [pos-1] = int(raw_input( "Que nota deceas poner?: "))

print "\n"
print "CORRECION:",
for i in range (0, nalumnos,1):
	if i<len(nota)-1:
		print str(nota[i])+",",
	else:
		print nota[i]
media()
