package stringandarrays;

public class StringIsPalindrome {
    private static boolean isPalindrom(String str) {
        char[] charArray = str.toCharArray();
        int start = 0, end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String madam = "madam";
        String that = "that";
        System.out.println(isPalindrom(madam));
        System.out.println(isPalindrom(that));
    }


}
