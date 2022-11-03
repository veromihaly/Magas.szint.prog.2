import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public List<Hero> ReadFromCsv() throws FileNotFoundException {
        List<Hero> result = new ArrayList<>();
        File file = new File("C:\\Users\\User\\Desktop\\Java\\src\\hero.csv");
        Scanner scanner = new Scanner(file);

        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            result.add(convertToHero(scanner.nextLine()));
        }

        return result;
    }




    public Hero convertToHero(String line){
        String[] fields = line.split(";");


        Hero hero;
        switch (fields[0]) {
            case "DPS":
                hero = new Dps(fields[1], Integer.parseInt(fields[2]), fields[3], fields[4], Integer.parseInt(fields[5]));
            case "SUPPORT":
                hero = new Support(fields[1], Integer.parseInt(fields[2]), fields[3], fields[4], Integer.parseInt(fields[5]));
            case "TANK":
                hero = new Tank(fields[1], Integer.parseInt(fields[2]), fields[3], fields[4], Integer.parseInt(fields[5]));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + fields[0]);
        }
        return  hero;
    }
}