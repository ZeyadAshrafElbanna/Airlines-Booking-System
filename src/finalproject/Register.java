/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeyad El-banna
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nation = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        day = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1400, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 85, 155));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enrollment");

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 35)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("X");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1096, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("First name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("Last name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 130, -1));

        Fname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        getContentPane().add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 310, 40));

        Lname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 310, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, -1));

        Address.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 310, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setText("Birth date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setText("Nationality");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 110, -1));

        nation.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghan", "Algerian\t", "Angolan\t", "Argentine\t", "Austrian\t", "Australian\t", "Bangladeshi\t", "Belarusian\t", "Belgian\t", "Bolivian\t", "Bosnian", "Brazilian\t", "British\t", "Bulgarian\t", "Cambodian\t", "Cameroonian\t", "Canadian\t", "Central African\t", "Chadian\t", "Chinese\t", "Colombian\t", "Costa Rican\t", "Croatian\t", "Czech\t", "Congolese\t", "Danish\t", "Ecuadorian\t", "Egyptian\t", "Salvadoran\t", "English\t", "Estonian\t", "Ethiopian\t", "Finnish\t", "French\t", "German\t", "Ghanaian\t", "Greek\t", "Guatemalan\t", "Dutch\t", "Honduran\t", "Hungarian\t", "Icelandic\t", "Indian\t", "Indonesian\t", "Iranian\t", "Iraqi\t", "Irish\t", "Israeli\t", "Italian\t", "Ivorian\t", "Jamaican\t", "Japanese\t", "Jordanian\t", "Kazakh\t", "Kenyan\t", "Lao\t", "Latvian\t", "Libyan\t", "Lithuanian\t", "Malagasy    ", "Malian\t", "Mauritanian\t", "Mexican\t", "Moroccan\t", "Namibian\t", "New Zealand\t", "Nicaraguan\t", "Nigerien\t", "Nigerian\t", "Norwegian\t", "Omani\t", "Pakistani\t", "Panamanian\t", "Paraguayan\t", "Peruvian\t", "Philippine\t", "Polish\t", "Portuguese\t", "Congolese\t", "Romanian\t", "Russian\t", "Saudi Arabian\t", "Scottish\t", "Senegalese\t", "Serbian\t", "Singaporean\t", "Slovak\t", "Somalian\t", "South African\t", "Spanish\t", "Sudanese\t", "Swedish\t", "Swiss\t", "Syrian\t", "Thai\t", "Tunisian\t", "Turkish\t", "Turkmen\t", "Ukranian\t", "Emirati\t", "American\t", "Uruguayan\t", "Vietnamese\t", "Welsh\t", "Zambian\t", "Zimbabwean" }));
        nation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(nation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 310, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setText("Phone num.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, -1));

        phone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 310, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setText("Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, -1));

        e.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 310, 40));

        pass.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 310, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 120, -1));

        jButton1.setBackground(new java.awt.Color(15, 85, 155));
        jButton1.setFont(new java.awt.Font("Simplified Arabic", 1, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 170, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1400, 20));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        getContentPane().add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 80, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel10.setText("Day");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 56, 21));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan.\t", "Feb.\t", "Mar.\t", "Apr.\t", "May\t", "Jun.\t", "Jul.\t", "Aug.\t", "Sep.\t", "Oct.\t", "Nov.\t", "Dec." }));
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 100, 40));

        year.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1905", "1906,", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011" }));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 110, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel11.setText("Month");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jLabel12.setText("Year");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jLabel14.setBackground(new java.awt.Color(153, 153, 153));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel14.setText("Phone num. 2");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 150, 30));

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 310, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/hoda.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                       try {
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              String url="jdbc:sqlserver://ZEYADELBANNA:1433;DatabaseName=Airlines Booking App;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
              Connection con = DriverManager.getConnection(url); 
             
             String fname , lname , nat , phone1,phone2 , adr , email , password , d , m , y ;
             fname = Fname.getText();
             lname = Lname.getText();
             nat = (String) nation.getSelectedItem();
             phone1 = phone.getText();
             phone2=p2.getText();
             adr = Address.getText();
             email = e.getText();
             password = pass.getText();
             d = (String) day.getSelectedItem();
             m= (String) month.getSelectedItem();
             y = (String) year.getSelectedItem();
             String date = d +"-"+m+"-"+y;
             String sql = "insert into Accounts values ('"+email+"','" +password+"','"+fname+"','"+date+"','"+nat+"','"+adr+"','"+lname+"');insert into phonenumbers values ('"+phone1+"','"+email+"');insert into phonenumbers values ('"+phone2+"','"+email+"');";
             PreparedStatement pst = con.prepareStatement(sql);
             pst.executeQuery();
            
       } 
       catch (Exception e ) 
       {
            JOptionPane.showMessageDialog(null, "Your Email Created Successufly");
             dispose();
             Login f2 = new Login();
             f2.setVisible(true);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextField e;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JComboBox<String> nation;
    private javax.swing.JTextField p2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phone;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}