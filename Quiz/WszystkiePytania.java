public final class WszystkiePytania implements Wystartuj {
public WszystkiePytania(){}

    public void Uruchom() throws InterruptedException{
        Quizwanie ZacznijQuizwanie = new Quizwanie(500, 300, 300, 300);
        ZacznijQuizwanie.Uruchom();
        Nasluchiwanie Nasluchiwanie = new Nasluchiwanie();
        Pytania Pytania = new Pytania();
        String[] pytania= Pytania.PobierzPytania();
        Odpowiedzi Odpowiedzi = new Odpowiedzi();
        String[][] odpowiedzi = Odpowiedzi.PobierzOdpowiedzi();
        int prawidloweOdpowiedzi = 0;
        int wylosowanaLiczba;
        for(int i = 0; i < pytania.length; i++)
        {
            ZacznijQuizwanie.ZmienLicznik(i, pytania.length);
            wylosowanaLiczba = Pytania.WylosujLiczbe();
            Nasluchiwanie.Odpowiedz = null;
            ZacznijQuizwanie.ZmienPytanie(i,pytania[wylosowanaLiczba]);
            if(!(Nasluchiwanie.CzyNieKlikniete()))
            {
            ZacznijQuizwanie.ZmienWartoscPrzyciskow(odpowiedzi[wylosowanaLiczba][0],odpowiedzi[wylosowanaLiczba][1],odpowiedzi[wylosowanaLiczba][2],odpowiedzi[wylosowanaLiczba][3]);
            Nasluchiwanie.PrzeslijZmienne(ZacznijQuizwanie.Przycisk, ZacznijQuizwanie.MozliwaOdpowiedz1, ZacznijQuizwanie.MozliwaOdpowiedz2, ZacznijQuizwanie.MozliwaOdpowiedz3, ZacznijQuizwanie.MozliwaOdpowiedz4);
        
            Nasluchiwanie.SprawdzOdpowiedz();
            Nasluchiwanie.CzyKlikniete();
            if(Odpowiedzi.PorownajOdpowiedzi(Nasluchiwanie.PobierzWybranaOdpowiedz(), odpowiedzi[wylosowanaLiczba][4]))
                prawidloweOdpowiedzi++;
                
            ZacznijQuizwanie.OdznaczZaznaczonePrzyciski();
            }
        }
        Rezultat OknoRezultatu = new Rezultat();
        ZacznijQuizwanie.ZamknijOkno();
        OknoRezultatu.Otworz(prawidloweOdpowiedzi, pytania.length);
    }
}