import csv
 #!/usr/bin/python

print "#####################"
print "## CSV A HTML TABLA##"
print "#####################\n"

try:
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
			print lista,"|",lista1,"|",lista2,"|",lista3,"|",lista4,"|",lista5,"|",lista6,"|"

	archivo2 = open("index.html","w+")

	archivo2.write("<html>\n")
	archivo2.write("<head>\n")
	archivo2.write("<body>\n")
	archivo2.write("<table>\n")
	archivo2.write("<tr>\n")
	archivo2.write("<td> years </td>\n")
	archivo2.write("<td> dato1 </td>\n")
	archivo2.write("<td> dato2 </td>\n")
	archivo2.write("<td> dato3 </td>\n")
	archivo2.write("<td> dato4 </td>\n")
	archivo2.write("<td> dato5 </td>\n")
	archivo2.write("<td> dato6 </td>\n")
	archivo2.write("</tr>\n")
	archivo2.write("<tr>\n")

	for row in archivo:
		archivo2.write("<td>",lista,"</td>\n")
		archivo2.write("<td>",lista1,"</td>\n")
		archivo2.write("<td>",lista2,"</td>\n")
		archivo2.write("<td>",lista3,"</td>\n")
		archivo2.write("<td>",lista4,"</td>\n")
		archivo2.write("<td>",lista5,"</td>\n")
		archivo2.write("<td>",lista6,"</td>\n")

	archivo2.write("</tr>\n")
	archivo2.write("</table>\n")
	archivo2.write("</body>\n")
	archivo2.write("</head>\n")
	archivo2.write("</html>\n")
	archivo2.close()
		

except IOError:
    print("ERROR: El archivo no es accesible o no existe!")
except ValueError:
    print("ERROR: I/O operacion en un archivo cerrado, revisa que no cierras el archivo antes de leer las lineas que necesites.")
else:
    archivo.close()


