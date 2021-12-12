from math import factorial
opcion=1
while opcion!=0:
    print("que operacion desdea hacer \n1: suma\n2: resta\n3: mutiplicacion\n4: division\n5: factorial\n0: salir")
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
    print("quieres hacer otra operacion \n0:no\n1:si")
    opcion=int(input())


