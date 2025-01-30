package bank.management.system;

import java.awt.*;
//import java.util.Random;
import javax.swing.*;
//import com.toedter.calendar.JDateChooser;

//import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame {

   SignupTwo(){
       
       setLayout(null);
       setTitle("New Account Application Form-2");
    
       
       JLabel additionaldetails = new JLabel("Page 2 :Additional Details");
       additionaldetails.setFont(new Font("SERIF", Font.BOLD, 40));
       additionaldetails.setBounds(210 , 40 , 2000 , 70);
       additionaldetails.setForeground(Color.decode("#D35323"));
      // Component additonaldetails;
           add(additionaldetails);
      //------------------------------------------------------- 
       JLabel religionlb = new JLabel("Religion:"); 
       religionlb.setFont(new Font("SanSerif", Font.BOLD,  20));;    
       religionlb.setBounds(100,140,100,30);
       religionlb.setForeground(Color.decode("#FFFBE4"));
       add(religionlb);

       String valReligion[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
       JComboBox religion=new JComboBox(valReligion);
       religion.setBounds(300, 140, 400, 30);
       religion.setBackground(Color.decode("#FFFBE4"));
       add(religion);
      //-------------------------------------------------------------- 
       JLabel fname = new JLabel("Category:");
       fname.setFont(new Font("Dialog_Input", Font.BOLD, 22));
       fname.setBounds(100,  190 ,  200 , 30);
       fname.setForeground(Color.decode("#FFFBE4"));
       add(fname);

       String valcategory[]={"GENERAL","OBC","SC","ST","OTHER"};
       JComboBox category= new JComboBox(valcategory);
       category.setBounds(300, 190, 400, 30);
       category.setBackground(Color.decode("#FFFBE4"));
       add(category);      
      //--------------------------------------------------------------- 
       JLabel  dob = new JLabel("Income:");
        dob.setFont(new Font("SanSerif", Font.BOLD, 22));
        dob.setBounds(100,  240 ,  200 , 30);
        dob.setForeground(Color.decode("#FFFBE4"));
        
       add( dob);

      String incomecategory[] = {"NULL", "<1,50,000", "<2,50,000", "<5,00,000", "UPTO 10,00,000"};
        JComboBox income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);  // Corrected position
        income.setBackground(Color.decode("#FFFBE4"));
        add(income);
       
       JTextField incomeTextField = new JTextField();
       incomeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       incomeTextField.setBounds(300, 240, 400, 30);
       add(incomeTextField);
     //-----------------------------------------------------------------------  
       JLabel  gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100,  300 ,  200 , 30);
        gender.setForeground(Color.decode("#FFFBE4"));
       add( gender);
      
       JLabel  email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100,  330 ,  200 , 30);
        email.setForeground(Color.decode("#FFFBE4"));
       add( email);

       String educationValues[] = {"NON-GRADUATE", "GRADUATE", "POST-GRADUATE", "DOCTRATE", "OTHER"};
        JComboBox education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);  // Corrected position
        education.setBackground(Color.decode("#FFFBE4"));
        add(education);
      //-----------------------------------------------------------------
        JLabel  marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100,  390 ,  200 , 30);
        marital.setForeground(Color.decode("#FFFBE4"));
       add( marital);

       String ocupationValues[] = {"SALARIED", "SELF-EMPLOYED", "BUSINESS", "RETIRED","STUDENT" ,"OTHER"};
        JComboBox ocupation = new JComboBox(ocupationValues);
        ocupation.setBounds(300, 390, 400, 30);  // Corrected position
        ocupation.setBackground(Color.decode("#FFFBE4"));
        add(ocupation);
       //-----------------------------------------------------
       
       
       
      
       
       /*ButtonGroup maritalgroup = new ButtonGroup();
       maritalgroup.add(married);
       maritalgroup.add(unmarried);
       maritalgroup.add(other);*/
       
       
       
        JLabel  address = new JLabel("Pan No: ");
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100,  440 ,  200 , 30);
        add( address);
        
        JTextField addressTextField = new JTextField();
       addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       addressTextField.setBounds(300, 440, 400, 30);
       add(addressTextField);        
        
        JLabel  city = new JLabel("Aadhar no: ");
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100,  490 ,  200 , 30);
        add( city);
       
       JTextField cityTextField = new JTextField();
       cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       cityTextField.setBounds(300, 490, 400, 30);
       add(cityTextField);
        
        JLabel  state = new JLabel("Senior Citizen:  ");
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100,  540 ,  200 , 30);
        add( state);
        
        JTextField stateTextField = new JTextField();
       stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       stateTextField.setBounds(300, 540, 400, 30);
       add(stateTextField);

        JLabel  pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100,  590 ,  200 , 30);
        add( pincode);
        
        JTextField pinTextField = new JTextField();
       pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
       pinTextField.setBounds(300, 590, 400, 30);
       add(pinTextField); 
       
       
       JButton next = new JButton("next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway", Font.BOLD, 14));
       next.setBounds(620, 660,80,30);
       add(next);
       
       //getContentPane().setBackground(Color.decode("#C8A8E9"));
       getContentPane().setBackground(Color.decode("#96B898"));
       
       setSize(850 , 800);
       setLocation(350 , 10);
       setVisible(true);
        
   }       
   
    public static void main(String args[]) {
      
        new SignupTwo();
        
    }
  
}