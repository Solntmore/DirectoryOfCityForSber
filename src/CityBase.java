import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityBase {
    public static void main(String[] args) throws IOException {
        List <City> cityList = new ArrayList<>();

        Scanner scanner = new Scanner(Paths.get("helpFiles/city_ru.csv"));
        scanner.useDelimiter(System.getProperty("line.separator"));
        while(scanner.hasNext()){
            City city = parseFromCSVLine(scanner.next());
            cityList.add(city);
        }
        scanner.close();

            for (City city: cityList) {
                System.out.println(city);
            }
    }

    private static City parseFromCSVLine(String line) {
        String[] lineValue = line.split(";");
        String name = lineValue[1];
        String region = lineValue[2];
        String district = lineValue[3];
        int population = Integer.parseInt(lineValue[4]);
        String foundation = (lineValue.length > 5) ? lineValue[5] : null;
        return new City(name, region, district, population, foundation);
    }
}

