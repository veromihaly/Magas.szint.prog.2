package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public void printkocsis() throws FileNotFoundException {
        List<kocsi> kocsiList = readkocsisFromCSV();

        for(kocsi kocsi: kocsiList) {
            System.out.println(kocsi);
        }
    }

    private List<kocsi> readkocsisFromCSV() throws FileNotFoundException {
        List<kocsi> result = new ArrayList<>();
        File file = new File("C:\\Users\\user\\Desktop\\IdeaProjects\\student2\\src\\homework2\\ford_escort.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\n");
        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            result.add(convertTokocsi(scanner.nextLine()));
        }

        return result;
    }


    private kocsi convertTokocsi(String line) {
        String[] fields = line.split(",\\s+");
        kocsi kocsi = new kocsi();
        kocsi.setYear(Integer.parseInt(fields[0]));
        kocsi.setMileage(Integer.parseInt(fields[1]));
        kocsi.setPrice(Integer.parseInt(fields[2].trim()));
        return kocsi;
    }
}

