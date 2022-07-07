import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        GenerateTask(rand);
    }

    public static void GenerateTask( Random rand) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what`s your name?");
        String userName = scanner.nextLine();
        System.out.println(String.format("Hello, %s", userName));

        char[] actions = {'+', '-', '*', 'q'};
        boolean controlItem = true;

        try{
            while (controlItem) {
                int numberOne = rand.nextInt(1, 100);
                int numberTwo = rand.nextInt(1, 100);
                char action = actions[rand.nextInt(0, 2)];

                System.out.println(String.format("Do it -> %d%c%d", numberOne, action, numberTwo));
                int line = Integer.parseInt(scanner.nextLine());
                int result = 0;

                switch (action) {
                    case '+':
                        result = numberOne + numberTwo;
                        break;
                    case '-':
                        result = numberOne - numberTwo;
                        break;
                    case '*':
                        result = numberOne * numberTwo;
                        break;
                    case 'q':
                        controlItem = false;
                        result = 0;
                        break;
                }

                if (result == line) {
                    System.out.println(String.format("Nice, %s", userName));
                }
            }
        }
        catch (Exception ex){
            System.out.println("Buy!");
        }

    }
}
