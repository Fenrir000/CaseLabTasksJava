package CaseLabTasks;

public class CaseLabTask3_2 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Caselab   balesaC"));//true
        System.out.println(isPalindromeExcludingSpaces("Caselab bal e s AC"));//true

        System.out.println(isPalindrome("Caselab   balesac"));//false
        System.out.println(isPalindromeExcludingSpaces("Caselab bal e s* AC"));//false

    }

    //Метод, который проверяет является ли строка палиндромом по любым символам с учетом регистра
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    //Метод, который проверяет является ли строка палиндромом по любым символам, кроме пробела без учета регистра
    public static boolean isPalindromeExcludingSpaces(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (s.charAt(left) == ' ' && left < right) {
                left++;
            }
            while (s.charAt(right) == ' ' && left < right) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
