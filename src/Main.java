public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("----------------------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("----------------------------------");
        System.out.println(numberToWord(1212));
        System.out.println(numberToWord(-1001));
        System.out.println(numberToWord(1024));
        System.out.println(numberToWord(20568));
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        String reversed = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(num));
    }


    public static boolean isPerfectNumber(int number) {
        if (number > 0) {
            int totalDivisor = 0;
            for (int i = 1; i <= number / 2; i++) {
                int reminder = number % i;
                if (reminder == 0) {
                    totalDivisor += i;
                }
            }
            return totalDivisor == number;
        } else {
            System.out.println("Number must be over zero");
            return false;
        }
    }

    public static String numberToWord(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Tree ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;

            }

        }
        return numToText.trim();
    }

}