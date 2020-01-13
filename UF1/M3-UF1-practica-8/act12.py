B = int(raw_input("dime un numero: "))
for i in range(0, B, ++1):
	for f in range (i+1,0,-1):
		if f==1:
			print str(f)
		elif f>1:
			print (str(f)+","),


