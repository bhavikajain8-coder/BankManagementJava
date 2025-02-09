package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin,repin;
    JButton back,change;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;

        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Change Your Pin");
        text.setForeground(Color.DARK_GRAY);
        text.setFont(new Font("Serif",Font.BOLD,35));
        text.setBounds(320,270,500,40);
        image.add(text);
        //-----NEW PIN---------------------------------------
        JLabel pintext=new JLabel("NEW PIN:");
        pintext.setForeground(Color.BLACK);
        pintext.setFont(new Font("Serif",Font.BOLD,16));
        pintext.setBounds(175,320,180,25);
        image.add(pintext);

        pin=new JPasswordField();
        pin.setFont(new Font("Serif",Font.BOLD,25));
        pin.setBounds(380,320,300,25);
        image.add(pin);
        //------- Rentering new pin------------------
        JLabel repintext=new JLabel("RE-ENTER NEW PIN:");
        repintext.setForeground(Color.BLACK);
        repintext.setFont(new Font("Serif",Font.BOLD,16));
        repintext.setBounds(175,370,180,25);
        image.add(repintext);

        repin=new JPasswordField();
        repin.setFont(new Font("Serif",Font.BOLD,25));
        repin.setBounds(380,370,300,25);
        image.add(repin);
        //----CHNAGE BUTTON---
        change=new JButton("CHANGE");
        change.setBounds(580,440,150,30);
        change.setFont(new Font("Serif",Font.BOLD,15));
        change.addActionListener(this);
        image.add(change);
        //------BACK BUTTON---
        back=new JButton("BACK");
        back.setBounds(580,480,150,30);
        back.setFont(new Font("Serif",Font.BOLD,15));
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change) {
            try{
                String npin=pin.getText();
                String rpin=repin.getText();
    
                if(!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null,"Entered PIN dont match");
                    return;
                }

                if(npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null,"Please enter PIN");
                    return;
                }

                if(rpin.equals("")) {
                    JOptionPane.showMessageDialog(null,"Please re-enter PIN");
                    return;
                }

                Conn conn=new Conn();
                String query1="update bank pin= '"+rpin+"'where pin='"+ pinnumber +"'";
                String query2="update login pin= '"+rpin+"'where pin='"+pinnumber+"'";
                String query3="update Signupthree pin= '"+rpin+"'where pin='"+pinnumber+"'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"PIN CHANGED SUCCESSFULLY!");

                setVisible(false);;
                new Transactions(rpin).setVisible(true);
                
            } catch(Exception e){
                System.out.println(e);
            }

        } else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        
    }

    public static void main(String[] args){
        new PinChange("").setVisible(true);
    }
    
}
