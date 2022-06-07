import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuClass extends Kontroler {
    protected static JFrame MenuClass;

    public JButton Przycisk1;
    public JButton Przycisk2;
    public boolean ZamknijOkno;
    public boolean Pojedyncze = false;
    public boolean WielePytan = false;
    public boolean WszystkiePytania = false;
    
    public MenuClass(int SzerOkna, int WysOkna, int PolozenieOknaX, int PolozenieOknaY)
    {
        super(SzerOkna, WysOkna, PolozenieOknaX, PolozenieOknaY);
    }

    public void Uruchom()
    {
        MenuClass = new JFrame("Quizwanie");
        MenuClass.setLayout(null);
        MenuClass.getContentPane().setBackground( Color.decode("#344766")); // Kolor Tła MenuClass

        UstawWlasciwosciOkna(MenuClass);

        JLabel EtykietaOpcji1 = new JLabel("<html><font color='yellow'>Gra na 7 pytań</font></html>");
        EtykietaOpcji1.setBounds(30,0,100,100);
        MenuClass.add(EtykietaOpcji1);
        Przycisk1 = new JButton("<html><font color='white'>Graj</font></html>");
        Przycisk1.setBounds(30,75,100,20);
        MenuClass.getContentPane().add(BorderLayout.SOUTH, Przycisk1).setBackground(Color.orange); // Kolor tła przycisku
        MenuClass.add(Przycisk1);
        JLabel EtykietaOpcji2 = new JLabel("<html><font color='yellow'>Gra na 1 pytanie</font></html>");
        EtykietaOpcji2.setBounds(150, 40, 100, 20);
        MenuClass.add(EtykietaOpcji2);
        Przycisk2 = new JButton("<html><font color='white'>Graj</font></html>");
        Przycisk2.setBounds(150, 75, 100, 20);
        MenuClass.getContentPane().add(BorderLayout.SOUTH, Przycisk2).setBackground(Color.orange); // Kolor tła przycisku;
        MenuClass.add(Przycisk2);
        MenuClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MenuClass.setLocationRelativeTo(null);
        MenuClass.setVisible(true);
    }
    
    private boolean CzyZamkniete()
    {
        while(!ZamknijOkno)
        {
            Przycisk1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    if (e.getSource() == Przycisk1){
                        ZamknijOkno = true;
                        WielePytan= true;
                    } 
                }
            });
            Przycisk2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed( ActionEvent e)
                {
                    if (e.getSource() == Przycisk2){
                        ZamknijOkno = true;
                        Pojedyncze = true;
                    } 
                }
            });
        }

        return ZamknijOkno;
    }

    public void Zamknij()
    {
        if(CzyZamkniete())
            MenuClass.setVisible(false);
    }

    public boolean CzyPojedyncze()
    {
        if(Pojedyncze)
            return true;
        else
            return false;
    }

    public boolean CzyWielePytan()
    {
        if(WielePytan)
            return true;
        else
            return false;
    }

    public boolean CzyWszystkiePytania()
    {
        if(WszystkiePytania)
            return true;
        else
            return false;
    }

    
}