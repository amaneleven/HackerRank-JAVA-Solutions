//SOLUTION 1

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String rverse,original;
        original=sc.nextLine();
        rverse= new StringBuilder(original).reverse().toString();
        if (original.equals(rverse))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
  
  
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
  
  //SOLUION 2
  
          Scanner sc=new Scanner(System.in);
        String original , reverse="";
        int i, length;
        original=sc.nextLine();
        length=original.length();
        for (i=length-1;i>=0;i--)
        {
            reverse=reverse + original.charAt(i);
        }
        if (original.equals(reverse))
        {
            System.out.println("Yes");
        }
        else
          
//Author : AmanEleven
//Follow : All Personal and Professional Links Here -->  https://linktr.ee/amaneleven
            System.out.println("No");

    }
}
