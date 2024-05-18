import java.util.Scanner;
public class wordcounter {
    public static void main(String[] args) {
         
         int count  = 1;
     String s = new String();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the text");
     s = sc.nextLine();
     if (s.length() ==0){
         System.out.println("no input");;
    }
     
    for ( int i=0; i<s.length()-1; i++){
        char c, d;
        c = s.charAt(i); 
        d = s.charAt(i+1); 

        if ( c == ' ' && d!=' ') { 
            count++;
        }
        
    }
    System.out.println("total number of words  " + count);
     
}
    }
