import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        pattern17(4);
    }

    static void pattern31(int n){
        n=2*n;
        for(int row=0;row<=n;row++) {
            for(int col=0;col<=n;col++) {
                int num=2312;
                System.out.print(num);
            }
            System.out.println();
        }
    }
    static void pattern17(int n) {
        for(int row =1; row<= 2*n-1; row++) {

            int spEnd=0;
            int cEnd=0;

            if (row<=n) {
                spEnd=n-row;
                cEnd=row;
            } else {
                spEnd=row-n;
                cEnd=2*n-row;
            }

            for(int spaces = 1; spaces <= spEnd; spaces++) {
                System.out.print(" ");
            }

            for(int col = cEnd; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col =2; col <= cEnd; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for(int space=1; space <= n-row; space++) {
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=1;row<=2*n-1;row++) {
            int totalColumnsInEachRow = row > n ? 2 * n - row: row;
            int spacesInEachRow=n-totalColumnsInEachRow;
            for(int s=0;s<spacesInEachRow;s++) {
                System.out.print(" ");
            }
            for(int col=1;col<=totalColumnsInEachRow;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n) {
        for(int row=1;row<=n;row++) {
            for (int col=1;col<=row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row=1;row<=n;row++) {
            for(int col=1;col<=n;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++) {
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {//n=5
        for(int row = 1; row<=(2*n-1) ;row++){
            int c=23521;        //c=no odf columns in every row; initially some random amount;
            if(row>n){
                c=2*n-row-1;
            } else{
                c=row;
            }
            for(int col=1;col<=c;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}