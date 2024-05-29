import java.util.Arrays;
public class Boat {
    public static int rescuepeople(int arr[],int  limit){
        int boat =0;
        int i=0, j=arr.length-1;
        Arrays.sort(arr);
        while(i<=j){
            if((arr[i] + arr[j]) <= limit){
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }
    public static void main(String[] args) {
        int arr[] = {50,70,80,90,100};
        int arr1[] = {3,2,2,1};
        int limit1 = 3;
        int limit =130;
        System.out.println(rescuepeople(arr1, limit1));
    }
    
}
