import java.util.*;
class count{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter any line : ");
        String str = n.nextLine();
        int k=0;
        String[] arr= str.split(" ");
        for(int i=0; i<arr.length; i++){
            k++;                
            }
            System.out.println("No. of words in a the given line is : "+k);
        }
    }