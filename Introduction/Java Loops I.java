import java.util.Scanner;
// @AmanEleven

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiply = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", multiply, i , i * multiply);
        }
    }
}



//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
