import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class alphabet_count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Set<Character> set = new HashSet<>();

        char[] word = input.toLowerCase().toCharArray();

        for (char w : word) {
            if (Character.isLetter(w)){
                set.add(w);
            }
        }
        System.out.println(set.size());
    }
}
