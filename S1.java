import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class S1 {
        public static void main(String[] args){
        System.out.println("hello world");
        int i = new Random().nextInt(2000);
        System.out.println(i);
        task3();
    }
        public static java.util.ArrayList task3(){
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
            //System.out.printf("все числа кратные %d  в промежутке от %d до %d\n "+m1, n , a,i);
        return (m1);
        }
        public static java.util.ArrayList task4(){
        ArrayList<Integer> m1 = new ArrayList<>();
        //int [] m1 = new int[0];

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число на кратность которому будут проверки");
        int n = in.nextInt();
        System.out.println("введите нижнюю границу множества проверяемых чисел");
        int i = in.nextInt();
        int a = i;
        while (Short.MIN_VALUE < i){

            if (i % n != 0){
                m1.add(i) ;
                a++;
            }
        }
        //System.out.printf("все числа кратные %d  в промежутке от %d до %d\n "+m1, n , a,i);
        return (m1);
    }
}
