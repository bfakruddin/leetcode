package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean op = palindromeNumber.isPalindrome(1010101);
        System.out.println(op);
    }

    public boolean isPalindrome(int x) {
        int opN = x ;
//        int length = String.valueOf(x).length();
//        String ip = String.valueOf(x).substring(0, length/2);
        String ip = String.valueOf(x);
        String op = "";
        String revNum = "";
        if (x<0){
            return false;
        }
        for (int i=0; i<ip.length(); i++){
            revNum = String.valueOf(opN%10);
            opN = (opN/10);
            op = op + revNum;
        }

        System.out.println(op);

        return ip.equals(op);
    }
}
