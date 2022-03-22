print("Q1")
n = int(input("Digite q quantidade de vezes"))
while n>0:
    base = int(input("Digite a base"))
    altura = int(input("Digite a altura"))
    print("Area vale",base*altura)
    print("Perimetro vale", (2*base) + (2*altura))
    n = n-1
for i in zip(range(0,n)):
    base = int(input("Digite a base"))
    altura = int(input("Digite a altura"))
    print("Area vale",base*altura)
    print("Perimetro vale", (2*base) + (2*altura))
