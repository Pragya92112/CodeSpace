import java.util.*;
class binary
{
 public static void main(String args[])
{
int fp=0,lp=0,mid;
int es=25;
int a[]={2,4,7,12,14,17,23,25,35,41,47};
for(int i=0;i<11;i++)
while(lp>=fp){
mid=(fp+lp)/2;
{
 if (a[mid]==es)
return mid;
else if(a[mid]>es)
lp=mid-1;
else 
fp=mid+1;
}
bubble ob=new bubble();
int n=a.length();
int result=ob.binary(a,0,n-1,es);
System.out.println("The location of 25 is "+result);
}
}
}