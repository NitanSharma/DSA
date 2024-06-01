public class LargerNumber {// TC :O(n)
    // find the largest number in a given Array
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;// - infinity

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,6,3,50};
        System.out.println("Largest value is : "+getLargest(arr));
    }    
}
