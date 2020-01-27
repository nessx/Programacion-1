import os

#### DEVUELVE HORAS SEGUNDOS Y MINUTOS #######
def hora(defs):
    defmin = 0
    defhoras = 0
    while defs > 50:
        if defs > 59:
            defs -= 60
            defmin += 1
        if defmin > 59:
            defmin -= 60
            defhoras += 1
    return defhoras, defmin, defs

#### DEVUELVE SEGUNDOS #######
def segundos(defseg, defmin, defhoras):
    while (defhoras!=0):
        if (defhoras>0):
            defhoras -= 1
            defmin += 60
    while (defmin!=0):
        if (defmin>0):
            defmin -= 1
            defseg += 60
    return defseg

##### IMPRESIONES #######
def impr():
    print "====== CONVERSOR ======\n"
    print "1. Conversor de Segundos a Horas Minutos y Segundos"
    print "2. Conversor de Horas Minutos y Segundos a Segundos"
    print "3. Salir\n"
    return

######DEFINO LAS VARIABLES ######
seg = 0
horas = 0
min = 0
#################################

#LA KEY ES IGUAL A 1 PARA OBLIGAR AL USUARIO A ENTRAR AL WHILE
key = 1
impr()

#PRIMERA PREGUNTA
opc=int(raw_input("Que desea hacer?: "))
#LA SALIDA DEL WHILE
while key != 2:

#OPCION 1
    if opc == 1:
        os.system("clear")
        print "============ DE SEGUNDOS A HORAS MINUTOS Y SEGUNDOS ============= \n"
        s = int(raw_input("Indroduce los segundos: "))
        h,m,s=hora(s)
        print h,":",m,":",s

        key = 2 #para salir del while es provisional
#OPCION 2
    elif opc == 2:
        os.system("clear")
        print "============ DE HORA MINUTOS Y SEGUNDOS A SEGUNDOS ============= \n"
        H = int(raw_input("Indroduce las horas: "))
        M = int(raw_input("Indroduce los minutos: "))
        S = int(raw_input("Indroduce los segundos: "))
        S=segundos(S,M,H)
        print ""
        print S," Segundos"

        key = 2 #para salir del while es provisional
#OPCION 3 
    elif opc == 3:
        os.system("clear")
        print "======== HAS ELEGIDO SALIR ========\n"
        print "ADIOS....\n"
        key = 2

#SI EL USUARIO NO PONE UNA DE LAS TRES OPCIONES LE LANZARA UN ERROR Y LE VONVERA A PREGUNTAR
    else:
        os.system("clear")
        print "------------------------------------------------------------------------------"
        print "\n###### La opcion selecionada no pertenece a ninguna operacion :) ######\n"
        print "------------------------------------------------------------------------------"
        impr()
        opc=int(raw_input("\nQue desea hacer?: "))
