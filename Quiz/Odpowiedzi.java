import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class Odpowiedzi {

    private String Data = "";

    public Odpowiedzi()
    {
        try {
            File odpowiedzi = new File("odpowiedzi.txt");
            Scanner scanner = new Scanner(odpowiedzi);
            while (scanner.hasNextLine()) {
              Data = Data + scanner.nextLine();
            }
            scanner.close();
          } catch (FileNotFoundException exception) {
            System.out.println("Nie udało się otworzyć pliku");
            exception.printStackTrace();
          }
    }

    private String[][] PodzielDane()
    {
        String[] odpowiedzi = Data.split("\\'(.*?)'");
        String[][] podzieloneOdpowiedzi = new String[odpowiedzi.length/5][5];
        int z = 0;
        for(int i = 0; i < odpowiedzi.length/5; i++)
        {
          for(int k = 0; k < 5; k++)
          {
            podzieloneOdpowiedzi[i][k] = odpowiedzi[z];
            z++;
          }
        }
        return podzieloneOdpowiedzi;
    }

    public String[][] PobierzOdpowiedzi()
    {
        return PodzielDane();
    }

    public boolean PorownajOdpowiedzi(String wybranaOdpowiedz, String poprawnaOdpowiedz)
    {
      if(poprawnaOdpowiedz.equals(wybranaOdpowiedz))
        return true;
      else
        return false;
    }
}