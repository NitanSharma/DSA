public class BinarySearch {
    public static int binarySearch(int arr[], int key){// TC : O(log(n)) 
        int start=0;
        int end =arr.length-1;

        while(start<=end){
            int mid =(start+end)/2;
            // comparison
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;// right side key is geater than mid value
            }else{
                end=mid+1;
            }            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={5,9,12,18,22,33,37};// must be sorted array        
        System.out.println(binarySearch(arr, 37));
    }
    
}
