import csv
 
with open('Crushers.csv') as File:
    reader = csv.reader(File, delimiter=',')
    for row in reader:
		lista = row[0]
		lista1 = row[1]
		lista2 = row[2]
		lista3 = row[3]
		lista4 = row[4]
		lista5 = row[5]
		print lista,",",lista1,",",lista2,",",lista4,",",lista5