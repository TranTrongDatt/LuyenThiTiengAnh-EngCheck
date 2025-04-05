                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class frmKiemTra extends javax.swing.JFrame {
    private int loginAttempts = 0;
    private final int MAX_ATTEMPTS = 3;
    private static final String url = "jdbc:sqlserver://FAROLPC\\SQLEXPRESS:1433;databaseName=ENGCHECK;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa";
    private static final String dbpassword = "123456789";

    public frmKiemTra() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDangNhap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbThongBao = new javax.swing.JLabel();
        HinhNen = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tên đăng nhập hoặc Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 60, -1, -1));
        jPanel1.add(txtDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 91, 260, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Mật khẩu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 168, 260, 40));

        btnLogin.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\iconVietNam.png")); // NOI18N
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Made by ChillGroup");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, 320));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbThongBao.setBackground(new java.awt.Color(255, 51, 51));
        lbThongBao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbThongBao.setForeground(new java.awt.Color(255, 255, 0));
        lbThongBao.setText("VIỆT NAM VÔ ĐỊCH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lbThongBao)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1140, 60));

        HinhNen.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\VietNam.jpg")); // NOI18N
        getContentPane().add(HinhNen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String usernameOrEmail = txtDangNhap.getText();
        String plainPassword = new String(txtPassword.getPassword());

        if (usernameOrEmail.isEmpty() || plainPassword.isEmpty()) {
            lbThongBao.setText("Vui lòng nhập đầy đủ thông tin!");
            return;
        }
        boolean isPasswordValid = LoginHandler.validateLogin(usernameOrEmail, plainPassword);

        if (isPasswordValid && isAdminRole(usernameOrEmail)) {  
        JOptionPane.showMessageDialog(this, "VIỆT NAM VÔ ĐỊCH!");
        frmCapQuyen grantForm = new frmCapQuyen(); 
        grantForm.setLocationRelativeTo(null);
        grantForm.setVisible(true);
        this.dispose();  
    } else {
        loginAttempts++;  
        if (loginAttempts >= MAX_ATTEMPTS) {  
            JOptionPane.showMessageDialog(this, "Bạn đã nhập sai quá nhiều lần! Tạm biệt.");
            frmDangKy mainForm = new frmDangKy(); 
            mainForm.updateAdminButtonState(false);
            mainForm.setLocationRelativeTo(null);
            mainForm.setVisible(true);
            this.dispose(); 
        } else {
            lbThongBao.setText("Sai mật khẩu hoặc bạn không phải ADMIN! Bạn còn " + (MAX_ATTEMPTS - loginAttempts) + " lần thử.");
        }
    }


    }//GEN-LAST:event_btnLoginMouseClicked
    private boolean isAdminRole(String usernameOrEmail) {
        String query = "SELECT vai_tro FROM NguoiDung WHERE ten_dang_nhap = ? OR email = ?";
        try (Connection conn = DriverManager.getConnection(url, username, dbpassword);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, usernameOrEmail);
            stmt.setString(2, usernameOrEmail);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String role = rs.getString("vai_tro");
                return "admin".equalsIgnoreCase(role);             }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi kết nối CSDL: " + e.getMessage());
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http:         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmKiemTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKiemTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKiemTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKiemTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKiemTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HinhNen;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JTextField txtDangNhap;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ