#!/usr/bin/env python
# -*- coding: utf-8 -*-

import csv
import logging
import os.path as path

#configuracion del log
logger = logging.getLogger(__name__)  
logger.setLevel(logging.WARNING)
file_handler = logging.FileHandler('logfile.log')
formatter    = logging.Formatter('%(asctime)s : %(levelname)s : %(message)s')
file_handler.setFormatter(formatter)

logger.addHandler(file_handler)
#END

key = True

print "#####################"
print "## CSV A HTML TABLA##"
print "#####################\n"


try:
	nombrearchivo = raw_input("Cual es el nombre del archivo csv (sin extension)?: ")
	while (key):
		if not path.exists(nombrearchivo+".csv"):
			print "El archivo",nombrearchivo+".csv no existe!"
			nombrearchivo = raw_input("Cual es el nombre del archivo csv (sin extension)?: ")
		else:
			print "Archivo",nombrearchivo+".csv encontrado!"
			key = False

	nombrehtml = raw_input("Que nombre desea darle al archivo html (sin extension): ")

	deli = raw_input("Indica el delimitador: ")

	#Escribo las variables en el fichero html

	archivo2 = open(nombrehtml+".html","w+")
	archivo2.write("<html>\n")
	archivo2.write("<head>\n")

	#aqui comienza el estilo
	archivo2.write("<style>\n")
	archivo2.write("table{")
	archivo2.write("background-color: white;")
	archivo2.write("text-align: left;")
	archivo2.write("margin-left:auto;")
	archivo2.write("margin-right:auto;")
	archivo2.write("border-collapse: collapse;")
	archivo2.write("width: 100%;")
	archivo2.write("}")

	archivo2.write("th, td{")
	archivo2.write("padding: 20px;")
	archivo2.write("}")

	archivo2.write("thead{")
	archivo2.write("background-color: #246355;")
	archivo2.write("border-bottom: solid 5px #0F362D;")
	archivo2.write("color: white;")
	archivo2.write("}")

	archivo2.write("tr:nth-child(even){")
	archivo2.write("background-color: #ddd;")
	archivo2.write("}")

	archivo2.write("tr:hover td{")
	archivo2.write("background-color: #369681;")
	archivo2.write("color: white;")
	archivo2.write("}")


	archivo2.write("</style>\n")
	#END

	archivo2.write("<body>\n")
	archivo2.write("<h1><center>Conversor de csv a html</center></h1>\n")
	archivo2.write('<div>\n')
	archivo2.write("<table>\n")
	archivo2.write("<thead>\n")

	## tuve que abrirlo otra vez por que con el de abajo no dejaba :(
	with open(nombrearchivo+'.csv') as archivo3:
		lector2 = csv.reader(archivo3, delimiter=deli)
		for raw in lector2:
			hosti = len(raw)

		for i in range (0,hosti-1):
			archivo2.write("<th> Dato"+str(i)+"</th>\n")

		archivo2.write("</thead>\n")
		archivo2.write("<tr>\n")
	#END


	#leer el archivo csv
	with open(nombrearchivo+'.csv') as archivo:
		
		lector = csv.reader(archivo, delimiter=deli)

		for row in lector:
			archivo2.write("<tr>\n")
			
			hostia = len(row)
			for i in range (0,hostia-1):
				archivo2.write("\t<td>")
				archivo2.write(row[i])
				archivo2.write("\t</td>\n")

			archivo2.write("</tr>\n")

	archivo2.write("</tr>\n")
	archivo2.write("</table>\n")
	archivo2.write("</div>")
	archivo2.write("<footer><center><p>By: nessx</p></center></footer>")
	archivo2.write("</body>\n")
	archivo2.write("</head>\n")
	archivo2.write("</html>\n")
	archivo2.close()
    
except IndexError:
    print("Error, en su archivo csv, por favor revise que el fichero este escrito correctamente!, revisa el archivo log para mas informacion")
    logger.critical("IndexError occurred", exc_info=True)
except ValueError:
    print("ERROR: I/O operacion en un archivo cerrado, revisa que no cierras el archivo antes de leer las lineas que necesites.")
    logger.critical("ValueError occurred", exc_info=True)
except TypeError:
    print("ERROR")
    logger.critical("TypeError occurred", exc_info=True)
else:
	print ("PROGRAMA EJECUTADO SIN ERRORES :)")
        logger.debug("PROGRAMA EJECUTADO SIN ERRORES :")
	archivo.close()