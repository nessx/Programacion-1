def nums(a,b,c,d):
    return max(a*b, a*c, a*d, d*b, d*c, c*b)

array = []
#for i in range (0, 4 ,1):
#    array.append(int(raw_input("Ingrese un numero: ")))
#    array=nums(array)
    
#print array

a = int(raw_input("Ingrese un numero: "))
b = int(raw_input("Ingrese un numero: "))
c = int(raw_input("Ingrese un numero: "))
d = int(raw_input("Ingrese un numero: "))

str(a,b,c,d) = nums(str(a,b,c,d))
