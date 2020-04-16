import csv
import sys

csvFilename = ""
u=1

if u==9:
  print("csvFilename argument is required.")
  exit()

else:
	
	csvFilename = "01001c"
	htmlFilename = csvFilename + '.html'

	with open(htmlFilename, 'w') as html:

		print("Output: " + htmlFilename)
		print("HTML:")

		with open(csvFilename, 'r') as csvFile:
			
			csvReader = csv.reader(csvFile, delimiter=',')

			headers = []
			
			line_count = 0

			for row in csvReader:

				if line_count == 0:
					headers = row
					line_count+=1

				else:
					
					line = ""
					line += "<"+row[1]  # open tag
					if len(row[0])>0:
						line += " id='"+row[0]+"'"
					line += " class='"
					if len(row[5])>0:
						line += row[5]
					line += "'"
					if len(row[2])>0:
						line += " type='"+row[2]+"'"
					if len(row[3])>0:
						line += " placeholder='"+row[3]+"'"
					if headers[1]=='select':
						if len(row[4])>0:
							line += row[4]
					
					if row[1]=='input':
						line += " />"

					else:

						line += ">"

						if row[1]=='textarea' or row[1]=='button':
							
							if len(row[4])>0:
								line += row[4]

						elif row[1]=='select':
							if len(row[4])>0:
								options = []
								optTextArr = row[4].split(";")
								# print(optTextArr)
								for optText in optTextArr:
									optValLabel = optText.split("=")
									opt = "<option value='"+optValLabel[0]+"'>"+optValLabel[1]+"</option>"
									options.append(opt)
								line += "".join(options)
								
						line += "</"+row[1]+">" # close tag

					print(line)

					html.write(line+'\n')