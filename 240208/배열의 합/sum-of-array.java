import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int i = 0; i< n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
    }
}