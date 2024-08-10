public class RemoveElement{
    public static int remove(int arr[],int val){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[count] = arr[i];// {2,2, , }
                count++;
            }
            
           }
           return count;//how many element replace count of remove element in array
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int val =3;
    
       System.out.println(remove(arr, val));
    }
}