import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hero> Heroes = new ArrayList<>();
        Heroes.add(new Monk("Midas",26,'f', new ArrayList<>(List.of("Unarmed Strike","Radiant Bolt")),"Sun Soul",5));
        Heroes.add(new Fighter("Legolas",33,'f', new ArrayList<>(List.of("Arrow","Shield")),"Demolisher",2));
        Heroes.add(new Angel("Kayle",27,'n', new ArrayList<>(List.of("LoL","Divine Judgement")),"Divine Raider",5));

        for (int i = 0; i < Heroes.size(); i++){
            System.out.println(Heroes.get(i).toString());
        }

        Collections.sort(Heroes, new SortybyAge());

        System.out.println("Age sort: ");

        for(int i = 0; i< Heroes.size(); i++){
            System.out.println(Heroes.get(i));
        }
    }
}
