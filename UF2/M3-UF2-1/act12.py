nota=[]
nota2=[]

num1 = int(raw_input("introduce un numero positivo "))
num2 = int(raw_input("introduce otro numero positivo "))

for i in range(num1,num1+10,1):
    nota.append(i)

for i in range(num2,num2+10,1):
    nota2.append(i)

print "INICIAL1:",
for i in range (0, num1+9,1):
	if i<len(nota)-1:
		print str(nota[i])+",",
	else:
		print nota[i]

print ""

print "INICIAL2:",
for i in range (0, num2+9,1):
	if i<len(nota2)-1:
		print str(nota2[i])+",",
	else:
		print nota2[i]
