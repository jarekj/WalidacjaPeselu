import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj sprawdzany PESEL: ");
        String pesel = scanner.nextLine();
        System.out.println("Sprawdzany PESEL: " + pesel);
        System.out.println(Pesel.isPeselOK(pesel));
        System.out.println(Pesel.dateOfBirth(pesel));
        System.out.println(Pesel.sex(pesel));

    }
}
