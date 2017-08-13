package AppPackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

int count = 0;
String pwd = "", masterpwd = "1234";
ImageIcon filled = new ImageIcon(getClass().getResource("/Resources/fill.JPG"));
ImageIcon unfilled = new ImageIcon();

public Login() {
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

public void control() {
    count++;
    switch (count) {
        case 1:
            lc1.setIcon(filled);
            break;
        case 2:
            lc2.setIcon(filled);
            break;
        case 3:
            lc3.setIcon(filled);
            break;
        case 4:
            lc4.setIcon(filled);
            if (pwd.equals(masterpwd)) {
                dispose();
                new Home().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Passcode");
                pwd = "";
            }
            lc1.setIcon(unfilled);
            lc2.setIcon(unfilled);
            lc3.setIcon(unfilled);
            lc4.setIcon(unfilled);
            count = 0;
            break;
    }
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        l0 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        lc1 = new javax.swing.JLabel();
        lc2 = new javax.swing.JLabel();
        lc3 = new javax.swing.JLabel();
        lc4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        forgotpassword = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIRMOB");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/info_48x48.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 840, 70, 70));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 860, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setPreferredSize(new java.awt.Dimension(20, 60));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 70));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 760, 100, 60));

        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 760, 120, 60));

        l0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l0MouseClicked(evt);
            }
        });
        getContentPane().add(l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 100, 110));

        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 110, 100));

        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, 100));

        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 100, 100));

        l4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 110, 100));

        l5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 110, 100));

        l6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 100, 100));

        l7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 110, 100));

        l8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 110, 100));

        l9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 110, 100));

        lc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lc1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 40, 50));

        lc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 40, 50));

        lc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 210, 40, 50));

        lc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 210, 40, 50));

        time.setFont(new java.awt.Font("DS-Digital", 0, 24)); // NOI18N
        time.setForeground(new java.awt.Color(102, 231, 231));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, 30));

        date.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(51, 255, 255));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 120, 30));

        forgotpassword.setForeground(new java.awt.Color(255, 255, 255));
        forgotpassword.setText("Forgot Password ?!!");
        forgotpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpasswordMouseClicked(evt);
            }
        });
        getContentPane().add(forgotpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 120, 30));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 840, -1, 80));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Close", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        pwd = "";
        count = 0;
        lc1.setIcon(unfilled);
        lc2.setIcon(unfilled);
        lc3.setIcon(unfilled);
        lc4.setIcon(unfilled);
    }//GEN-LAST:event_clearMouseClicked

    private void l0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l0MouseClicked
        pwd += "0";
        control();
    }//GEN-LAST:event_l0MouseClicked

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        pwd += "1";
        control();
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        pwd += "2";
        control();
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        pwd += "3";
        control();
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        pwd += "4";
        control();
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        pwd += "5";
        control();
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        pwd += "6";
        control();
    }//GEN-LAST:event_l6MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        pwd += "7";
        control();
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        pwd += "8";
        control();
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
        pwd += "9";
        control();
    }//GEN-LAST:event_l9MouseClicked

    private void forgotpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpasswordMouseClicked
        pwd = "";
        count = 0;
        lc1.setIcon(unfilled);
        lc2.setIcon(unfilled);
        lc3.setIcon(unfilled);
        lc4.setIcon(unfilled);
        try {
            String name = JOptionPane.showInputDialog(this, "Who Made this Awesome App");
            if (name.equalsIgnoreCase("praveen") || name.equalsIgnoreCase("praveen gupta") || name.equalsIgnoreCase("gupta")) {
                JOptionPane.showMessageDialog(this, "Yuuuup !!! , You are Correct!!!");
                JOptionPane.showMessageDialog(this, "Your Password is 1234");
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, You are Wrong");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_forgotpasswordMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        JOptionPane.showMessageDialog(this, "Please Enter Password");
    }//GEN-LAST:event_homeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        JOptionPane.showMessageDialog(this,"Please Login first");
    }//GEN-LAST:event_aboutMouseClicked

/**
 * @param args the command line arguments
 */
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
        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Login().setVisible(true);
    }

    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel back;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel close;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel forgotpassword;
    private javax.swing.JLabel home;
    private javax.swing.JLabel image;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel lc1;
    private javax.swing.JLabel lc2;
    private javax.swing.JLabel lc3;
    private javax.swing.JLabel lc4;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
