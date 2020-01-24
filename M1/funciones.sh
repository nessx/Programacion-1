#!/bin/bash

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
