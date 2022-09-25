package homework1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.Map.Entry;

public class main {
    public static void main(String[] args) {
        student a = new student("Dávid", "davidboom23@gmail.com", "Kálmánháza 4400 Nyíregyházi utca 64.",  21, new ArrayList<>(List.of(1,5,4,3,2,5,4)));
        student b = new student("Roland", "roland22@gmail.com", "Nyíregyháza 4400 Kálmánházi utca 46.",  22, new ArrayList<>(List.of(2,4,3,5,5,1,5)));
        student c = new student("Mihály", "muso21@gmail.com", "Piricse 4375 Pethőfi utca 14.",  20, new ArrayList<>(List.of(1,1,2,3,2,4,2)));
        student d = new student("Szabolcs", "raptor20@gmail.com", "Bömböly 4200 Csengeri utca 2.",  23, new ArrayList<>(List.of(5,5,4,4,3,5,5)));
        HashMap<String,Integer> average=new HashMap<String,Integer>();

        average.put(a.getName(), a.avgGrades());
        average.put(b.getName(), b.avgGrades());
        average.put(c.getName(), c.avgGrades());
        average.put(d.getName(), d.avgGrades());

        System.out.println(a.getGrade());
        System.out.println(a.avgGrades());
        System.out.println(b.getGrade());
        System.out.println(b.avgGrades());
        System.out.println(c.getGrade());
        System.out.println(c.avgGrades());
        System.out.println(d.getGrade());
        System.out.println(d.avgGrades());
        System.out.println(average);

        List<String> keys = average.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(keys);

        Scanner x = new Scanner(System.in);
        System.out.println("Avg of student: ");

        String atlag = x.nextLine();
        int number = Integer.parseInt(atlag);

        for (Entry<String, Integer> entry : average.entrySet()){
            if (entry.getValue() == number) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
