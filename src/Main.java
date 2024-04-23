import java.util.*;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        Set<String> setZImionami = new HashSet<>();
//
//        while(true) {
//            System.out.println("Dodaj imie do zbioru(Wprowadz '-' jezeli chcesz zakonczyc): ");
//            String input = scanner.nextLine();
//
//            if(input.equals("-")) {
//                break;
//            }
//            setZImionami.add(input);
//        }
//
//        System.out.println(setZImionami);
//        System.out.println(setZImionami.size());

        Scanner input = new Scanner(System.in);
        Map<String, String> pary = new HashMap<>();
        String imie1, imie2;

        while(true) {
            System.out.println("Podaj imie partnera: ");
            imie1 = input.next();
            if (imie1.equals("-")) {
                break;
            }
            System.out.println("Podaj imie partnerki: ");
            imie2 = input.next();
            if (imie2.equals("-")) {
                break;
            }
            pary.put(imie1, imie2);

        }
        System.out.println("Podaj imie partnera do sprawdzenia: ");
        imie1 = input.next();
        System.out.println("Partnerka dla " + imie1 + " to " + pary.get(imie1));





    }
}