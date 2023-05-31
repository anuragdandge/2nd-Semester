# 1st Approach
num1=10
num2=20
echo "Addition of $num1+$num2 = $(expr $num1 + $num2 )"


# 2nd Approach
num3=30
num4=40
sum=`expr $num3 + $num4`
echo "Addition of $num3+$num4 = $sum"


#3rd Approach

num5=50
num6=60
sum=$(($num5 + $num6))
echo "Addition of $num5+$num6 = $sum"


#4th Approach

read -p "Enter first Num :" a
read -p "Enter second Num :" b
echo "Addition of $a+$b = $(($a + $b))"