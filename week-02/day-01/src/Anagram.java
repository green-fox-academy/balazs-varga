public class Anagram {

    // Create a function named is anagram following your current language's style guide.
    // It should take two strings and return a boolean value depending on whether its an anagram or not.

    public static void main(String[] args) {
        System.out.println(anagram("fEERaa aaa", "fwewewe wew"));
    }

    public static boolean anagram(String firstWord, String secondWord) {
        boolean isAnagram;

        if (firstWord.length() != secondWord.length()) {
            return false;
        }else

            return true;
        }
    }
