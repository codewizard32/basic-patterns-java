/*  ****
    ***
    **
    *    */

/* Answer */

package PBL.basic.patterns;
import java.util.*;

public class pattern_star2 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. to print star");
    int n = sc.nextInt();
    for(int i= 1; i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   } 
}
