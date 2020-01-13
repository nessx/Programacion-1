#! /usr/bin/env python
# encoding: utf-8
# Programita 1

print "Mates varias"
A = raw_input("Introduce el precio del producto:")
A= float(A) 
IVA = 21*A/100
IMP = IVA + A
print "IVA 21% ", IVA,"€"
print "Cantidad a pagar", IMP,"€"

