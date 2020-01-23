nota=[]
cont = 0
n = 0
for i in range(2,100,2):
	nota.append(i)
print "NOTAS INICIALES DE 2 EN 2 SOLO NUMEROS PARES"

print ""

print "INICIAL:",
for i in range (2, len(nota),1):
	if i<len(nota)-1:
		print str(nota[i])+",",
	else:
		print nota[i]

print ""

ins = int(raw_input("Que nota quieres buscar?: "))
print ""

for i in range (0, len(nota)-1,1):
    if nota[i]==ins:
        cont+=1
if cont<1:
    print "La nota no existe!!"
else:
    print ""
    n = nota.index(ins)
    print "La nota",ins, "esta en la posicion:", n-1

print ""