public class MostFrequencyOccuringDigitInASeriesOfNumber {
public static int
mostFrequencyOccuringDigitInASeriesOfNumber(int input1[],int
input2)
{
int max=Integer.MIN_VALUE;
int highestDigit=Integer.MIN_VALUE;
int array[]=new int[10];
for(int i=0;i<input2;i++)
{
while (input1[i]!=0) {
array[input1[i]%10]++;
input1[i]/=10;
}
}
for(int i=0;i<array.length;i++)
{
if(array[i]>=max)
{

max=array[i];
highestDigit=i;
}
}
return highestDigit;
}
public static void main(String[] args) {
int array[]={1237, 202, 666, 140};

System.out.println(mostFrequencyOccuringDigitInASeriesOfNumber(
array, array.length));
}
}