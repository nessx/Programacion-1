#!/bin/bash

. funciones.sh

option=0
while [ $option != 4 ]; do
	clear
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
	salto
	read -p "Selecciona una opción: " option
	clear
	funLinea
	echo "=== 1.GESTION DE USUARIOS Y GRUPOS  ==="
	case $option in
		1)
			funLinea
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
	esac
	case $option in
		1)
			funLinea
			echo "=== 1.AÑADIR UN USUARIO"
			salto
			addgroup
	esac
	case $option in 
		2)
			funLinea
			echo "=== 2.AÑADIR UN GRUPO ==="
			salto
			adduser
	esac
	case $option in
		3)
			funLinea
			echo "=== 3.MODIFICAR USUARIO ==="
			salto
			modgroup
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