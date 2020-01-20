nota=[]

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

pos = int(raw_input("En que posicion quieres eliminar: "))
while pos > nota [i]:
    print "Has superado el maximo de posiciones!"
    pos = int(raw_input("En que posicion quieres eliminar: "))
nota.pop(pos+1)

print ""

print "CORRECCION:",
for i in range (2, len(nota),1):
	if i<len(nota)-1:
		print str(nota[i])+",",
	else:
		print nota[i]