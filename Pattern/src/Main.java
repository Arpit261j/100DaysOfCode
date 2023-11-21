public class Main {
    public static void main(String[] args) {

        pattern5(5);
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