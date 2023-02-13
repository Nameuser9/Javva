import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class S6 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> sim = new HashMap<Integer,Integer>();
        HashSetSim(sim);
        Scanner in = new Scanner(System.in);
        //System.out.println("Add or show or Search?");
        //String choice = in.next();
        //if (choice.equals("Add")){
            HashSimAdd(sim);
        //}
       // if (choice.equals("show")){
            HashSetSimtoStr(sim);
        //}
        //if (choice.equals("Search")){
            HashSetSimSearch(sim);
       // }
    }


    public static void HashSetSim(HashMap<Integer,Integer> slov){
        int i = new Random().nextInt(0, 100);
        while (i< 101) {
            i = new Random().nextInt(102);
            if (slov.containsKey(i)){

                slov.replace(i,i+1);
            }
            else {
                slov.put(i, i);
            }

        }

    } public static void HashSimAdd(HashMap<Integer,Integer> slov){
        Scanner in = new Scanner(System.in);
        System.out.println("введите число значения и его ключ");
        int customKey = in.nextInt();
        int customValue = in.nextInt();
        slov.put(customKey,customValue);
    }
    public static void HashSetSimtoStr(HashMap<Integer,Integer> slov){

        System.out.println(slov.toString());
    }
    public static void HashSetSimSearch(HashMap<Integer,Integer> slov){
        Scanner in = new Scanner(System.in);
        System.out.println("введите число значения и его ключ");
        int customKey = in.nextInt();
        System.out.println(slov.get(customKey));
    }
}
