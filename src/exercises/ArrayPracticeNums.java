package exercises;

public class ArrayPracticeNums {
    public static void main(String[] args) {

    int[] numsArray = {1,1,2,3,5,8};

    for (int nums : numsArray){
        if (nums % 2 != 0 ) {
            System.out.println(nums);
            }
        }
    }
}
