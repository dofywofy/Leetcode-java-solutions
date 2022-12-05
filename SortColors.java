//https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] arr) {
        int low = 0, high = arr.length - 1;             
        int i = 0;                               
        
        while (i <= high) {                             
            if (arr[i] == 0) {                    
                swap(arr, i, low);                
                low += 1;                        
                i += 1;
            }
            else if (arr[i] == 2) {                
                swap(arr, i, high);                
                high -= 1;                         
            }
            else {
                i += 1;                             
            }
        }
    }

    private void swap(int[] arr, int i, int j) {            
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
