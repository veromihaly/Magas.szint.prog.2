import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hero> Heroes = new ArrayList<>();
        Heroes.add(new Support("Kenasi",32,"Ken","yes",13));
        Heroes.add(new Tank("Ivan",20,"Ivan","yes",12));
        Heroes.add(new Dps("Bruh",30,"Bruh","no",25));

        for(int i = 0; i < Heroes.size(); i++){
            System.out.println(Heroes.get(i).toString());
        }

        System.out.println("----------------------------------");

        Collections.sort(Heroes, new SortybyAge());

        for(int i = 0; i < Heroes.size(); i++){
            System.out.println(Heroes.get(i).toString());
        }

        System.out.println("----------------------------------");

        Collections.sort(Heroes, new SortbyName());

        for(int i = 0; i < Heroes.size(); i++){
            System.out.println(Heroes.get(i).toString());
        }

        CSVReader reader = new CSVReader();

        try {
            System.out.println(reader.ReadFromCsv());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<Hero> OWHeroes = null;
        try {
            OWHeroes = reader.ReadFromCsv();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}