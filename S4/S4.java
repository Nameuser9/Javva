import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("write or read or sort?");
        String choice = in.next();
        if (choice.equals("write")){
            write();
        }
        if (choice.equals("read")){
            read();
        }
        if (choice.equals("sort")){
            sort();
        }


    }
        public static void write(){
            FileWriter fileWriter;
            Scanner in = new Scanner(System.in);
            String info = in.next();
            try {
               fileWriter = new FileWriter("db.sql", true);
               fileWriter.append(info);
                fileWriter.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        public static void read(){
            FileReader reader;
            String text = "";
            try {
                reader = new FileReader("db.sql");

                while (reader.ready()) {
                    text += (char) reader.read();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
            System.out.println(text);

    }
        public static void sort(){
            FileReader reader;
            String text = "";
            ArrayList<String> spisok = new ArrayList<>();
            String[] names = new String[5];
            String[] surnames = new String[5];
            String[] patronymic = new String[5];
            int [] age = new int[5];
            String[] sex = new String[5];
            StringBuilder s = new StringBuilder();
            try {
                reader = new FileReader("db.sql");

                while (reader.ready()) {
                    text += (char) reader.read();


                }
                String Parts[] = text.split(" ");


                //System.out.println(Arrays.toString(Parts));
                //System.out.println((Parts.length));
                //System.out.println(Parts[16]);


                int i = 0;
                int a = i%4;
                while (i < Parts.length-1){
                   names[a] = Parts[i];
                   i++;
                    surnames [a] = Parts[i];
                    i++;
                    patronymic[a] = Parts[i];
                    i++;
                    age[a] = Integer.parseInt((Parts[i]));
                    i++;
                    a++;
                //    sex[i % 5] = (Parts[i]); ПРОБЛЕМА: не разделяется пол и имя следующего человека
                    // за исключением этой проблемы списки создать удалось
                //    i++;


                }
                //System.out.println(Arrays.toString(names));
               // System.out.println(Arrays.toString(surnames));
               // System.out.println(Arrays.toString(patronymic));
               // System.out.println(Arrays.toString(age));

                i=0;
                a=0;
                int[] clone =age.clone();
                Arrays.sort(clone);
                while (i < age.length){
                   if (clone[i] ==age[a]){
                       spisok.add(names[a]);
                       spisok.add(surnames [a]);
                       spisok.add(patronymic[a]);
                       spisok.add(String.valueOf(age[a]));
                       spisok.add("\n");
                       i++;
                       a=0;
                   }
                   else {
                       a++;
                   }


                }
            System.out.println(spisok);
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }

        }
}