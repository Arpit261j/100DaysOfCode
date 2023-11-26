public class GoldenRatioFibo {
    public static void main(String[] args) {
        System.out.println(fibo(45));
    }
    static int fibo(int n){
        int ans= (int)((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        return ans;
    }
}
