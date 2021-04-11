import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        StringBuilder sb = new StringBuilder();
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            sb.append(s).append("\n");
        }
        char[] chars = sb.toString().toCharArray();
        String word = "the";
        int count = 0, index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.toLowerCase(chars[i]) == word.charAt(index)) {
                index++;
            } else {
                index = 0;
            }
            if (index == 3) {
                count++;
                index = 0;
            }
        }
        System.out.println("The occurrence of sub-string 'The' in string:\n" + sb.toString() + "\nis: " + count);
    }
}