package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.*;


public class SignupTwo extends JFrame{

  JTextField incomeTextField,pan,aadhar;
  JButton next;
  JRadioButton syes,sno,eyes,eno;
  JComboBox occupation,education,religion,category,income;
  String formno;
  

   SignupTwo(String formno){
      this.formno=formno; 
      setLayout(null);
      setTitle("New Account Application Form-2");
    
       
      JLabel additionaldetails = new JLabel("Page 2 :Additional Details");
      additionaldetails.setFont(new Font("SERIF", Font.BOLD, 40));
      additionaldetails.setBounds(210 , 40 , 2000 , 70);
      additionaldetails.setForeground(Color.decode("#FFE785"));
      // Component additonaldetails;
      add(additionaldetails);
      //------------------------RELIGION------------------------------- 
      JLabel religionlb = new JLabel("Religion:"); 
      religionlb.setFont(new Font("SanSerif", Font.BOLD,  20));;    
      religionlb.setBounds(100,140,100,30);
      religionlb.setForeground(Color.decode("#FFFBE4"));
      add(religionlb);

      String valReligion[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","OTHER"};
      religion=new JComboBox(valReligion);
      religion.setBounds(300, 140, 400, 30);
      religion.setBackground(Color.decode("#FFFBE4"));
      add(religion);
      //--------------------CATEGORY------------------------------------------ 
      JLabel categorylb = new JLabel("Category:");
      categorylb.setFont(new Font("Dialog_Input", Font.BOLD, 22));
      categorylb.setBounds(100,  190 ,  200 , 30);
      categorylb.setForeground(Color.decode("#FFFBE4"));
      add(categorylb);

      String valcategory[]={"GENERAL","OBC","SC","ST","OTHER"};
      category= new JComboBox(valcategory);
      category.setBounds(300, 190, 400, 30);
      category.setBackground(Color.decode("#FFFBE4"));
      add(category);      
      //------------------INCOME--------------------------------------------- 
      JLabel  incomelb = new JLabel("Income:");
      incomelb.setFont(new Font("SanSerif", Font.BOLD, 22));
      incomelb.setBounds(100,  240 ,  200 , 30);
      incomelb.setForeground(Color.decode("#FFFBE4"));
      add( incomelb);

      String incomecategory[] = {"NULL", "<1,50,000", "<2,50,000", "<5,00,000", "UPTO 10,00,000"};
      income = new JComboBox(incomecategory);
      income.setBounds(300, 240, 400, 30);  // Corrected position
      income.setBackground(Color.decode("#FFFBE4"));
      add(income);
       
      JTextField incomeTextField = new JTextField();
      incomeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
      incomeTextField.setBounds(300, 240, 400, 30);
      add(incomeTextField);
      //-----------------EDUCATION------------------------------------------------------  
      JLabel  edu = new JLabel("Educational ");
      edu.setFont(new Font("Raleway", Font.BOLD, 22));
      edu.setBounds(100,  300 ,  200 , 30);
      edu.setForeground(Color.decode("#FFFBE4"));
      add(edu);
      
      JLabel  qualifn = new JLabel("Qualification:");
      qualifn.setFont(new Font("Raleway", Font.BOLD, 22));
      qualifn.setBounds(100,  330 ,  200 , 30);
      qualifn.setForeground(Color.decode("#FFFBE4"));
      add(qualifn);

      String educationValues[] = {"NON-GRADUATE", "GRADUATE", "POST-GRADUATE", "DOCTRATE", "OTHER"};
      education = new JComboBox(educationValues);
      education.setBounds(300, 315, 400, 30);  // Corrected position
      education.setBackground(Color.decode("#FFFBE4"));
      add(education);
      //----------------OCCUPATION-------------------------------------------------
      JLabel  occupn = new JLabel("Occupation: ");
      occupn.setFont(new Font("Raleway", Font.BOLD, 22));
      occupn.setBounds(100,  390 ,  200 , 30);
      occupn.setForeground(Color.decode("#FFFBE4"));
      add(  occupn);

      String occupationValues[] = {"SALARIED", "SELF-EMPLOYED", "BUSINESS", "RETIRED","STUDENT" ,"OTHER"};
      occupation = new JComboBox(occupationValues);
      occupation.setBounds(300, 390, 400, 30);  // Corrected position
      occupation.setBackground(Color.decode("#FFFBE4"));
      add(occupation);
      //---------------PAN NO--------------------------------------
       
      JLabel  panNo = new JLabel("Pan No: ");
      panNo.setFont(new Font("Raleway", Font.BOLD, 22));
      panNo.setBounds(100,  440 ,  200 , 30);
      add( panNo);
        
      JTextField pan = new JTextField();
      pan.setFont(new Font("Raleway", Font.BOLD, 14));
      pan.setBounds(300, 440, 400, 30);
      add(pan);        
      //-------------AADHAR NO-------------------------------------- 
      JLabel  aadharNo= new JLabel("Aadhar no: ");
      aadharNo.setFont(new Font("Raleway", Font.BOLD, 22));
      aadharNo.setBounds(100,  490 ,  200 , 30);
      add( aadharNo);
       
      JTextField aadhar = new JTextField();
      aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
      aadhar.setBounds(300, 490, 400, 30);
      add(aadhar);
      //----------------SENIOR CITIZEN--------------------------------------------------- 
      JLabel  state = new JLabel("Senior Citizen:  ");
      state.setFont(new Font("Raleway", Font.BOLD, 22));
      state.setBounds(100,  540 ,  200 , 30);
      add( state);
        
      syes=new JRadioButton("YES");
      syes.setBounds(300,540,90,30) ;
      syes.setBackground(Color.decode("#FFE785"));
      add(syes);
       
      sno=new JRadioButton("NO");
      sno.setBounds(400,540,90,30) ;
      sno.setBackground(Color.decode("#FFE785"));
      add(sno);

      ButtonGroup snrctzgrp= new ButtonGroup();
      snrctzgrp.add(syes);
      snrctzgrp.add(sno);


      //-------------EXISTING ACCOUNT------------------------------------------------
      JLabel exacclb= new JLabel("Existing Account: ");
      exacclb.setFont(new Font("Raleway", Font.BOLD, 22));
      exacclb.setBounds(100,  590 ,  200 , 30);
      add( exacclb);
        
      eyes=new JRadioButton("YES");
      eyes.setBounds(300,590,90,30) ;
      eyes.setBackground(Color.decode("#FFE785"));
      add(eyes);
       
      eno=new JRadioButton("NO");
      eno.setBounds(400,590,90,30) ;
      eno.setBackground(Color.decode("#FFE785"));
      add(eno);

      ButtonGroup exsaccgrp= new ButtonGroup();
      exsaccgrp.add(eyes);
      exsaccgrp.add(eno);
       
      //----------------------------------------------------
       
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
   
   public void actionPerformed(ActionEvent ae){
      String panString = pan.getText();
      String aadharString = aadhar.getText() ;
    
      String sreligion =(String) religion.getSelectedItem();
      String scategory = (String)category.getSelectedItem();
      String sincome = (String)income.getSelectedItem();
      String seducation = (String)education.getSelectedItem();
      String soccupation = (String)occupation.getSelectedItem();
      String seniorcitizen = null;
      
      if (syes.isSelected()){
        seniorcitizen = "YES";
     }
      else if (sno.isSelected()){
        seniorcitizen = "NO";
      }
      
      String existingaccount = null;
      if (eyes.isSelected()) {
        existingaccount = "YES";
      }
      else if (eno.isSelected()) {
        existingaccount = "NO";
      } 
     try {
       Conn c = new Conn();
        String query = "INSERT INTO signuptwo VALUES('" + formno + "', '" + sreligion + "','" + scategory + "', '"
        + sincome+ "', '" + soccupation + "', '" + seducation + "', '" + seniorcitizen + "','" + existingaccount + "','" + panString + "','"+ aadharString +"')";

        c.s.executeUpdate(query);

        setVisible(false);
        new SignupTwo(formno).setVisible(true);
       //SINGUP3 OBJECT
      }catch (Exception e) {

      }
    }
  

    
   
    public static void main(String[] args)
    {
      
        new SignupTwo("");
        
    }
}
  