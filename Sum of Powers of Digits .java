import java.util.Scanner;
public class SumOfPowerOFDigits {
public static int sumOfPowerOFDigits(int input1)
{
char ch[]=String.valueOf(input1).toCharArray();
int sum=0;
for(int i=0;i<ch.length-1;i++)
{
int x=Integer.parseInt(String.valueOf(ch[i]));
int y=Integer.parseInt(String.valueOf(ch[i+1]));
sum+=Math.pow(x, y);
}
return sum+

(int)Math.pow(Integer.parseInt(String.valueOf(ch[ch.length-
1])), 0);

}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(sumOfPowerOFDigits(n));
}
}