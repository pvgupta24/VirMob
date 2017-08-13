package AppPackage;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        new Thread() {
            public void run() {

                while (true) {
                    Calendar cal = new GregorianCalendar();
                    int h = cal.get(Calendar.HOUR);
                    int m = cal.get(Calendar.MINUTE);
                    int s = cal.get(Calendar.SECOND);
                    int ap = cal.get(Calendar.AM_PM);
                    String period;
                    if (ap == 0) {
                        period = "AM";
                    } else {
                        period = "PM";
                    }
                    if (h < 10) {
                        h = Integer.parseInt("0" + h);
                    }
                    if (m < 10) {
                        m = Integer.parseInt("0" + m);
                    }
                    if (s < 10) {
                        s = Integer.parseInt("0" + s);
                    }

                    time.setText(h + " : " + m + " : " + s + "  " + period);
                    int day = cal.get(Calendar.DATE);
                    int mon = cal.get(Calendar.MONTH)+1;
                    int year = cal.get(Calendar.YEAR);
                    date.setText(day + " / " + mon + " / " + year);

                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bullsandcows = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contacts = new javax.swing.JLabel();
        calcy = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIRMOB");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/info_48x48.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 840, 100, 80));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 860, -1, -1));

        jLabel10.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel10.setText("Bulls and cows");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 190, 30));

        bullsandcows.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        bullsandcows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bullcow.png"))); // NOI18N
        bullsandcows.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bullsandcows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bullsandcowsMouseClicked(evt);
            }
        });
        getContentPane().add(bullsandcows, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 160, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 844, 60, 70));

        time.setFont(new java.awt.Font("DS-Digital", 1, 36)); // NOI18N
        time.setForeground(new java.awt.Color(11, 45, 149));
        time.setBorder(null);
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 59));

        date.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 170, 50));

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel4.setText("CONTACTS");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 110, 30));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel6.setText("CALCULATOR");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 140, 30));

        contacts.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        contacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cont.png"))); // NOI18N
        contacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactsMouseClicked(evt);
            }
        });
        getContentPane().add(contacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, 160));

        calcy.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        calcy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cal.png"))); // NOI18N
        calcy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcyMouseClicked(evt);
            }
        });
        getContentPane().add(calcy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backgrnd.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, 700));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setPreferredSize(new java.awt.Dimension(20, 60));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        setSize(new java.awt.Dimension(452, 939));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void contactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactsMouseClicked
        dispose();
        new Select_Contact().setVisible(true);    }//GEN-LAST:event_contactsMouseClicked

    private void calcyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcyMouseClicked
        dispose();
        new Calcy().setVisible(true);    }//GEN-LAST:event_calcyMouseClicked

    private void bullsandcowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bullsandcowsMouseClicked
        dispose();
        new CowsBulls().setVisible(true);
    }//GEN-LAST:event_bullsandcowsMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        dispose();
        new About().setVisible(true);

    }//GEN-LAST:event_aboutMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String sql = "create database VirtualMobile";
        String sql2 = "create table contacts (ContactID varchar(6) primary key,FirstName varchar(20),"
                + "MiddleName varchar(20),LastName varchar(20),NickName varchar(20),DateOfBirth date,MobileNo1 bigint,"
                + "MobileNo2 bigint,TelephoneNo bigint,EmailID varchar(30),Address varchar(150),`Group` varchar(20),"
                + "Image varchar(150))";
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            Statement s = con.createStatement();
            s.executeUpdate(sql);
            s.close();
            con.close();
        } catch (Exception e) {
        }
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
            Statement s = con.createStatement();
            s.executeUpdate(sql2);
            s.close();
            con.close();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
        new Select_Contact().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dispose();
        new Calcy().setVisible(true);    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        dispose();
        new CowsBulls().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel bullsandcows;
    private javax.swing.JLabel calcy;
    private javax.swing.JLabel contacts;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
