from math import factorial
import math

print("que operacion desdea hacer \n1: suma\n2: resta\n3: mutiplicacion\n4: division\n5: factorial")
print("nuevas operaciones \n6: calculo de porcentaje\n7: calculo de hipotenusa")

opcion=int(input())
if(opcion==1):
    print("ingrese los numeros a sumar")
    numero1=int(input())
    numero2=int(input())
    print("la sum da como resultado: ",(numero1+numero2))

if(opcion==2):
    print("ingrese los numeros a restar")
    numero1=int(input())
    numero2=int(input())
    print("la resta da como resultado: ",(numero1-numero2))
    

if(opcion==3):
    print("ingrese los numeros a multiplicar")
    numero1=int(input())
    numero2=int(input())
    print("la multiplicacion da como resultado: ",(numero1*numero2))

if(opcion==4):
    print("ingrese los numeros a dividir")
    numero1=int(input())
    numero2=int(input())
    print("la division da como resultado: ",(numero1/numero2))

if(opcion==5):
    print("que numero desea que calculen el factorial")
    numero=int(input())
    print("la division da como resultado: ",factorial(numero))

if(opcion==6):
    print("ingrese los numeros para el calculo de porcentaje el primero debe ser el el 100")
    numero=int(input())
    numero1=int(input())
    
    print("el valor porcentual es ", ((100*numero1)/numero))

if(opcion==7):
    print("ingrese la medida del cateto opuesto y del cateto adyacente")
    numero=int(input())
    numero1=int(input())
    numero=numero**2
    numero1=numero1**2
    total=math.sqrt(numero+numero1)
    print("la division da como resultado: ",total)