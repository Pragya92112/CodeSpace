import java.util.*;
class Add
{
public static void main(String[] args)
{
int i,j;
int a[][]={{3,4,5},{3,9,6},{7,8,6}};
int b[][]={{6,8,5},{4,2,8},{6,9,3}};
int c[][]=new int[3][3];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}