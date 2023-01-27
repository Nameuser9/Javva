import java.util.Scanner;
public class Task2 {
    public static int main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0){
            return n;
        }
       int msb = 0;
        n = n / 2;
        while (n != 0) {
            n = n / 2;
            msb++;
        }
        return (1 << msb);
    }
    }
