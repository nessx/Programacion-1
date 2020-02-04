def nums(a,b,c,d):
    return max(a*b, a*c, a*d, d*b, d*c, c*b)

array = []
for i in range (0, 4 ,1):
    array.append(int(raw_input("Ingrese un numero: ")))
    array=nums(array)


