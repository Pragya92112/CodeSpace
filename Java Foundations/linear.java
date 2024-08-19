import java.util.*;
class HelloWorld {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,t,j,i,p;
        System.out.println("enter value of n");
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i=i+1)
        {
        System.out.println("enter value");
        a[i]=sc.nextInt();
    }
    System.out.println("enter value to be search");
        t=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(t==a[i])
       {
    System.out.println("Element found at "+a[i]);
}
    else{
    System.out.println("Not found");
}
}
}
}
