import java.time.LocalDate;
import java.util.List;

public class LokalnaBazaPracownikow implements BazaPracownikow {
    private List<Pracownik> listaPracownikow = List.of(
            new Pracownik(
                    "Janusz",
                    "Prezes",
                    LocalDate.of(1960, 1, 1),
                    20000,
                    Pracownik.Departament.ZARZAD
            ),
            new Pracownik(
                    "Mariusz",
                    "Kowalski",
                    LocalDate.of(1962, 2, 2),
                    2000,
                    Pracownik.Departament.HR
            ),
            new Pracownik(
                    "Andrzej",
                    "Kowalczyk",
                    LocalDate.of(1963, 3, 3),
                    3000,
                    Pracownik.Departament.MAGAZYN
            ),
            new Pracownik(
                    "Karol",
                    "Nowak",
                    LocalDate.of(1964, 4, 4),
                    4000,
                    Pracownik.Departament.PRODUKCJA
            ),
            new Pracownik(
                    "Grzegorz",
                    "Fafik",
                    LocalDate.of(1965, 5, 5),
                    5000,
                    Pracownik.Departament.SPRZEDAZ
            ),
            new Pracownik(
                    "Brajan",
                    "Filipik",
                    LocalDate.of(1966, 6, 6),
                    6000,
                    Pracownik.Departament.ZARZAD
            ),
            new Pracownik(
                    "Lechu",
                    "Kaczor",
                    LocalDate.of(1995, 12, 12),
                    10000,
                    Pracownik.Departament.HR
            )
    );

    @Override
    public int zwrocWynagrodzeniePracownika(String imie, String nazwisko) {
        return listaPracownikow.stream()
                .filter(p -> p.getImie().equals(imie) && p.getNazwisko().equals(nazwisko)) //odfiltruj pracownikow ktorzy sie nie nazuwaja jak podano
                .findFirst() //znajdz pierwszego pracownika ktory spelnia ww (albo nie zostal powyzej odfitrowany)
                .get()//albo zwraca wartosc jezeli cs jest a jak pusty to null
                .getWysokoscWynagrodzenia();//w zalwznosci czy powyzsze sa jak nie to wyskoczy blad
    }

    @Override
    public Pracownik ktoZarabiaNajwiecej() {
        return null;
    }

    @Override
    public Pracownik.Departament zwrocNajdrozszyDzial() {
        return null;
    }

    @Override
    public Pracownik czyjeUrodzinySaNajblizszeDzisiejszejDaty() {
        return null;
    }

    @Override
    public int iluPracownikowZarabiaPowyzejKwoty(int kwota) {
        return 0;
    }
}
