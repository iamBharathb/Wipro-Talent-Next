import java.util.Scanner;
public class SumOfSumsOfDigitsInCyclicOrder {
public static int sumOfSumsOfDigitsInCyclicOrder(int
input1) {

String str = Integer.toString(input1);
int sum = 0;
for (int i = 0; i < str.length(); i++) {
for (int j = i; j < str.length(); j++) {
int num =

Character.getNumericValue(str.charAt(j));

sum += num;
}
}
return sum;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(sumOfSumsOfDigitsInCyclicOrder(n));
}
}