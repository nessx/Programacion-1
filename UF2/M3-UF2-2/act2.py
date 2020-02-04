import os

#### DEVUELVE HORAS SEGUNDOS Y MINUTOS #######
def hora(defhoras, defmin, defs):
    while defs > 50:
        if defs > 59:
            defs -= 60
            defmin += 1
        if defmin > 59:
            defmin -= 60
            defhoras += 1
    return defhoras, defmin, defs

print "========== PROGRAMITA =============\n"

H = int(raw_input("Dame una hora: "))
M = int(raw_input("Dame unos minutos: "))
S = int(raw_input("Dame unos segundos: "))

print "===== BIEN!! ====="

H+ int(raw_input("Dame una hora: "))
M+ int(raw_input("Dame unos minutos: "))
S+ int(raw_input("Dame unos segundos: "))

H,M,S=hora(H,M,S)

print "===== OKEY VAMOS!! ===="

os.system("clear")
print "======= RESULTADO\n ======"
print str(H)+":"+str(M)+":"+str(S)
print ""
print "ADIOS...."

