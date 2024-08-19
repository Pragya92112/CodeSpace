import java.util.*;
class Search
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n,i,e;
System.out.println("Enter the size of array");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter array elements");
a[i]=sc.nextInt();
}
System.out.println("Enter the element to be searched");
e=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==e){
System.out.println("Element found");
break;
}
else {
System.out.println("Element not found");
}
}
}
}

