D = int(raw_input("Introduce un numero mas grande que 1: "))
while (D<=0):
	print "ATENCION [",D,"]", "no es un numero mas grande que 1"
	D = int(raw_input("Introduce un numero mas grande que 1: "))
for i in range(D,0, -1):
	for f in range (1, i+1,++1):
		if f == i:
			print str(f)
		else:
			print (str(f)+","),
