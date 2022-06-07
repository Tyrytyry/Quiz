import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Nasluchiwanie
    {

        private JButton Przycisk;
        private JRadioButton MozliwaOdpowiedz1;
        private JRadioButton MozliwaOdpowiedz2;
        private JRadioButton MozliwaOdpowiedz3;
        private JRadioButton MozliwaOdpowiedz4;
        public boolean CzyPrzyciskKlikniety= false;
        public String Odpowiedz;

        public void PrzeslijZmienne(JButton przycisk, JRadioButton MozliwaOdpowiedz1,JRadioButton MozliwaOdpowiedz2,JRadioButton MozliwaOdpowiedz3,JRadioButton MozliwaOdpowiedz4)
        {
            this.MozliwaOdpowiedz1 = MozliwaOdpowiedz1;
            this.MozliwaOdpowiedz2 = MozliwaOdpowiedz2;
            this.MozliwaOdpowiedz3 = MozliwaOdpowiedz3;
            this.MozliwaOdpowiedz4 = MozliwaOdpowiedz4;
            this.Przycisk = przycisk;
        }

        public void CzyKlikniete() throws InterruptedException
        {
            while(!CzyPrzyciskKlikniety)
            {
                Przycisk.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if (e.getSource() == Przycisk){
                            CzyPrzyciskKlikniety= true;
                        } 
                    }
                });
            }
            Thread.sleep(100);
        }

        public boolean CzyNieKlikniete()
        {
            CzyPrzyciskKlikniety= false;

            return CzyPrzyciskKlikniety;
        }

        public String PobierzWybranaOdpowiedz()
        {
            return Odpowiedz;
        }

        public void SprawdzOdpowiedz()
        {
            while(Odpowiedz == null)
            {
                MozliwaOdpowiedz1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if(MozliwaOdpowiedz1.isSelected()){
                            Odpowiedz = MozliwaOdpowiedz1.getText().toString();
                        }
                    }
                });
                MozliwaOdpowiedz2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if(MozliwaOdpowiedz2.isSelected()){
                            Odpowiedz = MozliwaOdpowiedz2.getText().toString();
                        }
                    }
                });
                MozliwaOdpowiedz3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if(MozliwaOdpowiedz3.isSelected()){
                            Odpowiedz = MozliwaOdpowiedz3.getText().toString();
                        }
                    }
                });
                MozliwaOdpowiedz4.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        if(MozliwaOdpowiedz4.isSelected()){
                            Odpowiedz = MozliwaOdpowiedz4.getText().toString();
                        }
                    }
                });
            }                        
        }
    
    }