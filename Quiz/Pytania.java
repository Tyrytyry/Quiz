import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pytania {

    private String Dane = "";
    private ArrayList<Integer> ListaLiczb = new ArrayList<Integer>();

    public Pytania()
    {
        try {
              File pytania = new File("pytania.txt");
              Scanner scanner = new Scanner(pytania);
              while (scanner.hasNextLine()) {
              Dane = Dane + scanner.nextLine();
            }
              scanner.close();
          } catch (FileNotFoundException exception) {
              System.out.println("Nie udało się otworzyć pliku");
              exception.printStackTrace();
          }
    }

    private String[] PodzielDane()
    {
        String[] pytania = Dane.split(";");
        return pytania;
    }

    private void ZapiszWylosowanaLiczbe(int wylosowanaLiczba)
    {
      ListaLiczb.add(wylosowanaLiczba);
    }

    private boolean CzyBylaWylosowana(int wylosowanaLiczba)
    {
      if(!(ListaLiczb.isEmpty()))
      {
        for(int i=0;i<ListaLiczb.size();i++)
        {
          if(ListaLiczb.get(i) == wylosowanaLiczba)
            return true;
        }
      }
      return false;
    }
      

    public String[] PobierzPytania()
    {
        return PodzielDane();
    }

    public int WylosujLiczbe()
    {
      int iloscPytan = PodzielDane().length - 1;
      int wylosowana = (int)(Math.random() * (iloscPytan - 0 + 1) + 0);
      while(CzyBylaWylosowana(wylosowana))
      {
        wylosowana = (int)(Math.random() * (iloscPytan - 0 + 1) + 0);
      }

      ZapiszWylosowanaLiczbe(wylosowana);
      
      return wylosowana;
    }
}