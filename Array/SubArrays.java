public class SubArrays {
    public static void printSubarrays(int numbers[]){
        int ts =0;      
        for(int i=0; i<numbers.length; i++){// start index of subarray            
            int start = i;
            for(int j=i; j<numbers.length; j++){// endindex of subarray
                int end = j;
                for(int k=start; k<=end; k++){// print of sub array according to start and end
                    System.out.print(numbers[k]+" ");             
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }    
}
