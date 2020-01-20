#!/usr/bin/env python
# -*- coding: utf-8 -*-

num = input("Introduce un número: ")
num = int(num)
if num == 0:
    print ("Este número es par.")
elif num%2 == 0:
    print ("Este numero es par")
else:
    print ("Este numero es impar")