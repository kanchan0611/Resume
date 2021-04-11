import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scan.nextLine();
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];
        int size = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!isInList(result, chars[i], size)) {
                result[size] = chars[i];
                size++;
            }
        }
        System.out.println(new String(result));
    }

    private static boolean isInList(char[] arr, char ch, int size) {
        for (int i = 0; i < size; i++) {
            if (ch == arr[i])
                return true;
        }
        return false;
    }
}
