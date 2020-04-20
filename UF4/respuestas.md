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
1 instancies

-I fins la línia 9?
2 instancies

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



-- PREGUNTES EX 6

--Què passa si intentes executar el següent codi a UsaGatPersa? perquè creus?
te da error por que la variable vidas esta encapsulada y no puede ser vista desde un programa exterior, a menos que lo hagas con un metodo getter.

--Què s'està declarant a la línia 3? Així, que pot voler dir mètode en notació POO?
un metodo getter para devolver el valor de la variable vida.

--Indica quina sortida genera el següent main() i explica perquè és aquesta?

Al gat Renat li queden 7 vides
Al gat Renat li queden 7 vides -> por que no entra en la condicion del metodo main() -> if (vides >= 0) {this.vides = vides;}
Al gat Renat li queden 12 vides

--Amb aquesta definició, és possible fer que, a partir d'una instància de GatPersa, el nombre de vides estigui malament? Perquè o Com?
#######

                                - - PREGUNTES EX 7 - - 
--Crea els mètodes setters i getters necessaris per garantir que l'estat del Persa sigui sempre correcte, a l'hora que pugui ser canviat.

public class GatPersa {
    private String estat;

    public String getestat() { // mètode que retorna el nombre de vides
        return estat;
    }

    public void setestat(String estat) {
        switch(estat){ 
            case "parado":
                this.estat = "parado"; 
				break; 
            case "acostado":
                this.estat = "acostado";
                break;

            case "sentado":
                this.estat = "sentado";
				break; 
			default: 
                this.estat = "ERROR: estado incorrecto!"; 
		} 
    }

}

-- Crea un main() que demostri el funcionament dels nous mètodes.

renat.setestat("acostado");
System.out.println("El gato persa ahora esta " + renat.getestat());




