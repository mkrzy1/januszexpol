import java.time.LocalDate;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wysokoscWynagrodzenia;
    private Departament departament;
    public enum Departament{ //git test
        HR,
        SPRZEDAZ,
        MAGAZYN,
        PRODUKCJA,
        ZARZAD,
    }

    public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia, int wysokoscWynagrodzenia, Departament departament) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.wysokoscWynagrodzenia = wysokoscWynagrodzenia;
        this.departament = departament;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWysokoscWynagrodzenia() {
        return wysokoscWynagrodzenia;
    }

    public Departament getDepartament() {
        return departament;
    }
}
