package  Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class CheckMyProfile implements ActionListener
    {
        JLabel ld,ld1,ld2,ld3,ld4,ld5,ld6,ld7,ld8,ld9;
        JFrame f;
        JTextField t1,t2,t3,t4,t5,t6,t7,t8;
        JButton b,b1;
        ResultSet rest0,rest;
        public int login_id,login__id;
        String q2;
           
        CheckMyProfile(String admin_id,int login__id)
            {
                login_id=login__id;
                
                try
                {
                    ConnectionClass obj=new ConnectionClass();
                    if(login__id==1)
                    {
                        String q="select * from doctor where username ='"+admin_id+"'";
                        rest0=obj.stm.executeQuery(q);
                    }
                    else if(login__id==2)
                    {
                        String q="select * from patient where username='"+admin_id+"'";
                        rest0=obj.stm.executeQuery(q);
                    }
                    else if(login__id==3)
                    {
                        String q="select * from receptionist where username='"+admin_id+"'";
                        rest0=obj.stm.executeQuery(q);
                    }
                    else if(login__id==4)
                    {
                        String q="select * from admin where username='"+admin_id+"'";
                        rest0=obj.stm.executeQuery(q);
                    }
                if(rest0.next())
                {
                    f=new JFrame("My Profile");
                    f.setBackground(Color.WHITE);
                    f.setLayout(null);

                    ld=new JLabel();
                    ld.setBounds(0,0,900,450);
                    ld.setLayout(null);

                    ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Hospital/Icon/CheckMyProfile_Img.jpg"));
                    Image i1=img.getImage().getScaledInstance(900,450,Image.SCALE_SMOOTH);
                    ImageIcon img1=new ImageIcon(i1);
                    ld.setIcon(img1);

                    ld1=new JLabel("Edit My Details");
                    ld1.setBounds(280,30,500,50);
                    ld1.setFont(new Font("Arial",Font.BOLD,30));
                    ld1.setForeground(Color.black);
                    ld.add(ld1);
                    f.add(ld);

                    ld2=new JLabel("My Id");
                    ld2.setBounds(50,150,150,30);
                    ld2.setFont(new Font("Arial",Font.BOLD,20));
                    ld2.setForeground(Color.BLACK);
                    ld.add(ld2);

                    t1=new JTextField();
                    t1.setBounds(200,150,150,30);
                    t1.setEditable(false);
                    ld.add(t1); 

                    ld3=new JLabel("Username");
                    ld3.setBounds(450,150,200,30);
                    ld3.setFont(new Font("Arial",Font.BOLD,20));
                    ld3.setForeground(Color.BLACK);
                    ld.add(ld3);

                    t2=new JTextField();
                    t2.setBounds(600,150,150,30);
                    t2.setEditable(false);
                    ld.add(t2);

                    ld4=new JLabel("Name");
                    ld4.setBounds(50,200,100,30);
                    ld4.setFont(new Font("Arial",Font.BOLD,20));
                    ld4.setForeground(Color.BLACK);
                    ld.add(ld4);

                    t3=new JTextField();
                    t3.setBounds(200,200,150,30);
                    ld.add(t3);

                    ld5=new JLabel("Age");
                    ld5.setBounds(450,200,200,30);
                    ld5.setFont(new Font("Arial",Font.BOLD,20));
                    ld5.setForeground(Color.BLACK);
                    ld.add(ld5);

                    t4=new JTextField();
                    t4.setBounds(600,200,150,30);
                    ld.add(t4);

                    ld6=new JLabel("Phone");
                    ld6.setBounds(50,250,100,30);
                    ld6.setFont(new Font("Arial",Font.BOLD,20));
                    ld6.setForeground(Color.BLACK);
                    ld.add(ld6);

                    t5=new JTextField();
                    t5.setBounds(200,250,150,30);
                    ld.add(t5);

                    ld7=new JLabel("City");
                    ld7.setBounds(450,250,100,30);
                    ld7.setFont(new Font("Arial",Font.BOLD,20));
                    ld7.setForeground(Color.BLACK);
                    ld.add(ld7);

                    t6=new JTextField();
                    t6.setBounds(600,250,150,30);
                    ld.add(t6);

                    ld8=new JLabel("Email");
                    ld8.setBounds(50,300,100,30);
                    ld8.setFont(new Font("Arial",Font.BOLD,20));
                    ld8.setForeground(Color.BLACK);
                    ld.add(ld8);

                    t7=new JTextField();
                    t7.setBounds(200,300,150,30);
                    ld.add(t7);

                    ld9=new JLabel("Gender");
                    ld9.setBounds(450,300,100,30);
                    ld9.setFont(new Font("Arial",Font.BOLD,20));
                    ld9.setForeground(Color.BLACK);
                    ld.add(ld9);

                    t8=new JTextField();
                    t8.setBounds(600,300,150,30);
                    t8.setEditable(false);
                    ld.add(t8);
                try
                    {
                        ConnectionClass obj1=new ConnectionClass();
                        if(login_id==0)
                        {
                            String q="select * from admin where admin_id='"+admin_id+"'";
                            rest0=obj1.stm.executeQuery(q);
                        }
                        else if(login_id==3)
                        {
                            String q="select * from receptionist where username='"+admin_id+"'";
                            rest0=obj1.stm.executeQuery(q);
                        }
                        else if(login_id==2)
                        {
                            String q="select * from patient where username ='"+admin_id+"'";
                            rest0=obj1.stm.executeQuery(q);
                        }
                        else if(login_id==1)
                        {
                            String q="select * from doctor where username='"+admin_id+"'";
                            rest0=obj1.stm.executeQuery(q);
                        }
                        while(rest0.next())
                            {
                                if(login_id==1)
                                    {
                                        t1.setText(rest0.getString("doc_id"));
                                    }
                                else if(login_id==2)
                                    {
                                        t1.setText(rest0.getString("pat_id"));
                                    }
                                else if(login_id==3)
                                    {
                                        t1.setText(rest0.getString("res_id"));
                                    }
                                else if(login_id==4)
                                    {
                                        t1.setText(rest0.getString("admin_id"));
                                    }
                                t2.setText(rest0.getString("Username"));
                                t3.setText(rest0.getString("name"));
                                t4.setText(rest0.getString("age"));
                                t5.setText(rest0.getString("phone"));
                                t6.setText(rest0.getString("city"));
                                t7.setText(rest0.getString("email"));
                                t8.setText(rest0.getString("gender"));
                            }
                    }
                catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }
                b =new JButton("Update");
                b.setBackground(Color.BLACK);
                b.setForeground(Color.WHITE);
                b.setBounds(250, 350, 150, 40);
                ld.add(b);
                
                b1=new JButton("Cancel");
                b1.setBackground(Color.RED);
                b1.setForeground(Color.WHITE);
                b1.setBounds(450, 350, 150, 40);
                ld.add(b1);
                
                b.addActionListener(this);
                b1.addActionListener(this);
                
                f.setVisible(true);
                f.setSize(900,450);
                f.setLocation(300,100);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Record not found,Please fill the right admin_id !");
                }
            }
                catch(Exception ex)
                    {
                        ex.printStackTrace();    
                    }
            }
        public void actionPerformed (ActionEvent e)
            {
                if(e.getSource()==b)
                    {
                        String ad_id = t1.getText();
                        String age = t4.getText();
                        String phone = t5.getText();
                        String city = t6.getText();
                        String email = t7.getText();
                        
                        try
                            {
                                ConnectionClass obj2 = new ConnectionClass();
                                if(login__id==0)
                                    {
                                        q2="update admin set age='"+age+"',phone='"+phone+"',city='"+city+"',email='"+email+"' where admin_id='"+ad_id+"'"; 
                                    }
                                else if(login__id==3)
                                    {
                                       q2="update receptionist set age='"+age+"',phone='"+phone+"',city='"+city+"',email='"+email+"' where res_id='"+ad_id+"'";                                   
                                    }
                                else if(login__id==2)
                                    {
                                        q2="update patient set age='"+age+"',phone='"+phone+"',city='"+city+"',email='"+email+"' where pat_id='"+ad_id+"'";                                   
                                    }
                                else if(login__id==1)
                                    {
                                        q2="update doctor set age='"+age+"',phone='"+phone+"',city='"+city+"',email='"+email+"' where username='"+ad_id+"'";                                   
                                    }
                                obj2.stm.executeUpdate(q2);
                                JOptionPane.showMessageDialog(null, "Your Details Succesfully Updated");
                                f.setVisible(false);
                            }
                        catch(Exception ee)
                            {
                                ee.printStackTrace();
                            }
                    }
                if (e.getSource()==b1)
                    {
                        f.setVisible(false);
                    }
            }
    }