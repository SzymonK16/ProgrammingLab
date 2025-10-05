import java.util.Scanner;

double degToFar(double degrees,int opt){
    double fahrenheit = 0.0;
    if (opt == 1){
        fahrenheit = (degrees * 1.8) + 32;
    } else {
        fahrenheit = (((degrees - 273) * 9/5) + 32);
    }
    return fahrenheit;
}
double degToCel(double degrees,int opt){
    double cellcius = 0.0;

    if (opt == 1){
        cellcius = (degrees - 32) / 1.8;

    } else {
        cellcius = degrees - 273.16;
    }

    return cellcius;


}
double degToKel(double degrees, int opt){
    double kelvin = 0;
    if (opt == 1){
        kelvin = (5/9 * (degrees - 32) + 273);

    } else {
        kelvin = degrees + 273.16;
    }

    return  kelvin;
}

void main() {
    Scanner scn = new Scanner(System.in);
    boolean exit = false;

    while (!exit){
        System.out.println("Wybierz opcję konwersji:");
        System.out.println("1: Konwertuj Celsjusze na Fahrenheita");
        System.out.println("2: Konwertuj Fahrenheita na Celsjusze");
        System.out.println("3: Konwertuj Celsjusze na Kelviny");
        System.out.println("4: Konwertuj Fahrenheita na Kelviny");
        System.out.println("5: Konwertuj Kelviny na Celsjusze");
        System.out.println("6: Konwertuj Kelviny na Fahrenheita");
        System.out.println("7: Wyjdź");

        int choice = scn.nextInt();

        double temp;

        System.out.println("Wpisz stopnie:");
        temp = scn.nextDouble();

        switch (choice){
            case 1:
                System.out.printf("Temperatura po konwersji wynosi: %.2f°F%n", degToFar(temp,1));
                break;
            case 2:
                System.out.printf("Temperatura po konwersji wynosi: %.2f°C%n", degToCel(temp,1));
                break;
            case 3:
                System.out.printf("Temperatura po konwersji wynosi: %.2f°K%n", degToKel(temp,2));
                break;
            case 4:
                System.out.printf("Temperatura po konwersji wynosi: %.2f°K%n", degToKel(temp,1));
                break;
            case 5:
                System.out.printf("Temperatura po konwersji wynosi: %.2f°C%n", degToCel(temp,2));
                break;
            case 6:
                System.out.printf("Temperatura po konwersji wynosi: %.2f°F%n", degToFar(temp,2));
                break;
            case 7:
                exit = true;
                break;
            default:
                System.out.println("Zły wybór");
        }
    }
}





