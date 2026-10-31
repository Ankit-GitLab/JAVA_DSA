package ankitRevise.array;

public class Find_Pivot {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        for(int i=0; i<nums.length; i++){
            rightSum += nums[i];
        }

        int leftSum = 0;
        for(int i=0; i<nums.length; i++){
            if(leftSum == rightSum - nums[i]){
                return i;
            }

            leftSum += nums[i];
            rightSum -= nums[i];
        }

        return -1;
    }
}
