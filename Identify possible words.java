import java.io.*;
import java.util.*;
class UserMainCode
{
public String identifyPossibleWords(String input1,String
input2){

String output="";
String array[]=input2.split(":");
int index=input1.indexOf("_");
for(int i=0;i<array.length;i++)
{
if(array[i].length()==input1.length())
{
String test1=array[i].toUpperCase();
char ch[]=test1.toCharArray();
ch[index]='_';
test1=String.valueOf(ch);
String test2=input1.toUpperCase();
if(test2.equals(test1))
{
if(output=="")
{
output+=array[i].toUpperCase();
}
else
{
output+=":"+array[i].toUpperCase();
}
}
}
}

if(output=="")
{
output="ERROR-009";
}
return output;
}
}
public class IdentifyPossibleWords
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
UserMainCode um=new UserMainCode();
System.out.println(um.identifyPossibleWords("Fi_er",
"Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer"));
}
}