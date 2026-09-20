public class Array {
    public static void main(String[] args) {
        int[] arr = {10,12,20,15,6};
    int[] prefixSum = new int[arr.length];
    prefixSum[0] = arr[0];
    for (int i = 1; i < arr.length; i++)
    {
        prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        for (int i = 0; i < prefixSum.length; i++){

    
    System.out.println(prefixSum[i] + "");
}
    }
}
