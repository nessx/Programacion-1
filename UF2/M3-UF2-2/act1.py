import os

def hora():
    while seg > 50:
        if seg > 59:
            seg -= 60
            min +=1
        elif min > 59:
            min = -60
            horas +=1

def impr():
    print "====== CONVERSOR ======\n"
    print "1. Conversor de Segundos a Horas Minutos y Segundos"
    print "2. Conversor de Horas Minutos y Segundos a Segundos"
    print "3. Salir\n"
    return

key = 1
impr()
opc=int(raw_input("Que desea hacer?: "))
while key != 2:
    if opc == 1:
        seg = int(raw_input("Indroduce los segundos: "))
        hora()
        print "Horas", hora(horas),"minutos",hora(min),"segundos",hora(seg)

    elif opc == 2:
        print "operaciones"
    elif opc == 3:
       key = 2
    else:
        os.system("clear")
        print "\n###### La opcion selecionada no pertenece a ninguna operacion :) ######\n"
        impr()
        opc=int(raw_input("\nQue desea hacer?: "))
