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
	case $option in
		1)
			funLinea
			echo "=== 1.GESTION DE USUARIOS Y GRUPOS  ==="
			salto
			menu
	esac
	case $option in 
		2)
			funLinea
			echo "=== 2.GESTION DE FICHEROS Y DIRECTORIOS==="
			salto
			funLinea
			echo "1.Nombre del fichero"
			echo "2.Leer fichero"
			echo "3.Nombre del fichero a eliminar"
			echo "4.Cambio de permisos a fichero"
			echo "5.Asignar fichero/directorio a un usuario"
			echo "6.Asignar fichero/directorio a un grupo"
			echo "7.Ver mascara"
			echo "8.Cambiar mascara"
			echo "9.Crear un directorio"
			echo "10.Mover un directorio"
			echo "11.Eliminar direectorio"
			echo "12.Ver detalle del directorio"
			salto
			read -p "Selecciona una opción: " op3
			dir
	esac
	case $option in
		3)
			funLinea
			echo "=== 3.GESTION DE PROGRAMARIO ==="
			salto
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