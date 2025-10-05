import java.util.Scanner;
import java.time.LocalDate;


void main() {
    Scanner scn = new Scanner(System.in);
    System.out.println("Podaj datę w formacie 'YYYY-MM-DD'");
    String date = scn.nextLine();

    LocalDate currentDate = LocalDate.parse(date);
    int month = currentDate.getMonthValue();
    int days = currentDate.lengthOfMonth();
    boolean isLeap = currentDate.isLeapYear();

    switch (month){
        case 1:
            System.out.println("Miesiąc to styczneń, ma on " + days + " dni" );
            break;
        case 2:
            System.out.println("Miesiąc to luty, ma on " + days + " dni" );
            break;
        case 3:
            System.out.println("Miesiąc to marzec, ma on " + days + " dni" );
            break;
        case 4:
            System.out.println("Miesiąc to kwieceń, ma on " + days + " dni" );
            break;
        case 5:
            System.out.println("Miesiąc to maj, ma on " + days + " dni" );
            break;
        case 6:
            System.out.println("Miesiąc to czerwiec, ma on " + days + " dni" );
            break;
        case 7:
            System.out.println("Miesiąc to lipiec, ma on " + days + " dni" );
            break;
        case 8:
            System.out.println("Miesiąc to sierpień, ma on " + days + " dni" );
            break;
        case 9:
            System.out.println("Miesiąc to wrzesień, ma on " + days + " dni" );
            break;
        case 10:
            System.out.println("Miesiąc to październik, ma on " + days + " dni" );
            break;
        case 11:
            System.out.println("Miesiąc to listopad, ma on " + days + " dni" );
            break;
        case 12:
            System.out.println("Miesiąc to grudzień, ma on " + days + " dni" );
            break;
        default:
            System.out.println("Błąd przy wprowadzaniu daty");
    }

    if (isLeap){
        System.out.println("Wprowadziłeś przestępny rok");
    } else {
        System.out.println("Wprowadzony rok nie jest przestępny");
    }
}


