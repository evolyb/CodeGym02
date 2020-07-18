import java.util.Scanner;
public class FirstNPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of prime number you want to print out");
        int N = scanner.nextInt();
        int count = 0;
        int num = 2;
        while (count < N){
            if (isPrime(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


