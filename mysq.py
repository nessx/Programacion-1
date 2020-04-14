import mysql.connector

mydb = mysql.connector.connect(
  host="binariorp.es",
  user="nestor",
  passwd="santana13",
  database="nestor"
)

mycursor = mydb.cursor()

mycursor.execute("SELECT * FROM jugadores")

myresult = mycursor.fetchall()

for x in myresult:
  print(x)