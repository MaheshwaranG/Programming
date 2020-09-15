
countingValleys () {
pos=-1
valleyCount=0
stepBal=0
while (( pos++ < ${#1} )); do
# char=$(expr substr "$steps" "$pos" 1)
char="${1: $pos : 1}"
if [ "$char" = "D" ] && [ "$stepBal" = 0 ]; then 
    valleyCount=`expr $valleyCount + 1 `
fi

if [ "$char" = "U" ]
then 
    stepBal=`expr $stepBal + 1`
elif [ "$char" = "D" ]
then 
    stepBal=`expr $stepBal - 1`
fi

done
return "$valleyCount"
}

read n
read steps
countingValleys "$steps"
valleyCount=$?
echo "$valleyCount"

# MyString=abcde
# i=0
# while (( i++ < ${#MyString} ))
# do
#    char=$(expr substr "$MyString" $i 1)
#    echo "<$char>"
# done