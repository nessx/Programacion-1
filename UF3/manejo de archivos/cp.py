#!/usr/bin/python

archivo = open("test.txt", "r")

fil = "demofile.txt"

#abrir el nuevo archivo y escribir lo que hay en el anterior
f = open(fil, "a")
f.write(archivo.readline())
f.close()

#abrir y leer el archivo
f = open(fil, "r")
print(f.readline())