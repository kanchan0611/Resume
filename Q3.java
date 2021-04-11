import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scan.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           if((int)chars[i] >= 65 && (int)chars[i] <= 90){
               chars[i] = (char)((int)chars[i] + 32);
           }else if((int)chars[i] >= 97 && (int)chars[i] <= 122){
               chars[i] = (char)((int)chars[i] - 32);
           }
        }
        System.out.println(new String(chars));
    }
}
