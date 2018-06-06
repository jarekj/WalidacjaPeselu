import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj sprawdzany PESEL: ");
        String pesel = scanner.nextLine();
        if (Pesel.isPeselOK(pesel)) {
            System.out.println(Pesel.isPeselOK(pesel));
            System.out.println(Pesel.dateOfBirth(pesel));
            System.out.println(Pesel.sex(pesel));
        } else {
            System.out.println("Nieprawidłowy PESEL.");
        }
    }
}
