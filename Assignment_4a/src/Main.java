import java.util.HashMap;
import java.util.Map;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        Map<String, String> account = new HashMap<>();
        account.put("szymon", "Szymon123");
        account.put("guest", "Guest123");

        String login = console.readLine("Login:");

        if (account.containsKey(login))
        {
            String password = console.readLine("Hasło:");

            if (account.containsValue(password)) {
                System.out.println("Zalogowano");
            } else {
                System.out.println("Błędne hasło");
            }
        }else{
            System.out.println("Nie ma takiego użytkownika");
        }

    }
}



