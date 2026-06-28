/* https://codeforces.com/problemset/problem/118/A */
package ArraysAndStrings.Basics;
import java.util.Scanner;
public class CF_118_A_StringTask  {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(String.valueOf(ch).matches("[aeiouAEIOU]")) {
                continue;
            }
            else{
                sb.append(".");
                sb.append(Character.isUpperCase(ch)?(char)(ch + 32):ch);
            }
        }
        System.out.println(sb.toString());
    }
}