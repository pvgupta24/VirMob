package AppPackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JOptionPane;

public class Calcy extends javax.swing.JFrame {

    String display;

    public Calcy() {
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

        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        bkspc = new javax.swing.JLabel();
        reciprocal = new javax.swing.JLabel();
        divide = new javax.swing.JLabel();
        multiply = new javax.swing.JLabel();
        minus = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        equal = new javax.swing.JLabel();
        dot = new javax.swing.JLabel();
        l0 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIRMOB");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/info_48x48.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 850, 70, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setPreferredSize(new java.awt.Dimension(20, 60));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 20, 60, 60);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 110));

        t1.setFont(new java.awt.Font("sansserif", 0, 72)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 120));

        bkspc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bkspc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bkspcMouseClicked(evt);
            }
        });
        jPanel1.add(bkspc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 100, 110));

        reciprocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reciprocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reciprocalMouseClicked(evt);
            }
        });
        jPanel1.add(reciprocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 100, 110));

        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divideMouseClicked(evt);
            }
        });
        jPanel1.add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 100, 110));

        multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyMouseClicked(evt);
            }
        });
        jPanel1.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, 120));

        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
        });
        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 410, 110, 110));

        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 100, 110));

        equal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalMouseClicked(evt);
            }
        });
        jPanel1.add(equal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 100, 110));

        dot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotMouseClicked(evt);
            }
        });
        jPanel1.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 100, 110));

        l0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l0MouseClicked(evt);
            }
        });
        jPanel1.add(l0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 210, 110));

        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 100, 120));

        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 105, 110));

        l4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 100, 110));

        l5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 410, 100, 110));

        l6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 105, 110));

        l7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 105, 120));

        l8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });
        jPanel1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 100, 120));

        l9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });
        jPanel1.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 100, 110));

        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 530, 100, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 774, 60, 60));
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        date.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 204));
        date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 120, 30));

        time.setFont(new java.awt.Font("DS-Digital", 1, 24)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 204));
        time.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        time.setBorder(null);
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 170, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 790, 110, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 80, 430, 850);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Calc.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 465, 950);

        setSize(new java.awt.Dimension(462, 948));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reciprocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reciprocalMouseClicked
   try {
            Double n = Double.parseDouble(t1.getText());
            n=(1/n)*1000000;
            n=(double)Math.round(n);
            t1.setText("" + n/1000000);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Incorrect value for reciprocal");
            t1.setText("");
        }
          }//GEN-LAST:event_reciprocalMouseClicked

    private void multiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyMouseClicked
display = t1.getText();
        t1.setText(display + "*");    }//GEN-LAST:event_multiplyMouseClicked

    private void divideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divideMouseClicked
display = t1.getText();
        t1.setText(display + "/");    }//GEN-LAST:event_divideMouseClicked

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
display = t1.getText();
        t1.setText(display + "-");        // TODO add your handling code here:
    }//GEN-LAST:event_minusMouseClicked

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseClicked
display = t1.getText();
        t1.setText(display + "+");        // TODO add your handling code here:
    }//GEN-LAST:event_plusMouseClicked

    private void dotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotMouseClicked
display = t1.getText();
        t1.setText(display + ".");        // TODO add your handling code here:
    }//GEN-LAST:event_dotMouseClicked

    private void l0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l0MouseClicked
display = t1.getText();
        t1.setText(display + "0");        // TODO add your handling code here:
    }//GEN-LAST:event_l0MouseClicked

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
display = t1.getText();
        t1.setText(display + "1");        // TODO add your handling code here:
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
display = t1.getText();
        t1.setText(display + "2");        // TODO add your handling code here:
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
display = t1.getText();
        t1.setText(display + "3");        // TODO add your handling code here:
    }//GEN-LAST:event_l3MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
display = t1.getText();
        t1.setText(display + "6");        // TODO add your handling code here:
    }//GEN-LAST:event_l6MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
display = t1.getText();
        t1.setText(display + "5");        // TODO add your handling code here:
    }//GEN-LAST:event_l5MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
display = t1.getText();
        t1.setText(display + "4");        // TODO add your handling code here:
    }//GEN-LAST:event_l4MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
display = t1.getText();
        t1.setText(display + "7");        // TODO add your handling code here:
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
display = t1.getText();
        t1.setText(display + "8");        // TODO add your handling code here:
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
display = t1.getText();
        t1.setText(display + "9");        // TODO add your handling code here:
    }//GEN-LAST:event_l9MouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
 t1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void bkspcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkspcMouseClicked
       int n = t1.getText().length();
        t1.setText(t1.getText().substring(0, n - 1)); // TODO add your handling code here:
    }//GEN-LAST:event_bkspcMouseClicked

    private void equalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseClicked
ScriptEngineManager SEM = new ScriptEngineManager();
        ScriptEngine SE = SEM.getEngineByName("JavaScript");
        try {
            Double op = (Double) SE.eval(t1.getText());
            op *= 1000000;
            op = (double) Math.round(op);
            op/=1000000;
            t1.setText(op + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_equalMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
dispose();
new Home().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
        new About().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Calcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkspc;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel date;
    private javax.swing.JLabel divide;
    private javax.swing.JLabel dot;
    private javax.swing.JLabel equal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JLabel minus;
    private javax.swing.JLabel multiply;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel reciprocal;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
