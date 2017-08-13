package AppPackage;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CowsBulls extends javax.swing.JFrame {

int cows1 = 0, cows2 = 0, bulls1 = 0, bulls2 = 0;
String n1, n2, p1, p2, text;

public CowsBulls() {
    initComponents();
}

public void check() {
    if (bulls1 == 4 || bulls2 == 4) {
        if (bulls1 == 4) {
            JOptionPane.showMessageDialog(this, "Player 1 Won");
        } else {
            JOptionPane.showMessageDialog(this, "Player2  Won");
        }
        DefaultTableModel tb = (DefaultTableModel) tb1.getModel();
        tb.setRowCount(0);
        tb1.setModel(tb);
        tb2.setModel(tb);

        int confirm = JOptionPane.showConfirmDialog(this, "Do you want to start a new game??", "New Game", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            newgame();
        } else {
            dispose();
            new Home().setVisible(true);
        }
    }
    bulls1 = 0;
    bulls2 = 0;
    cows1 = 0;
    cows2 = 0;

}

public String namedialog(String inpt) {
    String inputValue = JOptionPane.showInputDialog(inpt);

    if (inputValue == null || inputValue.length() != 4) {
        JOptionPane.showMessageDialog(this, "Check Input : Enter a valid 4 digit distinct number");
        inputValue = namedialog(inpt);
    }

    return inputValue;
}

public void newgame() {
    instructions.setVisible(false);
    t1.setText("");
    t2.setText("");
    n1 = "";
    n2 = "";
    p1 = JOptionPane.showInputDialog("Player 1 , Enter Your Name");
    if (p1.isEmpty()) {
        p1 = "Player 1";
    }
    l1.setText(p1);
    n2 = namedialog(p1 + ", Enter your 4 Distinct Digits Secret Number");

    p2 = JOptionPane.showInputDialog("Player 2 , Enter Your Name");
    if (p2.isEmpty()) {
        p2 = "Player 2";
    }

    l2.setText(p2);
    n1 = namedialog(p2 + ", Enter your 4 Distinct Digits Secret Number");

}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructions = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        t1 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIRMOB");
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        instructions.setBackground(new java.awt.Color(225, 255, 225));
        instructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructions.setText("<HTML><CENTER>(CLICK To go back and play)<BR><BR><BR><hr><H3><B><U>INSTRUCTIONS</B></U></H3><BR><BR><HR><HR><BR><BR>\nThe players each write a 4-digit secret number. <BR>\nThe digits must be all different. Then, in turn, the players try to guess<BR> \ntheir opponent's number. If the matching <BR>\ndigits are in their right positions, they are \"bulls\", if in different positions,<BR>\n they are \"cows\". <BR>Example:<BR><HR><BR><BR>\n</CENTER>\n\n              Secret number: 4271<BR>\n               Opponent's try: 1234<BR>\n              Answer: 1 bull and 2 cows. <BR>\n              (The bull is \"2\", the cows are \"4\" and \"1\".)<BR><BR><BR><HR>\n<CENTER><BR>\nThe first one to reveal the other's secret number wins the game. As the first player <BR>\nhas a logical advantage, the game can be balanced over multiple games by alternating<BR>\n the right to go first, or over a single game by granting the second player an equal number of <BR>\nguesses, possibly resulting in a tie.\n<BR>\n</><CENTER><BR><BR>\n<HR><HR>\n</HTML>");
        instructions.setToolTipText("");
        instructions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        instructions.setOpaque(true);
        instructions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instructionsMouseClicked(evt);
            }
        });
        getContentPane().add(instructions);
        instructions.setBounds(30, 140, 400, 680);

        jButton2.setText("Instructions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(313, 140, 110, 28);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(198, 843, 60, 70);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(300, 860, 110, 44);

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

        tb1.setBackground(new java.awt.Color(204, 204, 255));
        tb1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guess", "Cows", "Bulls"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setToolTipText("");
        tb1.setName(""); // NOI18N
        tb1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 180, 406);

        tb2.setBackground(new java.awt.Color(204, 204, 255));
        tb2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guess", "Cows", "Bulls"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb2.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(tb2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 330, 190, 406);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(t1);
        t1.setBounds(40, 238, 160, 30);

        b1.setBackground(new java.awt.Color(204, 204, 255));
        b1.setText("Guess");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(70, 280, 90, 28);

        b2.setBackground(new java.awt.Color(204, 204, 255));
        b2.setText("Guess");
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(290, 280, 90, 28);

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(t2);
        t2.setBounds(260, 238, 160, 30);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Start new game");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 770, 380, 50);

        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Player 2");
        l2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 2", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        getContentPane().add(l2);
        l2.setBounds(250, 170, 170, 50);

        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("Player 1");
        l1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Player 1", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        getContentPane().add(l1);
        l1.setBounds(40, 170, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backgrnd.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 132, 420, 700);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 455, 940);

        setSize(new java.awt.Dimension(454, 941));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String guess = t1.getText();
        if (guess.length() != 4) {
            JOptionPane.showMessageDialog(this, "Enter a 4 digit distinct number");
        } else {
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {

                    if (guess.charAt(i) == n1.charAt(j)) {
                        if (i == j) {
                            bulls1++;
                        } else {
                            cows1++;
                        }
                    }
                }
            }
            t1.setText("");

            DefaultTableModel tb = (DefaultTableModel) tb1.getModel();
            tb.addRow(new Object[]{guess, cows1, bulls1});
            tb1.setModel(tb);
            check();
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String guess = t2.getText();
        if (guess.length() != 4) {
            JOptionPane.showMessageDialog(this, "Enter a 4 digit distinct number");
        } else {
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (guess.charAt(i) == n2.charAt(j)) {
                        if (i == j) {
                            bulls2++;
                        } else {
                            cows2++;
                        }
                    }
                }
            }
            t2.setText("");
            DefaultTableModel tb = (DefaultTableModel) tb2.getModel();
            tb.addRow(new Object[]{guess, cows2, bulls2});
            tb2.setModel(tb);
            check();
        }

    }//GEN-LAST:event_b2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newgame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int confirm = JOptionPane.showConfirmDialog(this, "Start New Game?", "New Game", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            newgame();
        } else {
            dispose();
            new Home().setVisible(true);
        }
        
    }//GEN-LAST:event_formWindowOpened

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

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        instructions.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        instructions.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void instructionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instructionsMouseClicked
        instructions.setVisible(false);
    }//GEN-LAST:event_instructionsMouseClicked

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
        java.util.logging.Logger.getLogger(CowsBulls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(CowsBulls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(CowsBulls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(CowsBulls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new CowsBulls().setVisible(true);
    }

    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel instructions;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
