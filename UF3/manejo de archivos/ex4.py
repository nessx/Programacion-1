#!/usr/bin/python

print "#####################"
print "##### TEST FILE #####"
print "#####################\n"

file = raw_input("Donde esta el archivo?: ")

try:
    archivo = open(file, "r")
   # while archivo != "":
    print "El archivo contiene: \n", (archivo.read())

except IOError:
    print("ERROR: El archivo no es accesible o no existe!")
else:
    archivo.close()