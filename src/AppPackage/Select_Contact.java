package AppPackage;

import java.sql.*;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Select_Contact extends javax.swing.JFrame {

String cid[] = new String[250];

public Select_Contact() {
    initComponents();
}

public void refresh() {
    Arrays.fill(cid, null);
    lb1.setSelectedIndex(0);
    id.setText("");
    nam.setText("");
    nick.setText("");
    String com = c1.getSelectedItem().toString();
    DefaultListModel lb = new DefaultListModel();
    lb1.setModel(lb);

    String sql;
    if (c1.getSelectedIndex() == 0) {
        sql = "select * from contacts order by Firstname,Middlename,Lastname";
    } else {
        sql = "select * from contacts where `Group`='" + com + "' order by Firstname,Middlename,Lastname";
    }

    try {
        Class.forName("java.sql.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(sql);
        int k = 0;
        while (rs.next()) {
            String name = rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
            cid[k] = rs.getString(1);
            lb.addElement(name);
            lb1.setModel(lb);
            k = k + 1;
        }
        rs.close();
        s.close();
        con.close();
    } catch (Exception e) {
    }
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lb1 = new javax.swing.JList();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        image = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nam = new javax.swing.JLabel();
        nick = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        view = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        refresh = new javax.swing.JLabel();
        deleteall = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setPreferredSize(new java.awt.Dimension(20, 60));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(330, 20, 60, 60);

        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/info_48x48.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about);
        about.setBounds(70, 850, 70, 60);

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(194, 844, 60, 70);

        jPanel2.setLayout(null);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        lb1.setModel(new DefaultListModel());
        lb1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lb1.setSelectedIndex(0);
        lb1.setValueIsAdjusting(true);
        lb1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lb1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lb1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 130, 210, 230);

        search.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchCaretUpdate(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(70, 70, 320, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Search");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 70, 50, 30);

        c1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "Family", "Friends", "Office", "Others" }));
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        jPanel2.add(c1);
        c1.setBounds(10, 20, 390, 40);

        image.setBackground(new java.awt.Color(255, 255, 204));
        image.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Aharoni", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel2.add(image);
        image.setBounds(10, 370, 230, 270);

        id.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        jPanel2.add(id);
        id.setBounds(240, 120, 160, 60);

        nam.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        nam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nam.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));
        jPanel2.add(nam);
        nam.setBounds(240, 180, 160, 60);

        nick.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        nick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nick.setBorder(javax.swing.BorderFactory.createTitledBorder("Nick"));
        jPanel2.add(nick);
        nick.setBounds(240, 240, 160, 60);

        jPanel1.setBorder(null);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        view.setBackground(new java.awt.Color(255, 255, 204));
        view.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        view.setText("View");
        view.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        view.setContentAreaFilled(false);
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.setOpaque(true);
        view.setPreferredSize(new java.awt.Dimension(52, 22));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view);
        view.setBounds(0, 90, 150, 40);

        update.setBackground(new java.awt.Color(255, 255, 204));
        update.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.setContentAreaFilled(false);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.setOpaque(true);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(0, 140, 150, 40);

        delete.setBackground(new java.awt.Color(255, 255, 204));
        delete.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setContentAreaFilled(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setOpaque(true);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(0, 190, 150, 40);

        add.setBackground(new java.awt.Color(255, 255, 204));
        add.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 153, 0));
        add.setText("Add New");
        add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setContentAreaFilled(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setOpaque(true);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(0, 280, 150, 40);

        refresh.setBackground(new java.awt.Color(255, 255, 204));
        refresh.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Refresh.png"))); // NOI18N
        refresh.setText("Refresh");
        refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, java.awt.Color.white));
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.setOpaque(true);
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel1.add(refresh);
        refresh.setBounds(0, 0, 150, 50);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(250, 310, 150, 330);

        deleteall.setBackground(new java.awt.Color(236, 206, 215));
        deleteall.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        deleteall.setForeground(new java.awt.Color(255, 0, 0));
        deleteall.setText("Delete all");
        deleteall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteall.setContentAreaFilled(false);
        deleteall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteall.setOpaque(true);
        deleteall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteallActionPerformed(evt);
            }
        });
        jPanel2.add(deleteall);
        deleteall.setBounds(10, 650, 390, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backgrnd.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 430, 710);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 130, 410, 700);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(290, 860, 110, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-4, -10, 460, 960);

        setSize(new java.awt.Dimension(450, 944));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        c1.setSelectedIndex(0);
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        if (!lb1.isSelectionEmpty()) {
            String ar[] = new String[]{cid[lb1.getSelectedIndex()]};
            View_Contact.main(ar);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a contact to view");
        }
    }//GEN-LAST:event_viewActionPerformed

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged
        refresh();
    }//GEN-LAST:event_c1ItemStateChanged

    private void deleteallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteallActionPerformed
        int c = JOptionPane.showConfirmDialog(this, "Do You Really want to delete all contacts?", "Delete", JOptionPane.YES_NO_OPTION);
        if (c == 0) {

            String sql = "truncate contacts";
            try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
                Statement s = con.createStatement();
                s.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Contacts successfully deleted");
                DefaultListModel lb = new DefaultListModel();
                lb1.setModel(lb);
                s.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_deleteallActionPerformed

    private void lb1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lb1ValueChanged
        int value = lb1.getSelectedIndex();
        String name = "", nickname = "", path = "";

        try {
            String sql = "select * from contacts where ContactID='" + cid[value] + "'";
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                name = rs.getString("FirstName") + " " + rs.getString("LastName") + " ";
                nickname = rs.getString("NickName");
                path = rs.getString("Image");
                path = path.replace("\\", "\\\\");

            }
            ImageIcon img = new ImageIcon(path);
            image.setIcon(img);
            id.setText(cid[value]);
            nam.setText(name);
            nick.setText(nickname);
            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lb1ValueChanged

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if (!lb1.isSelectionEmpty()) {
            String ar[] = new String[]{cid[lb1.getSelectedIndex()]};
            Update_Contact.main(ar);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a contact to update");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        dispose();
        new Add_Contact().setVisible(true);    }//GEN-LAST:event_addActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        dispose();
new Home().setVisible(true);    }//GEN-LAST:event_homeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        new Home().setVisible(true);    }//GEN-LAST:event_backMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        refresh();
    }//GEN-LAST:event_refreshMouseClicked

    private void searchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchCaretUpdate
        c1.setSelectedIndex(0);
        String n = search.getText().toLowerCase();
        String sql = "select *from contacts where FirstName like '%" + n + "%' or MiddleName like '%" 
                + n + "%' or LastName like'%" 
                + n + "%' or NickName like'%" + n + "%' order by Firstname,Middlename,Lastname";
        DefaultListModel lb = new DefaultListModel();
        lb1.setModel(lb);

        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4);
                lb.addElement(name);
                lb1.setModel(lb);

            }
            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_searchCaretUpdate

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        dispose();
        new About().setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (!lb1.isSelectionEmpty()) {
            int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                String sql = "delete from contacts where ContactID='" + cid[lb1.getSelectedIndex()] + "'";
                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
                    Statement s = con.createStatement();
                    s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, " Contact Successfully deleted");

                    s.close();
                    con.close();
                    lb1.isSelectionEmpty();
                    refresh();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a contact to delete");
        }
    }//GEN-LAST:event_deleteActionPerformed


    public static void main(String args[]) {

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
        java.util.logging.Logger.getLogger(Select_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Select_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Select_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Select_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
        new Select_Contact().setVisible(true);
    }

    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JButton add;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox c1;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteall;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lb1;
    private javax.swing.JLabel nam;
    private javax.swing.JLabel nick;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
