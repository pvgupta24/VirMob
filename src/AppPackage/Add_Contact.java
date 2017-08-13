package AppPackage;
import java.awt.Color;
import java.io.File;
import java.sql.*;
import javax.swing.*;

public class Add_Contact extends javax.swing.JFrame {

    String path = "";
    String cid, f;
    ImageIcon img = new ImageIcon();

    public Add_Contact() {
        initComponents();
    }

    public void clear() {
        t0.setText(null);
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        t6.setText(null);
        t7.setText(null);
        t8.setText(null);
        t9.setText(null);
        t10.setText(null);
        c1.setSelectedIndex(0);
        datecombo.setSelectedIndex(0);
        monthcombo.setSelectedIndex(0);
        yearcombo.setSelectedIndex(0);
        image.setIcon(img);
        path = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
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
        add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        t0 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIRMOB");
        setUndecorated(true);
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
        home.setBounds(200, 850, 70, 60);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setText("Date of Birth");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 40));

        jLabel5.setBackground(new java.awt.Color(153, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setText("Mobile No. 1");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 30));

        t5.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 200, -1));

        t4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, -1));

        t2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, 30));

        t8.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 200, -1));

        t1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, -1));

        jLabel9.setBackground(new java.awt.Color(153, 255, 255));
        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setText("Middle Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 30));

        jLabel10.setBackground(new java.awt.Color(153, 255, 255));
        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setText("First Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, 30));

        t3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, -1));

        jLabel11.setBackground(new java.awt.Color(153, 255, 255));
        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel11.setText("Last Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 30));

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No. 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, 30));

        t6.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 200, -1));

        jLabel12.setBackground(new java.awt.Color(153, 255, 255));
        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel12.setText("Telephone No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 30));

        t7.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 200, -1));

        jLabel13.setBackground(new java.awt.Color(153, 255, 255));
        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel13.setText("Email ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 80, 30));

        jLabel14.setBackground(new java.awt.Color(153, 255, 255));
        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 70, 30));

        jLabel15.setBackground(new java.awt.Color(153, 255, 255));
        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel15.setText("Nick Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, 30));

        monthcombo.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        monthcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        monthcombo.setToolTipText("");
        monthcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(monthcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 70, 40));

        yearcombo.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        yearcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", " ", " " }));
        yearcombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(yearcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 70, 40));

        datecombo.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        datecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        datecombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(datecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 60, 40));

        t9.setColumns(20);
        t9.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        t9.setRows(5);
        jScrollPane3.setViewportView(t9);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 200, 100));

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setText("Image");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 50, 30));

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel6.setText("Group");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 50, 30));

        browse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        browse.setText("Browse");
        browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 100, -1));

        c1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Family", "Friends", "Office", "Others" }));
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 200, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, -1, -1));

        add.setBackground(new java.awt.Color(204, 255, 204));
        add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add.setText("ADD");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 130, 80));

        jLabel8.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel8.setText("ADD NEW CONTACT");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 330, 50));

        t10.setEditable(false);
        t10.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jPanel1.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 200, -1));

        t0.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        t0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t0MouseClicked(evt);
            }
        });
        jPanel1.add(t0, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, -1));

        jLabel16.setBackground(new java.awt.Color(153, 255, 255));
        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel16.setText("Contact Id");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 30));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Aharoni", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 230, 270));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/backgrnd.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 400, 820));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(21, 121, 423, 710);

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        back.setBorder(null);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(300, 850, 130, 60);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/LockScreen.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 940);

        setSize(new java.awt.Dimension(459, 940));
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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String n = "", m = "", l = "", year = "", day = "";
        cid = t0.getText();

        f = t1.getText();
        m = t2.getText();
        l = t3.getText();
        n = t4.getText();

        if (m == "") {
            m = " ";
        }
        if (l == "") {
            l = " ";
        }
        if (n == "") {
            n = " ";
        }

        String month = "" + monthcombo.getSelectedIndex();
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
        String em = "", a = "", g = "";
        String mob1 =t5.getText();
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
        em = t8.getText();
        a = t9.getText();
        if (c1.getSelectedIndex() == 0) {
            g = "Others";
        } else {
            g = c1.getSelectedItem().toString();
        }
        String sql = "Insert into contacts values "
                + "('" + cid + "','" + (f) + "','" + (m) + "','" + (l) + "','" + (n)
                + "'," + (Integer.parseInt(dob)) + ",'" + (m1) + "','" + (m2) + "','" + (t)
                + "','" + (em) + "','" + (a) + "','" + (g) + "','" + (path) + "')";

        if (cid.equals("") || f.equals("")) {
            if (cid.equals("")) {
                t0.setForeground(Color.red);
                t0.setText("Please Enter Contact ID");
            }
            if (f.equals("")) {
                t1.setForeground(Color.red);
                t1.setText("Please Enter First Name");
            }
        } else {
            if ((m1 == 0 || (m1 + "").length() == 10)
                    && (t == 0 || (t + "").length() == 8
                    && (m2 == 0 || (m2 + "").length() == 10))) {
                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VirtualMobile", "root", "");
                    Statement s = con.createStatement();
                    s.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Contact successfully saved");
                    clear();

                    s.close();
                    con.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());

                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter valid contact numbers");

            }
        }


    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t0MouseClicked
        t0.setText(cid);
        t0.setForeground(Color.BLACK);
    }//GEN-LAST:event_t0MouseClicked

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        t1.setText(f);
        t1.setForeground(Color.BLACK);
    }//GEN-LAST:event_t1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
new Select_Contact().setVisible(true);    }//GEN-LAST:event_backMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("");
                new Add_Contact().setVisible(true);
                System.out.println("");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JButton add;
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
    private javax.swing.JComboBox yearcombo;
    // End of variables declaration//GEN-END:variables
}
