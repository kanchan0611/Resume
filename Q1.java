import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scan.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i] = '$';
            }
	
        }
        String str=new String(chars);
        System.out.println(str);
    }
}

