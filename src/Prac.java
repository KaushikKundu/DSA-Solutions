public class Prac {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 5;
        int index = search(arr, target);
        System.out.println(index);
    }
        public static int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(target < mid){
                    end = mid - 1;
                }
                else if(target > mid){
                    start = mid + 1;
                }else{
                    return mid;
                }

            }
            return -1;
        }
}

