public class jumpsearch {
    public static void main(String[] args){

    }
    public static int[] sorting(int[] nums) {
        Sorting sort = new Sorting(nums);
        sort.bubbleSort();
        return sort.getArray();
    }
    public static int jumpSearch(int[] nums,int target){
        int jump_size = (int) Math.floor(Math.sqrt(nums.length));
        int start = 0;
        int m = 0;
        while (m <= nums.length-1){
            if (nums[m] == target) {
                return m;
            }else if (nums[m] < target){
                start = m;
                m+=jump_size;
            } else {
                for (int i = start; i <m;i++){
                    if (target == nums[i]) {
                        return i;
                    } else {
                        return -1;
                    }
                }
            }
        }
        for (int i =start; i<nums.length;i++)
            if(target == nums[i]){
                return i;
            }
        return -1;
    }
}
