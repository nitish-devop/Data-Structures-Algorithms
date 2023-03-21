package Patterns;

/* 
Input Format: N = 6
Result:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
 */
public class Pattern6 {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        for(int i=1;i<=row;i++) {
            for(int j=1;j<=row-i+1;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
