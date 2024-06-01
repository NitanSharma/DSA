public class MaxSubarraysSum1 {// T C : O(n**2)
    public static void maxSubarraySum(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // calculating prefix sum
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++ ){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1] ;
            
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            
            }
        }
        System.out.println("Max Sum : "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[ ] = {1,-2,4,-3,5,-2};
        maxSubarraySum(numbers);
    }
    
}
