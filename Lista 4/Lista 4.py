import math
print ("Q2")

for i in range(0,10):
    print("Quadrado de ",i,"vale",math.pow(i,2))
    print("Cubo de ",i,"vale",math.pow(i,3))
"""
print ("Q3")    
for i in range(9,-1,-1):
    for j in range(59,-1,-1):
        if j>=10 and j<=59 :
            print(i,":",j)

        elif j<10 and j>=0:
            print(i,":0",j)

"""
print ("Q4")
number = int(input("Digite o numero"))
incr = 0
i = 1
while i<=number:
    if(number % i == 0):
        incr= incr + 1
    i=i+1    

if(incr== 2):
    print("Numero primo")
else:
    print("Numero nao primo")

    
print ("Q10")

nome = input("Digite o nome")
idade = int(input("Digite a idade"))
sexo = input("Digite o sexo")
estado = (input("Digite o estado"))
olhos= (input("Digite a cor dos olhos"))
cabelo = (input("Digite a cor do cabelo"))
salario = float(input("Digite o salario"))
