import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        StringBuilder sb = new StringBuilder();
        String s = scan.nextLine();
        sb.append(s);
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            sb.append("\n").append(s);
        }
        char[] chars = sb.toString().toCharArray();
        int count = 0, lastFoundAt = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                if (i == 0) continue;
                count++;
                lastFoundAt = i;
            }
        }
        if (lastFoundAt < chars.length - 1)
            count++;
        System.out.println("The numbers of line(s) in string:\n" + sb.toString() + "\nis: " + count);
    }
}
