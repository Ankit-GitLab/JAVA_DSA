package ankitRevise.array;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int officer = 0,
                noOfUnique = 1,
                cm = 1;

        while(cm < nums.length){
            if(nums[cm] == nums[cm-1]){
                cm++;
                continue;
            }else{
                nums[officer + 1] = nums[cm];
                noOfUnique++;
                officer++;
                cm++;
            }
        }
        return noOfUnique;
    }
}
