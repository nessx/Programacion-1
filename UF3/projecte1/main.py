#!/usr/bin/env python
# -*- coding: utf-8 -*-

import csv
import logging

logger = logging.getLogger(__name__)  

logger.setLevel(logging.WARNING)

file_handler = logging.FileHandler('logfile.log')
formatter    = logging.Formatter('%(asctime)s : %(levelname)s : %(message)s')
file_handler.setFormatter(formatter)

logger.addHandler(file_handler)

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
	archivo2.write("<h1>projecte</h1>\n")
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
	
	with open('01001c.csv') as archivo:
		lector = csv.reader(archivo, delimiter=',')
		for row in lector:
			archivo2.write("<tr>\n")

			for i in range (0,7):
				archivo2.write("\t<td>")
				archivo2.write(row[i])
				archivo2.write("\t</td>\n")

			archivo2.write("</tr>\n")

	archivo2.write("</tr>\n")
	archivo2.write("</table>\n")
	archivo2.write("</body>\n")
	archivo2.write("</head>\n")
	archivo2.write("</html>\n")
	archivo2.close()
    
except IndexError:
    print("Error, en su archivo csv, por favor revise que el fichero este escrito correctamente!, revisa el archivo log para mas información")
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