import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder bild = new StringBuilder(in.nextLine());
        StringBuilder destroy = new StringBuilder(in.nextLine());

        bild.reverse();

       if (bild.toString().equals(destroy.toString())){
          System.out.println(true) ;
        }
        else {
            System.out.println(false);
        }
        String str = in.nextLine();
        reverserecursion(str);
        
        strapp();
        strappAlt();
    }
    public static void reverserecursion(String str) {
        Scanner in = new Scanner(System.in);

        if (str.length() >= 1){
            System.out.print(str.charAt(str.length()-1));


         reverserecursion(str.substring(0,str.length()-1));
        }
        else
            System.out.println(str);
    }


    public static void strapp() {
        Scanner in = new Scanner(System.in);
        StringBuilder bigstring = new StringBuilder(in.nextLine());
        //int arg1 = in.nextInt();
        //System.out.println("введите число от 1 до 4 где 1=+ 2=- 3=* 4=/");
        //String arg2 = in.nextLine();
        //int arg3 = in.nextInt();
        //String arg4 = "=";
        //int arg5 = 0;
        // if (arg2 == "1"){
        //     arg5 = arg1 + arg3;
        // }
        // if (arg2 == "2"){
        //arg5 = arg1 - arg3;
    //}
       // if (arg2 == "3"){
       //     arg5 = arg1 * arg3;
       // }
       // if (arg2 == "4"){
       //     arg5 = arg1 / arg3;
       // }
        //else{
         //   System.out.println("вторым элементом стоки должен быть простой арифметический знак");
       // }
        //bigstring.append(arg1);
        //bigstring.append(arg2);
        //bigstring.append(arg3);
       // bigstring.append(arg4);
       // bigstring.append(arg5);
        int a1 = 3;
        int a2 = 56;
        bigstring.append(a1);
        bigstring.append("+");
        bigstring.append(a2);
        bigstring.append("=");
        bigstring.append(a1+a2);
        bigstring.append(" ");
        bigstring.append(a1);
        bigstring.append("-");
        bigstring.append(a2);
        bigstring.append("=");
        bigstring.append(a1-a2);
        bigstring.append(" ");
        bigstring.append(a1);
        bigstring.append("*");
        bigstring.append(a2);
        bigstring.append("=");
        bigstring.append(a1*a2);
        System.out.println(bigstring);
        long begin1 = System.currentTimeMillis();
        for(int i= 4; i < bigstring.length()-1;i+=6){
            bigstring.deleteCharAt(i);
            i++;
            if (i> 10){
                i++;
            }
        }
       for(int i= 4; i < bigstring.length()-1;i+=11){
            bigstring.insert(i ,"равно");
            i++;
            if (i> 10){
                i++;
            }
        }
        System.out.println(bigstring);
       long end1 = System.currentTimeMillis();
        System.out.print("Время затраченное на алгоритм без replace ");
        System.out.println(end1-begin1);
    }
    public static void strappAlt(){
        StringBuilder bigstring = new StringBuilder();
        int a1 = 3;
        int a2 = 56;
        bigstring.append(a1);
        bigstring.append("+");
        bigstring.append(a2);
        bigstring.append("=");
        bigstring.append(a1+a2);
        bigstring.append(" ");
        bigstring.append(a1);
        bigstring.append("-");
        bigstring.append(a2);
        bigstring.append("=");
        bigstring.append(a1-a2);
        bigstring.append(" ");
        bigstring.append(a1);
        bigstring.append("*");
        bigstring.append(a2);
        bigstring.append("=");
        bigstring.append(a1*a2);
        System.out.println(bigstring);
        long begin2 = System.currentTimeMillis();
        for(int i= 4; i < bigstring.length()-1;i+=11){
            bigstring.replace(i , i+1 , "равно");
            i++;
            if (i> 10){
                i++;
            }
        }
        System.out.println(bigstring);
        long end2 = System.currentTimeMillis();
        System.out.print("Время затраченное на алгоритм с replace ");
        System.out.println(end2-begin2);
    }
}