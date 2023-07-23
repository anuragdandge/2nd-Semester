#!/bin/bash
read -p "Enter first number : " num1
read -p "Enter second number : " num2

echo "Before Swapping First Number = $num1 and Second Number = $num2 "

temp=$num1
num1=$num2
num2=$temp

echo "After Swapping First Number = $num1 and Second Number = $num2 "
