package ArraysAndStrings.Basics;

import java.util.Scanner;

class CF_96A_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ones = 0,zeroes = 0;
        String sb = "NO";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                zeroes = 0;
                ones++;
                if(ones == 7) {
                    sb = "YES";
                    break;
                }
            }
            else{
                ones = 0;
                zeroes++;
                if(zeroes == 7) {
                    sb = "YES";
                    break;
                }
            }
        }
        System.out.println(sb);
        sc.close();
    }
}