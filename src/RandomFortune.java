import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class RandomFortune{

    public RandomFortune(int input) throws IOException {
        String fileName = "fortunes.txt";
        String all_fortunes = Files.readString(Paths.get(fileName));
        String[] fortune_list = all_fortunes.split("\n");

        var rand = new Random();
        var randomFortune = rand.nextInt(fortune_list.length);
        System.out.println(fortune_list[randomFortune]);

    }
}
