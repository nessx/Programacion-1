#!/usr/bin/python

print "#####################"
print "##### TEST FILE #####"
print "#####################\n"

file = raw_input("Donde esta el archivo?: ")

try:
    with open(file,'r') as archivo:
        print"El archivo contiene: "   
        for linea in archivo:        
            for palabras in linea.split():            
                print (palabras)

except IOError:
    print("ERROR: El archivo no es accesible o no existe!")
else:
    archivo.close()