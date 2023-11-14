//amazon question-find the position of an element in an infinite array
public class Example5 {
    public static void main(String[] args) {
       int[] arr={3,5,7,9,10,90,100,130,140,160,170};
       int target=10;
       System.out.println(searchPosition(arr,target));
    }

   /*
   for searching in an infinite array
            start=end+1;
    end=start*2

    start=1 end=2
            3	6	6-3+1=4
            7	14	14-7+1=8
            15	30	30-15+1=16
            31	62	62-31+1=32
     */


    static int searchPosition(int[] arr,int target){
        if (arr[0]==target) {
            return 0;
        }
        int start=1,end=2;
        while (arr[end]<=target) {
            if (arr[start]==target) {
                return start;
            } else if (arr[end]==target) {
                return end;
            }
            start=end+1;
            end=start*2;
        }
        int mid=-1;
        while (start<=end) {
            mid=start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return mid;
    }
}
