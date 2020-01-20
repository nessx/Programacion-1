nota=[]

for i in range(2,100,2):
	nota.append(i)

for i in range (2, len(nota),1):
	if i<len(nota)-1:
		print str(nota[i])+",",
	else:
		print nota[i]