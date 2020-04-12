#!/bin/bash
#ndndndnn

#SIMPLEMENTE TE DA LA FECHA
DIA=`date +"%d/%m/%Y"`

#FUNCION QUE SIRVE PARA AÑADIR LINEAS
function funLinea {
        echo '------------------------------------------------'
}

#FUNCION QUE SIRVE PARA AÑADIR SALTOS DE LINEAS
function salto {
        echo -e "\n"
}

function menu{
	funLinea
	echo "=== 1.GESTION DE USUARIOS Y GRUPOS  ==="
	salto
	echo "1.Añadir un usuario"
	echo "2.Añadir un grupo"
	echo "3.Modificar un usuario"
	echo "4.Modificar un grupo"
	echo "5.Eliminar un usuario"
	echo "6.Eliminar un grupo"
	echo "7.Lista de los usuarios del sistema"
	echo "8.Lista de los usuarios del grupo"
	echo "9.Cargar usuarios de manera masiva"
	echo "10.Volver"
	salto
	read -p "Selecciona una opción: " opt
	funLinea
	case $opt in
			1)
				funLinea
				echo "=== 1.AÑADIR USUARIOS  ==="
				salto
				adduser
				;;

			2)
				funLinea
				echo "=== 2.AÑADIR UN GRUPO  ==="
				salto
				addgroup
				;;

			3)
				funLinea
				echo "=== 3.MODIFICAR UN USUARIO  ==="
				salto
				moduser
				;;
			4)
				funLinea
				echo "=== 4.MODIFICAR UN GRUPO  ==="
				salto
				modgroup
				;;
			5)
				funLinea
				echo "=== 5.ELIMINAR USUARIO  ==="
				salto
				userdel $USER
				;;
			6)
				funLinea
				echo "=== 6.ELIMINAR GRUPO  ==="
				salto
				read -p "Introduce el nombre del grupo que desea eliminar: " gru
				groupdel $gru
				;;
			7)
				funLinea
				echo "=== 7.LISTA DE USUARIOS DEL SISTEMA  ==="
				salto
				cut -d: -f1 /etc/passwd
				;;
			8)
				funLinea
				echo "=== 8.LISTA DE USUARIOS DE UN GRUPO  ==="
				salto
				cat /etc/group | cut -d":" -f1
				;;
			9)
				funLinea
				echo "=== 9.CARGAR USUARIOS DE MANERA MASIVA ==="
				salto
				while read line
				do 
					username=$( echo $line |cut -d "," -f 1)
					grup=$( echo $line |cut -d "," -f 2)
					dataNaixement=$( echo $line |cut -d "," -f 3)
					ciutat=$( echo $line |cut -d "," -f 4)
					telefon=$( echo $line |cut -d "," -f 5)
					email=$( echo $line |cut -d "," -f 6)
					password=$( echo $line |cut -d "," -f 7)
				echo $username $grup $dataNaixement $ciutat $telefon $email $password
				done < users.csv
				;;
	esac
}

function dir{
	case $op3 in
	1)
		echo "1.=== Nombre del fichero ==="
		read nomfitxero
		echo "-- Extencion del fichero"
		funLinea
		read extefitxero
		touch $nomfitxero.$extefitxero
		;;
	2)
		echo "2.=== Leer fichero ==="
		read leerfitxero
		funLinea
		less $leerfitxero
		;;
	3)
		echo "3.=== Nombre del fichero a eliminar ==="
		funLinea
		read eliminarfixero
		rm $eliminarfitxero
		;;
	4)
		echo "4.=== Cambio de permisos a fichero ==="
		echo "-- Indique el fichero(con la extension de fichero)"
		read $permisosfitxero
		echo "-- Ejemplos de permisos"
		echo "-- 600 | El propietario puede leer y escribir."
		echo "-- 644 | El propietario puede leer y escribir, el grupo y otros pueden leer."
		echo "-- 666 | El propietario, el grupo y otros pueden leer y escribir."
		echo "-- 700 | El propietario puede leer, escribir y ejecutar, el grupo y otros no pueden hacer nada con el archivo."
		echo "-- 711 | El propietario puede leer, escribir y ejecutar, el grupo y otros pueden ejecutar."
		echo "-- 755 | El propietario puede leer, escribir y ejecutar, el grupo y otros pueden leer y ejecutar."
		echo "-- 777 | El propietario, el grupo y otros pueden leer, escribir y ejecutar."
		funLinea
		read permisos
		chmod $permisos $permisosfitxero
		;;
	5)
		echo "5.=== Asignar fichero/directorio a un usuario ==="
		echo "-- Indica que nombre del fichero/directorio"
		read asigfitxero
		echo "-- Indique el usuario al cual le quiere asignar"
		funLinea
		read asigusuario
		chown $asigusuario $asigfitxero
		;;
	6)
		echo "6.===Asignar fichero/directorio a un grupo ==="
		echo "-- Indicaque nombre del fichero/directorio"
		read asigfitxero2
		echo "-- Indica el grupo al cual le quiere assignar"
		funLinea
		read asigrupo
		chown :$asigrupo $asigfitxero2
		;;
	7)
		echo "7.=== Ver mascara ==="
		funLinea
		umask
		;;
	8)
		echo "8.=== Cambiar mascara ==="
		funLinea
		read mascara
		umask $mascara
		;;
	9)
		echo "9.=== Crear un directorio ==="
		echo "-- Indica el nombre del directorio"
		funLinea
		read creardirectorio
		mkdir $creardirectorio
		;;
	10)
		echo "10.===Mover un directorio ==="
		echo "-- Indica el directorio"
		read mvdirectorio
		echo "-- Indica la ruta del nuevo directorio"
		read rutadirectorio
		echo "-- Indica el nombre del directorio donde se movera"
		funLinea
		read nombredirectoriomv
		cp $mvdirectorio $rutadirectorio/$nombredirectoriomv
		;;
	11)
		echo "11.=== Eliminar direectorio ==="
		echo "-- Indica el nombre del directorio"
		funLinea
		read rmdirectorio
		rm -r $rmdirectorio
		;;
	12)
		echo "12.=== Ver detalle del directorio ==="
		funLinea
		ls -l
		;;
esac
}

#FUNCION QUE SIRVE PARA AÑADIR GRUPOS
function addgroup {
	read -p "Introduce el nombre del grupo que desea añadir: " opt
	if [ $( getent passwd $opt ) ]
	then
		echo "El grupo ya existe!"
	else
		echo "El grupo no existe, creando grupo..."
		groupadd $opt
		sleep 1
	fi
}

#FUNCION QUE SIRVE PARA AÑADIR USUARIOS
function adduser {
	read -p "Introduce el nombre de usuario que desea añadir: " opt
	if [$( getent passwd $opt ) ]
	then
		echo "El usuario ya existe"
	else
		echo "El usuario no existe, creando usuario..."
		useradd $opt
		sleep 1
	fi
}

#FUNCION QUE SIRVE PARA MODIFICAR USUARIOS
function moduser {
	read -p "Introduce el nombre del usuario que quieres modificar: " opt
	if [ $( getent passwd $opt )]
	then
		funLinea
		echo "1. Modificar el comentario del usuario"
		echo "2. Modificar el direcorio de trabajo o Home del usuario"
		echo "3. Modificar fecha de expiracion de la cuenta. (Formato AAAA-MM-DD"
		echo "4. Modificar otros grupos a los que puede formar parte el usuario (separado por comas)"
		echo "5. Cambiar nombre de usuario"
		echo "6. Bloquear la cuenta del usuario"
		echo "7. Desbloquear cuenta de usuario"
		echo "8. Modificar la contraseña del usuario"
		echo "9. Volver"
		funLinea
		salto
		read -p "Selecciona una opcion: " opt

		case $opt in 
			1)
				read -p "Introduce el nuevo comentario" comment
				usermod -c $comment $opt
				echo "Cambiando comentario..."
				sleep 1
				;;
			2)
				read -p "Introduce el nuevo directorio de trabajo" dir
				usermod -d $dir $opt
				echo "cambiando el directorio"
				sleep 1
				;;
			3)
				read -p "Introduce la nueva fecha de expiración del usuario" data
				usermod -e $data $opt
				sleep 1
				echo "Cambiando fecha de expiracion del usuario"
				;;
			4)
				read -p "Introduce los grupos a los que quieres que pertenezca en usuario. (separado por comas)" group
				usermod -G $group $opt
				echo "cambiando usuario de grupo"
				;;
			5)
				read -p "Introduce el nuevo nombre que desea asignarle al usuario" newname
				usermod -l $newname $opt
				echo "cambiando nombre del usuario"
				;;
			6)
				echo "Bloquear nombre de usuario. *[AVISO]Con esta opcion bloquearas tu usuario*"
				usermod -L $opt
				echo "bloqueando usuario"
				;;
			7)




}

#FUNCION QUE SIRVE PARA MODIFICAR GRUPOS
function modgroup {

}
