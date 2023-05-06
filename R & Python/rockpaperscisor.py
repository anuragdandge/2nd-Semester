# x= int(input("Enter Number x = "))
# y= int(input("Enter Number y = "))
# z1 = x + y 
# z2 = x - y 
# z3 = x / y 
# z4 = x * y
# print(z1)
# print(z2)
# print(z3)
# print(z4)


# user1 = input("R,P,S\n")
# user2 = input("R,P,S\n")
# if user1 == "R" and user2 == "S":
#     print("User1 Wins ")
# elif user1 == "R" and user2 == "P":
#     print("User2 Wins ")
# elif user1 == "P" and user2 == "P":
#     print("User1 Wins ")
# elif user1 == "S" and user2 == "R":
#     print("User2 wins")
# else : print(" Invalid ")  


u1 = input(" Enter Choice \n R , P , S ")
u2 = input(" Enter Choice \n R , P , S ")
win_dir =  {"R":"P","S":"P","R":"S"}
if (u1 == u2):
    print("Tie")
elif (u1 == win_dir[u2]):
    print( "Player 1 wins.")
elif (u2 == win_dir[u1]):
    print( "Player 2 wins.")



