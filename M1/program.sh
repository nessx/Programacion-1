#!/bin/bash

DIA=`date +"%d/%m/%Y"`

function funLinea {
	echo '------------------------------------------------'
}

option=0
while [ $option != 4 ]; do
	funLinea

	echo -e "--\tBienvenido al programa de inicializacion"
	echo -e "--\t"$USER
	echo -e "--\t"$DIA

	funLinea
	echo -e "--\tMenú de opciones"
	echo -e "--\t1.Gestión de usuarios y grupos"
	echo -e "--\t2.Gestión de directorios y ficheros"
	echo -e "--\t3.Gestión de programario"
	echo -e "--\t4.salir"
	funLinea

	read -p "Selecciona una opción: " option

	case $option in
		1)
			funLinea
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

			read -p "Selecciona una opción" opt

			funLinea
	esac
	case $option in
		4)

			funLinea
			echo -e "--\t"
			echo -e "--\tA REVEURE $USER."
			echo -e "--\t"
			funLinea
	esac
done
