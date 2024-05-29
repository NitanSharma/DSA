public class LinearSearch {// TC : O(n)
    public static int linearSearch(int arr[],int target){// function
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target)
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]= {20,4,6,8,10,12,14,16};
        int target=20;
        int index =linearSearch(arr, target);

        if(index == -1){
            System.out.println("Target is not found");
        }else{
            System.out.println("Target is at index : "+index);
        }        
    }    
}
