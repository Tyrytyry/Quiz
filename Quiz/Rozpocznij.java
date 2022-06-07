class Rozpocznij {

  public static void main(String[] args) throws InterruptedException {
    MenuClass MenuClassStart = new MenuClass(700, 200, 100, 100);
    MenuClassStart.Uruchom();
    MenuClassStart.Zamknij();
    if(MenuClassStart.CzyPojedyncze()){ 
      Pojedyncze PojedynczeStart = new Pojedyncze();
      PojedynczeStart.Uruchom();
    }
    else if(MenuClassStart.CzyWielePytan()){ 
      WielePytan WielePytanStart = new WielePytan();
      WielePytanStart.Uruchom();
    }
    else if(MenuClassStart.CzyWszystkiePytania()){ 
      WszystkiePytania WszystkiePytaniaStart = new WszystkiePytania();
      WszystkiePytaniaStart.Uruchom();
    }
  }
}