import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rezultat extends Kontroler {
private JFrame Rezultat;
    
    public Rezultat(){super(SzerOkna, WysOkna, PolozenieOknaX, PolozenieOknaY);}

    public void Otworz(int prawidloweOdpowiedzi, int wszystkiePytania){ 
        Rezultat = new JFrame("Quizwanie");
        Rezultat.setLayout(null);
        Rezultat.getContentPane().setBackground( Color.decode("#c99dc1") ); // Kolor Tła Quizwanieu
        UstawWlasciwosciOkna(Rezultat);
        JLabel etykietaRezultatu = new JLabel("<html><font color='white'>Wynik: "+prawidloweOdpowiedzi+"/"+wszystkiePytania+"</font></html>"); // Kolor tekstu
        etykietaRezultatu.setBounds(30,0,100,100);
        Rezultat.add(etykietaRezultatu);
        Rezultat.setVisible(true);}
}