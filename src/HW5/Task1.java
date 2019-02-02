package HW5;

public class Task1 {

    public static void main(String[] args) {
        String string = "а роза упала на лапу Азора";
        System.out.println(isPalindrome(string));

    }

    public static boolean isPalindrome(String string){
        String clearString = string
                .replace(" ","")
                .replace(".","")
                .replace(",","")
                .replace("!","")
                .replace("?","")
                .toLowerCase();
        int n = clearString.length();
        for (int i = 0; i < (n/2); ++i) {
            if (clearString.charAt(i) != clearString.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
