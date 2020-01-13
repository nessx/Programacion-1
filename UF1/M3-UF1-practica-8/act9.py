D = int(raw_input("dime un numero: "))
while (D<=0):
	print "error"
	D = int(raw_input("dime un numero: "))

for i in range(0, D, ++1):
	for f in range (1, D+1,++1):
		print f,
	print ""
