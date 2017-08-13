package AppPackage;

import java.awt.Color;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Update_Contact extends javax.swing.JFrame {

private static String cid, path;

public Update_Contact() {
    initComponents();
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        monthcombo = new javax.swing.JComboBox();
        yearcombo = new javax.swing.JComboBox();
        datecombo = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        t9 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t0 = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home.png"))); // NOI18N
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(200, 850, 60, 70);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(290, 860, 110, 44);

        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 220, 110, 30);

        jLabel5.setBackground(new java.awt.Color(153, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("Mobile No. 1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 250, 160, 30);

        t5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(150, 250, 210, 30);

        t4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(150, 180, 210, 30);

        t2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(150, 120, 210, 30);

        t8.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(150, 340, 210, 30);

        t1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(150, 90, 210, 30);

        jLabel9.setBackground(new java.awt.Color(153, 255, 255));
        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setText("Middle Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 120, 94, 30);

        jLabel10.setBackground(new java.awt.Color(153, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setText("First Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 90, 98, 30);

        t3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(150, 150, 210, 30);

        jLabel11.setBackground(new java.awt.Color(153, 255, 255));
        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel11.setText("Last Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 148, 74, 30);

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No. 2");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 160, 30);

        t6.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(150, 280, 210, 30);

        jLabel12.setBackground(new java.awt.Color(153, 255, 255));
        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel12.setText("Telephone No.");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 310, 160, 30);

        t7.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(150, 310, 210, 30);

        jLabel13.setBackground(new java.awt.Color(153, 255, 255));
        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel13.setText("Email id");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 340, 90, 30);

        jLabel14.setBackground(new java.awt.Color(153, 255, 255));
        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 400, 90, 30);

        jLabel15.setBackground(new java.awt.Color(153, 255, 255));
        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel15.setText("Nick Name");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 180, 90, 30);

        monthcombo.setMaximumRowCount(13);
        monthcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthcombo.setToolTipText("");
        monthcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(monthcombo);
        monthcombo.setBounds(210, 216, 70, 30);

        yearcombo.setMaximumRowCount(20);
        yearcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", " " }));
        yearcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(yearcombo);
        yearcombo.setBounds(280, 216, 80, 30);

        datecombo.setMaximumRowCount(15);
        datecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        datecombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(datecombo);
        datecombo.setBounds(150, 216, 60, 30);

        t9.setColumns(20);
        t9.setRows(5);
        jScrollPane3.setViewportView(t9);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(150, 370, 210, 100);

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("Image");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 500, 90, 30);

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel6.setText("Group");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 470, 90, 30);

        browse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        browse.setText("Browse");
        browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse);
        browse.setBounds(260, 530, 100, 34);

        c1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Family", "Friends", "Office", "Others" }));
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(c1);
        c1.setBounds(150, 470, 210, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("CANCEL");
        jPanel1.add(jButton2);
        jButton2.setBounds(210, 950, 140, 40);

        update.setBackground(new java.awt.Color(204, 255, 204));
        update.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        update.setText("UPDATE");
        update.setToolTipText("");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(260, 581, 130, 80);

        jLabel8.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel8.setText("UPDATE  CONTACT");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 10, 350, 50);

        t10.setEditable(false);
        jPanel1.add(t10);
        t10.setBounds(150, 500, 210, 30);

        jLabel16.setBackground(new java.awt.Color(153, 255, 255));
        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel16.setText("Contact ID");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 60, 89, 30);

        t0.setEditable(false);
        t0.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        t0.setEnabled(false);
        jPanel1.add(t0);
        t0.setBounds(150, 60, 210, 30);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Aharoni", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(image);
        image.setBounds(30, 530, 230, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backgrnd.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -30, 420, 910);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 420, 710);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 460, 1050);

        setSize(new java.awt.Dimension(459, 948));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed

        try {
            JFileChooser c = new JFileChooser();
            c.showOpenDialog(null);
            File f = c.getSelectedFile();
            path = f.getAbsolutePath();
            t10.setText(path);
            ImageIcon i = new ImageIcon(path);
            path = path.replace("\\", "\\\\");
            image.setIcon(i);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_browseActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String cid = t0.getText();

        String f = t1.getText();
        String m = t2.getText();
        String l = t3.getText();
        String n = t4.getText();

        String month = "" + monthcombo.getSelectedIndex(), year, day;
        int mon = monthcombo.getSelectedIndex();
        if (mon == 0) {
            month = "01";
        } else {
            if (mon < 10) {
                month = "0" + month;
            }
        }
        if (yearcombo.getSelectedIndex() == 0) {
            year = "2050";
        } else {
            year = yearcombo.getSelectedItem().toString();
        }
        if (datecombo.getSelectedIndex() == 0) {
            day = "24";
        } else {
            day = datecombo.getSelectedItem().toString();
        }

        String dob = year + month + day;
        String mob1 = t5.getText();
        String mob2 = t6.getText();
        String tel = t7.getText();
        long m1 = 0, m2 = 0, t = 0;
        if (!mob1.isEmpty()) {
            m1 = Long.parseLong(mob1);
        }
        if (!mob2.isEmpty()) {
            m2 = Long.parseLong(mob2);
        }
        if (!tel.isEmpty()) {
            t = Long.parseLong(tel);
        }

        String em = t8.getText();
        String a = t9.getText();

        String g = c1.getSelectedItem().toString();

        String sql
                = "Update contacts set FirstName='"
                + f + "',Middlename='" + m + "',LastName='" + l + "',NickName='"
                + n + "',DateOfBirth='" + dob + "',Mobileno1=" + m1 + ",Mobileno2="
                + m2 + ",TelephoneNo=" + t + ",EmailID='" + em + "',Address='" + a
                + "',`Group`='" + g + "',Image='" + path + "'where ContactID='" + cid + "'";
        if (f != "") {
            if ((m1 == 0 || (m1 + "").length() == 10)
                    && (t == 0 || (t + "").length() == 8
                    && (m2 == 0 || (m2 + "").length() == 10))) {
                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
                    Statement s = con.createStatement();

                    s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Contact successfully updated");
                    dispose();
                    new Select_Contact().setVisible(true);

                    s.close();
                    con.close();

                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid contact numbers");
            }

        } else {
            t1.setForeground(Color.red);
            t1.setText("Please Enter First Name");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String sql = "select*from contacts where contactid = '" + cid + "'";
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
            Statement s = con.createStatement();
            Statement s2 = con.createStatement();

            System.out.println("3");
            ResultSet rs = s.executeQuery(sql);

            String day = "", year = "";

            while (rs.next()) {
                String d[] = rs.getString(6).split("-", 3);
                day = d[2];
                int month = Integer.parseInt(d[1]);
                year = d[0];
                if (rs.getString(6) != "2020-01-24") {

                    yearcombo.setSelectedItem(year);
                    datecombo.setSelectedItem(day);
                    monthcombo.setSelectedIndex(month);
                }

                t0.setText(cid);
                t1.setText(rs.getString(2));
                t2.setText(rs.getString(3));
                t3.setText(rs.getString(4));
                t4.setText(rs.getString(5));
                if (!"0".equals(rs.getString(7))) {
                    t5.setText(rs.getString(7));
                }
                if (!"0".equals(rs.getString(8))) {
                    t6.setText(rs.getString(8));
                }
                if (!"0".equals(rs.getString(9))) {
                    t7.setText(rs.getString(9));
                }

                t8.setText(rs.getString(10));
                t9.setText(rs.getString(11));
                String group = rs.getString(12);

                c1.setSelectedItem(group);
                t10.setText(rs.getString(13));
                path = rs.getString(13);
                path = path.replace("\\", "\\\\");

            }
            ImageIcon img = new ImageIcon(path);
            image.setIcon(img);
            rs.close();
            s.close();
            con.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        new Select_Contact().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Do You Really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        dispose();
        new About().setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

/**
 * @param args the command line arguments
 */
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
        java.util.logging.Logger.getLogger(Update_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Update_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Update_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Update_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {

        new Update_Contact().setVisible(true);
    }

    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel back;
    private javax.swing.JButton browse;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox datecombo;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox monthcombo;
    private javax.swing.JTextField t0;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextArea t9;
    private javax.swing.JButton update;
    private javax.swing.JComboBox yearcombo;
    // End of variables declaration//GEN-END:variables
}
