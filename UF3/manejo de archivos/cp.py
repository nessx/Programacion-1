#!/usr/bin/python

archivo = open("test.txt", "r")

#abrir el nuevo archivo y escribir lo que hay en el anterior
f = open("demofile2.txt", "a")
f.write(archivo.readline())
f.close()

#abrir y leer el archivo
f = open("demofile2.txt", "r")
print(f.read())