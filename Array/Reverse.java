public class Reverse{// TC : O(n)
    public static void reverseArr(int arr[]){
       int start =0,end = arr.length-1;

       while (start < end) {
            int temp = arr[end];// swaping
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
       }
    }
    public static void main(String args[]){
        int number[] ={2,4,6,8,10};
        reverseArr(number);
        // printing of array
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}