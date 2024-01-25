# Print Ganesha Crown
for i in range(1,5):
    for j in range(i,9):
        print(" ", end='')
    for k in range((2*i)-1):
        print("*",end='')
    print()

# Print Ganesha Ear and Mouth
for i in range(4):
    for j in range(i):
        print(" ",end='')
    for j in range(i,4):
        print("#",end='')
    for j in range(1, 8):
        if(j == 1):
            print(" @", end='')
        elif (j == 7):
            print("@ ", end='')
        else:
            print("@",end='')
    for j in range(i, 4):
        print("#",end='')
    print()

# Print Ganesha trunk
for i in range(2):
    for j in range(7):
        print(" ", end="")
    for j in range(4):
        print("@", end="")
    print()

# Print Ganesha next trunk
for i in range(3):
    for j in range(i+8):
        print(" ",end='')
    for k in range(3):
        print("@", end="")
    print()

# Print Ganesha next trunk
for i in range(2):
    for j in range(i+11):
        print(" ", end="")
    for k in range(2):
        print("@", end="")
    print()

# Print Ganesha last single trunk
for j in range(14):
    print(" ", end="")
print("@")
