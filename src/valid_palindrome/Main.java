package valid_palindrome;

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        // Шаг 1: Очистка строки
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch)); // Оставляем только буквы/цифры в нижнем регистре
            }
        }
        // Шаг 2: Проверка на палиндром
        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();
        return cleaned.equals(reversed); // true, если строка равна перевёрнутой
    }
}
