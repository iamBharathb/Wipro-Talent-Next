import java.util.Scanner;
class DecreasingSequence {
public class Result {
public final int OUTPUT1;
public final int OUTPUT2;
public Result(int out1, int out2) {
OUTPUT1 = out1;
OUTPUT2 = out2;
}
}
public Result decreasingSeq(int input1[], int input2) {
int decreaseCount = 0;
int LongCount = 0;
int SpikeCount = 0;
boolean flag = false;
for (int i = 0; i < input2 - 1; i++) {
if (input1[i] > input1[i + 1]) {
if (flag == false) {
flag = true;
SpikeCount++;
}
decreaseCount++;
LongCount = decreaseCount > LongCount ?

decreaseCount : LongCount;

}
else
{
if(flag==true)
{
flag=false;
decreaseCount=0;
}
}
}
if(SpikeCount>0)
LongCount++;
return new Result(SpikeCount, LongCount);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int array[] = { 11, 3, 1, 4, 7, 8, 12, 2, 3, 7 };
Result r=new DecreasingSequence().decreasingSeq(array,

array.length);

System.out.println(r.OUTPUT1);
System.out.println(r.OUTPUT2);
}
}