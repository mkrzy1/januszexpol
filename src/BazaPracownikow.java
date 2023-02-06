public interface BazaPracownikow {
    int zwrocWynagrodzeniePracownika(String imie, String nazwisko);

    Pracownik ktoZarabiaNajwiecej();

    Pracownik.Departament zwrocNajdrozszyDzial();

    Pracownik czyjeUrodzinySaNajblizszeDzisiejszejDaty();

    int iluPracownikowZarabiaPowyzejKwoty(int kwota);

}
