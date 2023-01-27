import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
    ArrayList<Integer> m1 = new ArrayList<>();
    //int [] m1 = new int[0];

    Scanner in = new Scanner(System.in);
        System.out.println("Введите число на кратность которому будут проверки");
    int n = in.nextInt();
        System.out.println("введите верхнюю границу множества проверяемых чисел");
    int i = in.nextInt();
    int a = i;
        while (Short.MIN_VALUE < i){

        if (i % n != 0){
            m1.add(i) ;
            a++;
        }
    }
    System.out.printf("все числа кратные %d  в промежутке от %d до %d\n "+m1, n , a,i);
}
}