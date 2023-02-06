import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BazaPracownikow bazaPracownikow = new LokalnaBazaPracownikow();
        System.out.println(bazaPracownikow.zwrocWynagrodzeniePracownika("Pawel", "Kowalski"));

    }
}