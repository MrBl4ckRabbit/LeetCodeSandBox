package ransom_note;

public class Main {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            charCount[c - 'a']--;
            if (charCount[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}
