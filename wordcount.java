import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordcount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().trim();

        if (input.equals("")) {
            System.out.println(0);
        } else {
            String[] words = input.split(" ");
            System.out.println(words.length);
        }
    }
}
