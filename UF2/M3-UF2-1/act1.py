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
#  (at your option) any later version.rewrwerweq
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

nota=[]

nalumnos = int(raw_input("Cuantos alumnos quieres introducir?: "))

while nalumnos<0 or nalumnos>50:
	print "la cantidad de alumnos tiene que ser mayor que 1 y menor que 50"
	nalumnos = int(raw_input("Cuantos alimnos quieres introducir?: "))

for i in range(0,nalumnos,1):
	nota.append(int(raw_input("Introduce la nota del alumno: ")))
	while nota[i]<0 or nota[i]>10:
		print "la nota tiene que ser mayor que 0 y menor que 10"
		nota.append(int(raw_input("Introduce la nota del alumno: ")))
		
print "nota media:", sum(nota)/len(nota)
print "minima:", min(nota)
print "maxima:", max(nota)