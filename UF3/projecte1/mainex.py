import csv
 
with open('01001c.csv') as File:
    reader = csv.reader(File, delimiter=',')
    for row in reader:
		lista = row[0]
		lista1 = row[1]
		lista2 = row[2]
		lista3 = row[3]
		lista4 = row[4]
		lista5 = row[5]
		lista6 = row[6]
		print lista,"|",lista1,"|",lista2,"|",lista3,"|",lista4,"|",lista5,"|",lista6,"|"
