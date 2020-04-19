#!/usr/bin/env python
# -*- coding: utf-8 -*-

import csv

print "#####################"
print "## CSV A HTML TABLA##"
print "#####################\n"

try:
	archivo2 = open("index.html","w+")

	archivo2.write("<html>\n")
	archivo2.write("<head>\n")

	archivo2.write("<style>\n")
	archivo2.write("table, th, td {")
	archivo2.write("border: 1px solid black;")
	archivo2.write("}")
	archivo2.write("</style>\n")
	
	archivo2.write("<body>\n")
	archivo2.write("<h1>title</h1>\n")
	archivo2.write("<table>\n")
	archivo2.write("<tr>\n")
	archivo2.write("<th> years </th>\n")
	archivo2.write("<th> dato1 </th>\n")
	archivo2.write("<th> dato2 </th>\n")
	archivo2.write("<th> dato3 </th>\n")
	archivo2.write("<th> dato4 </th>\n")
	archivo2.write("<th> dato5 </th>\n")
	archivo2.write("<th> dato6 </th>\n")
	archivo2.write("</tr>\n")
	archivo2.write("<tr>\n")

	listta = []
	with open('01001c.csv') as archivo:
		lector = csv.reader(archivo, delimiter=',')
		for row in lector:

			lista = row[0]
			lista1 = row[1]
			lista2 = row[2]
			lista3 = row[3]
			lista4 = row[4]
			lista5 = row[5]
			lista6 = row[6]

			archivo2.write("<tr>\n")
			
			archivo2.write("\t<td>")
			archivo2.write(lista)
			archivo2.write("\t</td>\n")

			archivo2.write("\t<td>")
			archivo2.write(lista1)
			archivo2.write("\t</td>\n")

			archivo2.write("\t<td>")
			archivo2.write(lista2)
			archivo2.write("\t</td>\n")

			archivo2.write("\t<td>")
			archivo2.write(lista3)
			archivo2.write("\t</td>\n")

			archivo2.write("\t<td>")
			archivo2.write(lista4)
			archivo2.write("\t</td>\n")

			archivo2.write("\t<td>")
			archivo2.write(lista5)
			archivo2.write("\t</td>\n")

			archivo2.write("\t<td>")
			archivo2.write(lista6)
			archivo2.write("\t</td>\n")

			archivo2.write("</tr>\n")

			#print lista,"|",lista1,"|",lista2,"|",lista3,"|",lista4,"|",lista5,"|",lista6,"|"


	archivo2.write("</tr>\n")
	archivo2.write("</table>\n")
	archivo2.write("</body>\n")
	archivo2.write("</head>\n")
	archivo2.write("</html>\n")
	archivo2.close()

except IOError:
    print("ERROR: El archivo no es accesible o no existe!")
except IndexError:
    print("Error, en su archivo csv, por favor revise que el fichero este escrito correctamente!, -> error (IndexError: list index out of range)")
except ValueError:
    print("ERROR: I/O operacion en un archivo cerrado, revisa que no cierras el archivo antes de leer las lineas que necesites.")
except TypeError:
    print("ERROR")
else:
	print ("PROGRAMA EJECUTADO SIN ERRORES :)")
	archivo.close()


