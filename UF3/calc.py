#! /usr/bin/env python
# encoding: utf-8
import sys
import os
import math

def suma(num1,num2):
    num1+=num2
    return num1

def resta(num1,num2):
    num1-=num2
    return num1

def mult(num1,num2):
    num1*=num2
    return num1

def div(num1,num2):
    num1/=num2
    return num1

opc = ""
while opc != "0":
    print "\n#### MENU ####"
    print "1-Sumar"
    print "2-Restar"
    print "3-Multiplicación"
    print "4-División\n"
    print "0-Salir"
    opc=raw_input("Elige una opción: ")

    if opc=="0":
        os.system("clear")
        print "=====Adiós!!!!====="
        sys.exit()
        
    os.system("clear")
    A = int(raw_input("Introduce el primer numero: "))
    B = int(raw_input("Introduce el segundo numero: "))


    if opc=="1":
        os.system("clear")
        print "==SUMA=="
        print "Resultado: ", suma(A,B)

    elif opc=="2":
        os.system("clear")
        print "==RESTA=="
        print "Resultado: ",resta(A,B)

    elif opc=="3":
        os.system("clear")
        print "==MULTIPLICACION=="
        print"Resultado: ", mult(A,B)

    elif opc=="4":
        os.system("clear")
        print "==DIVISION=="

        try:
            print "Resultado: ", div(A,B)
        except ZeroDivisionError:
            print "No puedes dividir entre zero einstein!!"
        except:
            print "algo esta mal :("
    else:
        os.system("clear")
        print "oops, No es la llama que buscas..."
        print "==Code: Opción erronea=="
