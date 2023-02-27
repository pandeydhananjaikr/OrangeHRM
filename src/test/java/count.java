import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count {
    public static void main(String[] args) {
        String input = "Hello World!";
        Map<Character, Integer> charCount = new HashMap<>();
        Pattern pattern = Pattern.compile("(?s)(.)"); // match any character (including newline)
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            char c = matcher.group(1).charAt(0);
            int count = charCount.getOrDefault(c, 0);
            charCount.put(c, count + 1);
        }
        System.out.println(charCount);
    }
}