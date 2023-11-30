public class MagicNumber {
    public static void main(String[] args) {
        int n=6;

        int ans=0;
        int a=0;
        while(n>0) {
            a++;
            ans+=(n&1)*(Math.pow(5,a));
            n=n>>1;
        }

        System.out.println(ans);
    }
}
