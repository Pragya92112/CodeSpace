class bubble
{
public static void  main(String args[])
{
int t;
int a[]={15,32,27,31,8,11};
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(int i=0;i<5;i++)
System.out.print(" "+a[i]);
}
}
}
