public class ReverseWordAndSentence {
    public static void main(String[] args) {
        String str = "I love java programming";
        reverseSentence(str);
        reverseWordInSentence(str);
    }

    private static void reverseWordInSentence(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    private static String reverseSentence(String str) {
        String[] s = str.split(" ");
        String str2 = "";
        for (int i = s.length - 1; i >= 0; i--) {
            str2 = str2 + s[i] + " ";
        }
        System.out.println("Reverse of Sentence  : " + str2);
        return str2;
    }
}
