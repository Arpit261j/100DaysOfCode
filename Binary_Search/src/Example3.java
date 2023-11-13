//Leetcode-Find Smallest Letter greater then target
public class Example3 {
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        char target='z';
        System.out.println(nextGreatestElement(letters,target));
    }
    static char nextGreatestElement(char[] letters, char target) {
        int mid = 0;
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
