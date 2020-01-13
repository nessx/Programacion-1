#! /usr/bin/env python
# encoding: utf-8
# Programita 1

print "se (IVA) y se FUE"
A = raw_input("Introduce el precio del producto:")
A = float(A)
IVA = raw_input("Introduce el IVA del producto:")
IVA = float(IVA) 
IVA = IVA*A/100
IMP = IVA + A
print "IVA 21% ", IVA,"€\n"
print "Cantidad a pagar", IMP,"€"
