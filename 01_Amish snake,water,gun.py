import random
comp=random.randint(1,3)

a=int(input
('''Selected (1) for snake:
selected (2) for water:
selected (3) for gun:\n'''))

if comp==1:
     print("comp selcted snake")
elif comp==2:
     print("comp selected water")
elif comp==3:
     print("comp selected gun")


def amish():

     if comp ==a:
          print("tie")


     elif comp ==1:
          if a==2:
               print(" you loosed")
          elif a==3:
               print(" you win")


     elif comp ==2:
          if a==1:
               print(" you Win")
          elif a==3:
               print(" you loosed")

     else:
          if a==2:
               print(" you Winner")
          elif a==1:
               print(" you loosed")


amish()