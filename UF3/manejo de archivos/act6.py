#!/usr/bin/python

print "#####################"
print "####### EX 6 ########"
print "#####################\n"

file = raw_input("Donde esta el archivo?: ")

contador=0
try:
    with open(file,'r') as archivo:   
        print"El archivo contiene: "   
        for linea in archivo:
            contador+=1
            print "Linia ",contador," - ",len(linea.split()), "palabras "

except IOError:
    print("ERROR: El archivo no es accesible o no existe!")
else:
    archivo.close()