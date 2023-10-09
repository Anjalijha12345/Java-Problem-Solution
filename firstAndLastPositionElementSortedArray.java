class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] result = {-1,-1};

        if (arr == null || arr.length == 0) {
            return result;
        }

        int left = binarySearchLeft(arr,target);
        int right = binarySearchRight(arr,target);

        result[0]= left;
        result[1] = right;

        return result;
    }

    public int binarySearchLeft(int[] arr, int target){
        int left=0;
        int right = arr.length-1;
        int result = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
                result=mid;
                right = mid-1;
            }
            else if (arr[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }

    public int binarySearchRight(int[] arr, int target){
        int left=0;
        int right = arr.length-1;
        int result = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == target){
                result=mid;
                left = mid+1;
            }
            else if (arr[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
}
