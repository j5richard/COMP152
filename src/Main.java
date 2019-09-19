import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("How many fortunes do you want?");
        Scanner reader = new Scanner(System.in);
        var number = reader.nextInt();
        reader.nextLine();

        for(int i = 0; i < number; i++){
            var input = new RandomFortune(number);
        }
    }
}
