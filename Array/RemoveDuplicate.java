public class RemoveDuplicate {

    // public static int removeDup(int arr[]){
    //     int temp[] = new int[arr.length];// Using extra O(n) space and time complixity 0(n)
    //     int rd=0;
    //     temp[rd] = arr[0];
    //     for(int i=1; i<arr.length; i++){
    //         if(temp[rd] != arr[i]){
    //             rd++;
    //             temp[rd] = arr[i];
    //         }
    //     }
    //     return rd+1;
    // }

    public static int removeDuplicate(int arr[]){
        int rd =0;
        for(int i=1; i<arr.length; i++){
            if(arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd+1;
    }

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        printArr(arr);
       int index = removeDuplicate(arr);
       System.out.println();
       for(int i=0; i<index; i++){
        System.out.print(arr[i]+ " ");
       }

    }
    
}
