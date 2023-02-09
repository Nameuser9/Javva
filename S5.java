import java.util.HashMap;
import java.util.TreeMap;

public class S5 {

    public static void main(String[] args) {
        HashMap<Integer,String> dict  = new HashMap<>();
        TreeMap<Integer,String> ent = new TreeMap<>();
        Hash(dict);
        Tree(ent);
    }
    public static void Hash (HashMap<Integer,String> dict){
        long begin = System.currentTimeMillis();
        dict.put(1 , "red");
        dict.put(2, "green");
        dict.put(3,"blue");
        for (int i = 1; i <= dict.size(); i++){
           dict.put(i, dict.get(i)+"!");
                    }
        for (int i = 4; i < 1001; i++){
            dict.put(i, "color");
        }
        long end = System.currentTimeMillis();
        System.out.println(dict);
        System.out.print(" время последовательного перебора ");
        System.out.println(end - begin);
    }
    public static void Tree(TreeMap<Integer,String> ent){
        long begin = System.currentTimeMillis();
        ent.put(1 , "red");
        ent.put(2, "green");
        ent.put(3,"blue");
        for (int i = 1; i <= ent.size(); i++){
            ent.put(i, ent.get(i)+"!");
        }
        for (int i = 4; i < 1001; i++){
            ent.put(i, "color");
        }
        long end = System.currentTimeMillis();
        System.out.println(ent);
        System.out.print(" время случайного перебора ");
        System.out.println(end - begin);
    }
}