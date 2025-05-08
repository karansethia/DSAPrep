package Algos;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int index = findNum(arr, 5);
        System.out.println(index);
    }
    static int findNum(int[] arr, int target){
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                ans = i;
            }
        }
        return ans;
    }
}
