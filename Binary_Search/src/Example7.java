//leetcode hard question-find in mountain array
public class Example7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(findInMountainArray(target,arr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int start=0, end=mountainArr.length-1;
        int mid=-1;
        int peak=0;
        int numFound=-1;
        while(start<end){
            mid=start+(end-start)/2;
            if (mountainArr[mid]>mountainArr[mid+1]) {
                end=mid;
            } else {
                start=mid+1;
            }
        }
        peak=start;
        //dividing array into 2 parts
        //1-descending
        //2-ascending
        mid=0;
        end=mountainArr.length-1;
        while(start<=end) {
            mid=start+(end-start)/2;
            if(mountainArr[mid]==target) {
                numFound=mid;
                break;
            } else if (mountainArr[mid]>target) {
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        //for ascending array
        mid=0;
        end=peak;
        start=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mountainArr[mid]==target) {
                numFound=mid;
                break;
            } else if (mountainArr[mid]>target) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return numFound;
    }
}
