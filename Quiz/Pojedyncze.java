public final class Pojedyncze implements Wystartuj {

    public Pojedyncze(){}

    public void Uruchom() throws InterruptedException
    {
        Quizwanie ZacznijQuizwanie = new Quizwanie(500, 300, 300, 300);
        ZacznijQuizwanie.Uruchom();

        Pytania Pytania= new Pytania();
        Odpowiedzi Odpowiedzi = new Odpowiedzi();
        Nasluchiwanie Nasluchiwanie = new Nasluchiwanie();

        String[] pytania= Pytania.PobierzPytania();
        String[][] odpowiedzi = Odpowiedzi.PobierzOdpowiedzi();
        int prawidloweOdpowiedzi = 0;
        int wylosowanaLiczba;
        
        ZacznijQuizwanie.ZmienLicznik(prawidloweOdpowiedzi, 1);
        wylosowanaLiczba = Pytania.WylosujLiczbe();
        Nasluchiwanie.Odpowiedz = null;
        ZacznijQuizwanie.ZmienPytanie(1,pytania[wylosowanaLiczba]);
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

        Rezultat OknoRezultatu = new Rezultat();
        ZacznijQuizwanie.ZamknijOkno();
        OknoRezultatu.Otworz(prawidloweOdpowiedzi, 1);
    }
    
}