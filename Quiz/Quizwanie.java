import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.*;

public class Quizwanie extends Kontroler {
    public ButtonGroup GrupaPrzyciskow;
    private JLabel Licznik;
    public JRadioButton MozliwaOdpowiedz1;
    public JRadioButton MozliwaOdpowiedz2;
    private JFrame Widok;
    public JRadioButton MozliwaOdpowiedz3;
    public JRadioButton MozliwaOdpowiedz4;
    private JLabel Pytanie;
    public JButton Przycisk;

    public Quizwanie(int SzerOkna, int WysOkna, int PolozenieOknaX, int PolozenieOknaY) {super(SzerOkna, WysOkna, PolozenieOknaX, PolozenieOknaY);}

    private void UstawPytanie() {
        Pytanie = new JLabel();
        Pytanie.setBounds(30, 0, 300, 100);
        Widok.add(Pytanie);
        Widok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Widok.setLocationRelativeTo(null);
    }

    private void UstawOdpowiedzi() {
        GrupaPrzyciskow = new ButtonGroup();
        MozliwaOdpowiedz1 = new JRadioButton();
        MozliwaOdpowiedz1.setBounds(30, 70, 200, 20);
        Widok.getContentPane().add(MozliwaOdpowiedz1).setBackground(Color.decode("#613c5a")); //Kolor tła przycisków
        GrupaPrzyciskow.add(MozliwaOdpowiedz1);
        Widok.add(MozliwaOdpowiedz1);
        MozliwaOdpowiedz2 = new JRadioButton();
        MozliwaOdpowiedz2.setBounds(30, 90, 200, 20);
        GrupaPrzyciskow.add(MozliwaOdpowiedz2);
        Widok.add(MozliwaOdpowiedz2);
        Widok.getContentPane().add(MozliwaOdpowiedz2).setBackground(Color.decode("#613c5a")); //Kolor tła przycisków
        MozliwaOdpowiedz3 = new JRadioButton();
        MozliwaOdpowiedz3.setBounds(30, 110, 200, 20);
        GrupaPrzyciskow.add(MozliwaOdpowiedz3);
        Widok.add(MozliwaOdpowiedz3);
        Widok.getContentPane().add(MozliwaOdpowiedz3).setBackground(Color.decode("#613c5a")); //Kolor tła przycisków
        MozliwaOdpowiedz4 = new JRadioButton();
        MozliwaOdpowiedz4.setBounds(30, 130, 200, 20);
        GrupaPrzyciskow.add(MozliwaOdpowiedz4);
        Widok.add(MozliwaOdpowiedz4);
        Widok.getContentPane().add(MozliwaOdpowiedz4).setBackground(Color.decode("#613c5a")); //Kolor tła przycisków 
    }

    private void UstawPrzycisk() {
        Przycisk = new JButton("<html><font color='purple'>Potwierdź</font></html>"); // Kolor tekstu przycisku
        Przycisk.setBounds(30, 170, 150, 30);
        Widok.getContentPane().add(BorderLayout.SOUTH, Przycisk).setBackground(Color.pink); // Kolor tekstu przycisku
    }

    private void UstawLicznikOdpowiedzi(){
        Licznik = new JLabel();
        Widok.add(Licznik);
        Licznik.setBounds(400, 170, 50, 30);
    }

    public void ZmienPytanie(int numberOfQuestion, String text){
        Pytanie.setText((numberOfQuestion+1)+". "+text);
    }

    public void ZmienLicznik( int prawidloweOdpowiedzi,  int wszystkiePytania){
        Licznik.setText("<html><font color='white'>"+prawidloweOdpowiedzi+"/"+wszystkiePytania+"</font></html>");
    }

    public void ZmienWartoscPrzyciskow( String odpowiedz1,  String odpowiedz2,  String odpowiedz3,  String odpowiedz4){
        MozliwaOdpowiedz1.setText(odpowiedz1);

        MozliwaOdpowiedz2.setText(odpowiedz2);

        MozliwaOdpowiedz3.setText(odpowiedz3);

        MozliwaOdpowiedz4.setText(odpowiedz4);
    }

    public void OdznaczZaznaczonePrzyciski(){GrupaPrzyciskow.clearSelection();}

    public void ZamknijOkno(){Widok.setVisible(false);}

    public void Uruchom(){
        Widok = new JFrame("Quizwanie");
        Widok.setLayout(null);
        Widok.getContentPane().setBackground( Color.decode("#0508a8")); // Kolor Tła Quizwanieu
        UstawPytanie();
        UstawOdpowiedzi();
        UstawWlasciwosciOkna(Widok);
        UstawPrzycisk();
        UstawLicznikOdpowiedzi();
        Widok.setVisible(true);
    }
    
}