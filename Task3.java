import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> m1 = new ArrayList<>();
        //int [] m1 = new int[0];

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число на кратность которому будут проверки");
        int n = in.nextInt();
        System.out.println("введите нижнюю границу множества проверяемых чисел");
        int i = in.nextInt();
        int a = i;
        while (i < Short.MAX_VALUE){

            if (i % n == 0){
                m1.add(i) ;
                a++;
            }
            i++;
        }
        System.out.printf("все числа кратные %d  в промежутке от %d до %d\n "+m1, n , a,i);

    }
    }
