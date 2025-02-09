package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.util.Date;
                

public class Withdrawl extends JFrame implements ActionListener{
 
    JTextField amount;
    JButton deposit,back;
    String pinnumber;

    Withdrawl(String pinnumber){

        this.pinnumber=pinnumber;
        setLayout(null);   


     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.jpg "));
     Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image =new JLabel(i3);
     image.setBounds(0,0,900,900);
     add(image);

     //DEPSOTI LABEL-----------------------------------
     JLabel text=new JLabel("Enter the amount to deposit");
     text.setForeground(Color.BLACK);
     text.setFont(new Font("System",Font.BOLD,25));
     text.setBounds(170,160,4000,40);
     image.add(text);
        
     //BLANK BOW BELWO DEPOSIT STATEMNT----------------
     amount= new JTextField();
     amount.setFont(new Font("Serif",Font.BOLD,22));
     amount.setBounds(170,210,400,28);
     image.add(amount);

     //DEPOSIT BUTTON ----------------------------------- 
     deposit=new JButton("DEPOSIT");
     deposit.setFont(new Font("Serif",Font.BOLD,15));
     //deposit.setForeground(Color.BLACK);
     deposit.setBounds(550,340,150,30);
     deposit.addActionListener(this); 
     image.add(deposit);

     //BANK i.e. EXIT BUTTON ------------
     back=new JButton("BACK");
     back.setFont(new Font("Serif",Font.BOLD,15));
     //deposit.setForeground(Color.BLACK);
     back.setBounds(550,380,150,30);
     image.add(back);

     //FRAME LAYOUT----------------
     setSize(900, 900);
     setLocation(300,0);
     setVisible(true);

    }

    
    public void actionPerformed(ActionEvent ae){
        if( ae.getSource()==deposit){
          String number= amount.getText();
          Date date=new Date();
           if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter amount to deposit");
             }else {
                try{
                    Conn conn=new Conn();
                    String query="insert into bank values('"+pinnumber+"','"+date+"', 'Depsoit','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"RS"+number+"Depsosited Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                    }catch (Exception e){
                    System.out.println(e);
                    }

                }} else if(ae.getSource()==back){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            
                }



    }
    


    public static void main(String args[]){


     new Withdrawl("");
    }

}

    

