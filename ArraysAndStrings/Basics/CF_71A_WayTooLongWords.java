package ArraysAndStrings.Basics;
/* https://codeforces.com/problemset/problem/71/A */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF_71A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++)
            words.add(sc.next());

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if(word.length() > 10){
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
            }
            else
                System.out.println(word);
        }
        sc.close();
    }
}