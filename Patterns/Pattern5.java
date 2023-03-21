package Patterns;

/* 
Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
* 
 */
public class Pattern5 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        for(int i=1;i<=row;i++) {
            for(int j=0;j<=row-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
