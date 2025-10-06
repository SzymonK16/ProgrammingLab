import java.util.HashMap;
import java.util.Scanner;

void main() {
    Scanner scn = new Scanner(System.in);

    Map<String,String> account = new HashMap<>();
    account.put("szymon","Szymon123");
    account.put("guest","Guest123");

    System.out.println("Login:");
    String login = scn.nextLine();

    if (account.containsKey(login))
    {
        System.out.println("Hasło:");
        String password = scn.nextLine();

        if (account.containsValue(password))
        {
            System.out.println("Zalogowano");
        }
        else
        {
            System.out.println("Błędne hasło");
        }
    }
    else
    {
        System.out.println("Nie ma takiego użytkownika");
    }


}
