package BinarySearch;
// ceiling = smallest num >= target
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9,12,14,17};
        int target = 10;
        int ceilingNum = ceiling(arr, target);
        System.out.println(arr[ceilingNum]); // returns ceiling num
    }
    // returns index of ceiling
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return start;
    }
}
