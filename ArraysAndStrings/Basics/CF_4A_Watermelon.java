package ArraysAndStrings.Basics;
/* https://codeforces.com/problemset/problem/4/A */
import java.util.*;
public class CF_4A_Watermelon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w = sc.nextInt();
        System.out.println(w % 2 == 0 && w != 2 ? "YES" : "NO");
        sc.close();
    }
}