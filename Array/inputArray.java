import java.util.*;
public class inputArray {
    public static void main(String[] args) {
        
        int number[] = new int[3];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<number.length; i++){
            number[i] = sc.nextInt();
        }
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+ " ");
        }
    }
}
