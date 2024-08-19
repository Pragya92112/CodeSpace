class binary
{
public static void main(String args[])
{
int a[11]={2,4,7,12,14,17,23,25,35,41,47};
System.out.println("Enter the element to be searched: ");
{
int es= Integer.parseInt(x.readLine());
}
for(int i=0;i<11;i++)
while(lp>fp)
mid=(fp+lp)/2;
{
if(mid>es)
lp=mid-1;
else if(mid<es)
fp=mid+1;
else
l=-1;
}
if(l==-1)
System.out.println("Element not found");
else
System.out.println("Element is present");
}
}


