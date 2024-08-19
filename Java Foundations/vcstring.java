import java.util.*;
class String
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str;int l=0,v=0,c=0;
System.out.println("Enter a string : ");
str=sc.nextLine();
str=str.toLowerCase();
l=str.length();
for(int i=0;i<l;i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') 
{
v++;
}
else if(str.charAt(i)>'a' && str.charAt(i)<='z')
{
c++;
}
}
System.out.println("Number of vowels:"+v);
System.out.println("Number of consonants:"+c);
}
}


