import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S3 {                       //не понял второй пункт задания формулируется как 
                                    //"Итерация всех элементов списка цветов и добавления к каждому символа '!'." не нашёл что такое список цветов и не понял как добавить симбвол к каждому элементу
                                    // можете пожалуйста объяснить
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList();
        arr.add("h");
        arr.add("e");
        arr.add("l");
        arr.add("l");
        arr.add("o");
        arr.add(0,"101");

        System.out.println(arr);
        arr.add(0, "101");
        arr.set(4, "L");
        arr.remove(3);
        System.out.println("введите искомый элемент");
        String element = in.next();

        if (arr.contains(element)){
            System.out.printf("в списке есть %s" , element);
        }
        else {
            System.out.println("В списке нет искомого элемента");
        }
        ArrayList<String> notarr = new ArrayList();
        notarr.add("h");
        notarr.add("e");
        notarr.add("l");
        notarr.add("l");

        arr.removeIf(s -> {
            if (notarr.contains(s)) {
                notarr.remove(s);           //анонимная функция стирающая данные, которые не содержатся в НЕМАСИИВЕ
                return false;
            }
            return true;
        });
        System.out.println(arr);
        Collections.sort(arr);
    }
}