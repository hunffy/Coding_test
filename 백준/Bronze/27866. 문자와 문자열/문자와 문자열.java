import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int i = in.nextInt();
        
        System.out.print(s.charAt(i-1));
    }
}