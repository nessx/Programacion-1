import csv
 
with open('01001c.csv') as File:
    reader = csv.reader(File, delimiter=',')
    for row in reader:
		lista = row[0]
		lista1 = row[1]
		#lista2 = row[2]
		print lista,"|",lista1,"|"
