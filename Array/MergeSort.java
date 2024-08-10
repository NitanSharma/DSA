public class MergeSort{
    public static void mergeSort(int arr[] , int si , int ei){
        if(si >= ei){// base case
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;//divide
        mergeSort(arr, si, mid);// left
        mergeSort(arr, mid+1, ei);//right
        merge(arr, si,mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;// iterator for left
        int j = mid+1;// right
        int k = 0;// iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){//left
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k=0 , i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[] ){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
       int arr[] = {5,18,2,3,46,34};
      mergeSort(arr, 0, arr.length-1);
      printArr(arr);
    }
}