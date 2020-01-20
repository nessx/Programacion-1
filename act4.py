nota=[]

for i in range(0,100,2):
	nota.append(i)

for i in range (0, 100,1):
	if i<len(nota)-1:
		print str(nota[i])+",",