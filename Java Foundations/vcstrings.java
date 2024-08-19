import java.util.*;
class string{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        String str;
        int l=0, v=0, c=0;
        System.out.println("Enter a string :");
        str=n.nextLine();
        str = str.toLowerCase();
        l=str.length();
        for(int i=0; i<l; i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                v++;
            }
            else if(str.charAt(i)>'a' && str.charAt(i)<='z'){
                c++;
            }
        }
        System.out.println("Number of vowel : " + v);
        System.out.println("Number of consonant : " + c);
    }
}