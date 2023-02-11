import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode {
public class Result {
public final String output1;
public final String output2;
public final String output3;

public Result(String out1, String out2, String out3) {
output1 = out1;
output2 = out2;
output3 = out3;
}
}
public Result encodeThreeStrings(String input1, String
input2, String input3) {

String array1[] = new String[3];
String array2[] = new String[3];
String array3[] = new String[3];
array1 = getparts(input1);
array2 = getparts(input2);
array3 = getparts(input3);
String output1 = "";
String output2 = "";
output1 = array1[0] + array2[0] + array3[0];
output2 = array1[1] + array2[1] + array3[1];
StringBuilder output3 = new StringBuilder(array1[2] +

array2[2] + array3[2]);

for (int i = 0; i < output3.length(); i++) {
if (Character.isUpperCase(output3.charAt(i))) {
output3.setCharAt(i,
Character.toLowerCase(output3.charAt(i)));

} else {
output3.setCharAt(i,
Character.toUpperCase(output3.charAt(i)));

}
}