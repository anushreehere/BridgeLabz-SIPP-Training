public class ReplaceWord {
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replaceAll("\\b" + target + "\\b", replacement);
    }

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        System.out.println(replaceWord(sentence, "Java", "Python"));
    }
}
