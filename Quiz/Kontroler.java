import javax.swing.JFrame;

public abstract class Kontroler {

    protected static int SzerOkna;
    protected static int WysOkna;
    protected static int PolozenieOknaX;
    protected static int PolozenieOknaY;

    public Kontroler(int SzerOkna,  int WysOkna,  int PolozenieOknaX,  int PolozenieOknaY)
    {
        Kontroler.SzerOkna = SzerOkna;
        Kontroler.WysOkna = WysOkna;
        Kontroler.PolozenieOknaX = PolozenieOknaX;
        Kontroler.PolozenieOknaY = PolozenieOknaY;
    }

    public void UstawWlasciwosciOkna(JFrame okno) 
    {
        okno.setSize(SzerOkna, WysOkna);
        okno.setLocation(PolozenieOknaX, PolozenieOknaY);
    }
}