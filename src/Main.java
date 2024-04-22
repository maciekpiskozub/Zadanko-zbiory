import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Set<String> setZImionami = new HashSet<>();

        while(true) {
            System.out.println("Dodaj imie do zbioru(Wprowadz '-' jezeli chcesz zakonczyc): ");
            String input = scanner.nextLine();

            if(input.equals("-")) {
                break;
            }
            setZImionami.add(input);
        }

        System.out.println(setZImionami);
        System.out.println(setZImionami.size());

    }
}