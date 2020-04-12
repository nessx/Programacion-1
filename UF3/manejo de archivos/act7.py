#!/usr/bin/python

print "#####################"
print "####### EX 7 ########"
print "#####################\n"

file = raw_input("Donde esta el archivo?: ")

try:
    lin = int(raw_input("Cuantas lineas quieres ver?: "))
    with open(file,'r') as archivo:   
        print"El archivo contiene: "   
        for linea in range(0,lin):
            print(archivo.readline())
except IOError:
    print("ERROR: El archivo no es accesible o no existe!")
except ValueError:
    print "valor invalido, asegurate de haber puesto un integer"
else:
    archivo.close()