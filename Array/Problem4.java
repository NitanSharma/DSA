public class Problem4{
    

    public static int[] merge(int nums1[],int nums2[]){// merge two array
        int m = nums1.length;
        int n = nums2.length;
        int temp[] = new int[m+n];
        int i=0 ,j =0, k=0;

        while (i <m && j < n) {
            if(nums1[i] > nums2[j]){
                temp[k++] = nums2[j++];
            }else{
                temp[k++] = nums1[i++];
            }
            
        }
        while(i < m){
            temp[k++] = nums1[i++];
        }
        while(j < n){
            temp[k++] = nums2[j++];
        }

       return temp;
    }

    // find medain of array
    public static void main(String args[]){
        int nums1[] = {1,3,4,5,6,6};
        int nums2[] = {2,7,8,9};
       int arr[] = merge(nums1, nums2);
       System.out.println(arr.length);

    }
}