 -- PREGUNTES EX 1

-Quin ha de ser el nom del fitxer que contingui aquest codi perquè funcioni?
GatPersa.java

-A quina línia està declarada la variable renat que apareix a la línia 6?
En la línea 4

-A quina línia s'assigna el valor que es mostra per pantalla?
En la línea 2

-Quin valor apareix si a aquesta línia no s'assigna cap valor?
0 vides
-Què passaria sí la línia 5 no hi fos? Perquè creus?
No imprimirá nada ya que la variable “renat” no está inicializada.

-Perquè creus que el comentari de la línia 4 parla de referència?
la referencia indica donde está el objeto en la memoria, también podemos asignar una referencia a un objeto.

-La línia 5 parla d'instància. En aquest context, una instància es pot entendre com el contingut real al que fa referència la variable renat. Es diu que la instància es construeix amb l'operador new i això implica bàsicament que es reserva espai de memòria per a allotjar tota la informació relativa a la instància.

-- PREGUNTES EX 2

-Com podem consultar (llegir, obtenir) el valor d'una propietat de la instància?
llamando a la propiedad instanciada junto con la variable -> system.out.print(propiedad.variable);

-Com podem canviar (escriure, assignar) el valor d'una propietat de la instància?
propiedad.variable = propiedad.variable y las operaciones junto con el valor que quieres añadir o quitar

-És possible indicar que el gat Persa té -12 vides? Com? És quelcom desitjable que pugui passar?
 renat.vides=-12;, pero se puede evitar encapsulando la variable vidas, el el main principal con "private int vidas = 7;"



-- PREGUNTES EX 3

-Quanta memòria ocupa, com a mínim, una instància de GatPersa?

-Quantes instàncies hi ha de GatPersa tot just executat el codi fins la línia 5 (inclosa)?
1 instancies.

-I fins la línia 6?
2 instancies

-I fins la línia 9?
3 instancies

-Perquè les línies 7 i 10 mostren les mateixes vides pels gats Renat I i Renat II?
por que aunque sean gatos diferentes las instancias están invocando a la misma variable “instancia.variable”.

-Perquè les línies 13 i 14 mostren diferent nombre de vides pels gats Renat I i Renat II?
por que en la línea 12 se añade un sumador de vida para el objeto “renat_I.vides++”

-Què creus que vol dir el comentari de la línia 16?

-Perquè les línies 17 i 18 mostren les mateixes vides pels gats Renat I i Renat II?
por que en la linea 16 al objeto “renat_II” es le das el valor del objeto ”renat_I”, que en la linea 12 ha subido el valor.

-Perquè les línies 21 i 22 mostren les mateixes vides pels gats Renat I i Renat II malgrat la instrucció de la línia 20?
por que en la linea 16 ya le estas dando el valor del gato 1 al 2.

-Quantes instàncies hi ha quan s'executa la l'linia 20? Perquè?
2 por que el gato 2 coje el valor del gato 1.



-- PREGUNTES EX 4
-Quin és el nom del fitxer on està definit el punt d'entrada main() d'aquest programa?
UsaGatPersa.java

-Ara tenim dos fitxers amb main(). Com pot saber Java quin és el main() a executar?
#######

-A quin fitxer està definida la classe del gat Persa?
GatPersa.java

-Quants programes es podrien construir fent ús de la definició del gat Persa?
los que quieras :).

-Què passaria si el fitxer amb el codi anterior i el que conté la definició de la classe del Persa estiguessin en directoris diferents? (prova-ho!)
no funcionaria.

-Elimina el main() de GatPersa. Continua funcionant UsaGatPersa? Què ha deixat de poder-se executar?
si sigue funcionando, ha dejado de ejecutarse las impresiones y no se han instanciado objetos.

-- PREGUNTES EX 5