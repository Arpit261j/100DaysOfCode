public class test {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(nums,5));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start=0,end=0,max=0,sum1=0;
        for(int i=0;i<weights.length;i++) {
            if(max<weights[i]) {
                max=weights[i];
            }
            sum1+=weights[i];
        }
        start=max;
        end=sum1;
        while(start<end) {
            int mid=start+(end-start)/2;
            int pieces=1,sum=0;
            for(int weight:weights) {
                if(sum+weight>mid) {
                    sum=weight;
                    pieces++;
                } else {
                    sum += weight;
                }
            }
            if(pieces<=days) {
                end=mid;
            } else {
                start=mid+1;
            }
        }
        return start;
    }
}
