/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;
import log.signup;
import java.util.Random;
import java.io.*;
import javax.swing.*;
import java.awt.event.WindowEvent;

 
public class login extends javax.swing.JFrame {

    
    public String user,password,repassword,captcha;
   Boolean r;int rand,random;
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        p3 = new javax.swing.JPasswordField();
        t4 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        t2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label_icon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_heading = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3);
        t3.setBounds(870, 340, 187, 31);

        jLabel10.setText("Create username");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(666, 348, 140, 16);

        jLabel11.setText("Create Password");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(668, 407, 140, 16);

        jLabel12.setText("Re-confirm password");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(668, 475, 160, 16);

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2);
        p2.setBounds(870, 400, 187, 33);

        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        getContentPane().add(p3);
        p3.setBounds(870, 460, 187, 33);

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4);
        t4.setBounds(825, 594, 174, 32);

        Random rand = new Random();
        String ran=String.valueOf(rand);
        ran=ran.substring(17);
        l2.setText(ran);
        l2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(l2);
        l2.setBounds(758, 517, 156, 39);

        jLabel5.setText("Enter Captcha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(676, 594, 137, 32);

        b2.setText("Sign Up");
        b2.setBorder(null);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(820, 670, 69, 30);

        Random random = new Random();
        String rando=String.valueOf(random);
        rando=rando.substring(17);
        l1.setText(String.valueOf(rando));
        l1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(l1);
        l1.setBounds(156, 498, 146, 42);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Sign In for existing users");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(86, 296, 170, 16);

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1);
        p1.setBounds(206, 430, 202, 31);

        t2.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(215, 561, 187, 31);

        jLabel14.setText("Enter Captcha");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 565, 150, 20);

        jButton1.setText("Exit");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 670, 60, 30);

        b1.setText("Sign In");
        b1.setBorder(null);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(200, 670, 69, 30);

        jLabel4.setText("password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 437, 89, 16);

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(206, 371, 202, 31);

        jLabel2.setText("username  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 374, 77, 25);

        label_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/pa 1 - Copy.png"))); // NOI18N
        getContentPane().add(label_icon);
        label_icon.setBounds(840, 26, 204, 207);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/pa2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 36, 154, 158);

        label_heading.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        label_heading.setForeground(new java.awt.Color(0, 153, 204));
        label_heading.setText("PERSONAL FINANCIAL ASSISTANT");
        getContentPane().add(label_heading);
        label_heading.setBounds(301, 95, 452, 83);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Sign up as new user");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(757, 295, 130, 18);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/60961.png"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(942, 509, 49, 47);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/log/60961.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 493, 45, 47);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel1.setText("A Netsys Product");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1000, 730, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel6.setText("   © Swapnil Sourabh ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(990, 750, 210, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        user=t3.getText();
    }//GEN-LAST:event_t3ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        password=p2.getText();
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        repassword=p3.getText();
    }//GEN-LAST:event_p3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed

        captcha=t4.getText();
    }//GEN-LAST:event_t4ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        int flg=0;

      try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
           
            String line,line1;
             
            while ((line=bufferedReader.readLine())!= null) {
               if(line.equals(t3.getText()))
                       flg=1;
               if(line.equals(p2.getText()))
                       flg=2;
               }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
      if(flg==1)
          JOptionPane.showMessageDialog(null,"Username already exists ","Sign up Error",JOptionPane.ERROR_MESSAGE);
      if(flg==2)
          JOptionPane.showMessageDialog(null,"Please use a different password","Sign up Error",JOptionPane.ERROR_MESSAGE);
      else if(flg==0){
             if(p2.getText().equals(p3.getText())&& t4.getText().equals(l2.getText()))
                {

                BufferedWriter bw = null;

                 try {
                     // APPEND MODE SET HERE
                  bw = new BufferedWriter(new FileWriter("text1.txt", true));
                  bw.write(t3.getText());bw.newLine();
                  bw.write(p2.getText());bw.newLine();
	 
                 bw.flush();
                    } catch (IOException ioe) {
                     ioe.printStackTrace();
                      } finally {                    
                     if (bw != null) try {
                        bw.close();
                     } catch (IOException ioe2) {
                        
                         }
                     }
        
                       this.setVisible(false);
                    signup s2=new signup();
                        s2.setVisible(true);
                            }
                          else if(t4.getText().equals(l2.getText())==false)
                        JOptionPane.showMessageDialog(null,"Enter valid Captcha","Wrong Captcha",JOptionPane.ERROR_MESSAGE);
                      else
                          JOptionPane.showMessageDialog(null,"Password in both filed should match","Sign up Error",JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_b2ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed

        // jPasswordField1.setToolTipText("Password must contain at least 8 characters");
    }//GEN-LAST:event_p1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       
   int flg=0,k;

      try {
            FileReader reader = new FileReader("text1.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
           
            String line,line1;
             
            while ((line=bufferedReader.readLine())!= null) {
               if(line.equals(t1.getText()))
               {
               line1=bufferedReader.readLine();
              
               if(line1.equals(p1.getText()))
               {flg=1;
               
            }
            }}
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
     
       if(t2.getText().equals(l1.getText())==false)
          JOptionPane.showMessageDialog(null,"Enter valid Captcha","Wrong Captcha",JOptionPane.ERROR_MESSAGE);
       else if(flg==1)
      {this.setVisible(false);
        portfolio s=new portfolio();
        s.setVisible(true);}
      else
      {JOptionPane.showMessageDialog(null,"Please Enter Correct login details","Login Unsuccesful",JOptionPane.ERROR_MESSAGE);
      t1.setText(null);
      p1.setText(null);
      } 
    }//GEN-LAST:event_b1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed

    }//GEN-LAST:event_t1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Random rand = new Random();
        String ran=String.valueOf(rand);
        ran=ran.substring(17);
        l2.setText(ran);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 Random random = new Random();
        String rando=String.valueOf(random);
        rando=rando.substring(17);
        l1.setText(rando);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel label_heading;
    private javax.swing.JLabel label_icon;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
private void systemExit()
{
    WindowEvent winCloseing =new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
}
    
}
