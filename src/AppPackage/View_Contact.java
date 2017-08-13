package AppPackage;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class View_Contact extends javax.swing.JFrame {

private static String cid;

public View_Contact() {
    initComponents();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l0 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t10 = new javax.swing.JTextArea();
        t1 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIRMOB");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/info_48x48.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 850, 70, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setPreferredSize(new java.awt.Dimension(20, 60));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 20, 60, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(197, 840, 60, 70);
        jLabel12.getAccessibleContext().setAccessibleDescription("");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(290, 850, 110, 44);

        jPanel1.setLayout(null);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Aharoni", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(image);
        image.setBounds(10, 20, 230, 270);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("Date of Birth");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 290, 102, 40);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel6.setText("Mobile 1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 330, 102, 30);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setText("Mobile 2");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 370, 102, 30);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel8.setText("Telephone");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 410, 102, 30);

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 450, 102, 30);

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setText("Group");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 600, 102, 30);

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 520, 102, 30);

        l0.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        l0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l0.setBorder(javax.swing.BorderFactory.createTitledBorder("Contact ID"));
        jPanel1.add(l0);
        l0.setBounds(250, 80, 150, 60);

        t10.setEditable(false);
        t10.setBackground(new java.awt.Color(233, 216, 216));
        t10.setColumns(20);
        t10.setLineWrap(true);
        t10.setRows(5);
        t10.setWrapStyleWord(true);
        jScrollPane2.setViewportView(t10);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 490, 270, 110);

        t1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));
        jPanel1.add(t1);
        t1.setBounds(250, 150, 150, 60);

        t4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nick Name"));
        jPanel1.add(t4);
        t4.setBounds(250, 220, 150, 60);

        t5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(t5);
        t5.setBounds(130, 290, 270, 39);

        t6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(t6);
        t6.setBounds(130, 330, 270, 39);

        t7.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(t7);
        t7.setBounds(130, 370, 270, 39);

        t8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(t8);
        t8.setBounds(130, 410, 270, 39);

        t9.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(t9);
        t9.setBounds(130, 450, 270, 39);

        t11.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(t11);
        t11.setBounds(130, 600, 270, 39);

        update.setBackground(new java.awt.Color(204, 255, 204));
        update.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(20, 640, 380, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backgrnd.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 740);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 420, 710);

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(180, 830, 90, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 460, 940);

        setSize(new java.awt.Dimension(452, 944));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        String sql = "select*from contacts where ContactID = '" + cid + "'";
        String sql2 = "select monthname(DateOfBirth) from contacts where contactid = '" + cid + "'";
        String date = "";
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
            Statement s = con.createStatement();
            Statement s2 = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            ResultSet rs2 = s2.executeQuery(sql2);
            String month = "", day = "", year = "";
            String path = "";
            
            while (rs.next()) {
                date = rs.getString(6);
                String d[] = rs.getString(6).split("-", 3);
                day = d[2];
                year = d[0];

                l0.setText(rs.getString(1));
                t1.setText(rs.getString(2) + " " + rs.getString(4));
                t4.setText(rs.getString(5));
                if (!rs.getString(7).equals("0")) {
                    t6.setText(rs.getString(7));
                }
                if (!rs.getString(8).equals("0")) {
                    t7.setText(rs.getString(8));
                }
                if (!rs.getString(9).equals("0")) {
                    t8.setText(rs.getString(9));
                }
                t9.setText(rs.getString(10));
                t10.setText(rs.getString(11));
                t11.setText(rs.getString(12));

                path = rs.getString(13);
                path = path.replace("\\", "\\\\");

            }
            if (date.equals("2050-01-24")) {
                day = "";
                month = "";
                year = "";

            } else {
                while (rs2.next()) {
                    month = rs2.getString(1);
                }
                if (month == null) {
                    month = "";
                }
            }
            String dob = day + " " + month + " " + year;
            t5.setText(dob);
            ImageIcon img = new ImageIcon(path);

            image.setIcon(img);
            rs.close();
            rs2.close();
            s.close();
            s2.close();
            con.close();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String ar[] = {cid};
        Update_Contact.main(ar);
        dispose();    }//GEN-LAST:event_updateActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        dispose();
        new Select_Contact().setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        dispose();
        new About().setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked
public static void main(String args[]) {
    cid = args[0];

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
        java.util.logging.Logger.getLogger(View_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(View_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(View_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(View_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new View_Contact().setVisible(true);
    }

    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel home;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l0;
    private javax.swing.JLabel t1;
    private javax.swing.JTextArea t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
