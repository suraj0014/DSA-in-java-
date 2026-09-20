 class ArrayExample {
   
int linearSearch(int[] arr, int key ) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        

        return -1;
}
int binarySearch(int[] arr, int key){
    int right;
    int left;
    while (left <= right) {
        int mid = (left + right) /2;

        if (arr[mid] == key){
            return mid;

        }
        else if (arr[mid] <= key) {

            left = mid + 1;
        }
        
         else {
            right = mid - 1;

    }
}
    return -1;
} public static void main(String[] args) {
     int [] arr.length = {15,19,20,26,32,37,43,57,60,74,85};
}
}
