                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;

import com.google.zxing.common.BitMatrix;
import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class frmAuthenticator extends javax.swing.JFrame {
    private static final String url = "jdbc:sqlserver://FAROLPC\\SQLEXPRESS:1433;databaseName=ENGCHECK;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa"; 
    private static final String password = "123456789"; 
    private Map<String, String> tempSecretKeys = new HashMap<>();
    public frmAuthenticator() {
        this.setUndecorated(true);
        initComponents();
        pnQR.setVisible(false);
        btnXacNhan.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnQR = new javax.swing.JPanel();
        lbQRCode = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtOTP = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnTaoQR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnGuiOTP = new javax.swing.JButton();
        btnXacThuc = new javax.swing.JButton();
        txtOTPG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbThongBao = new javax.swing.JLabel();
        btnXacNhan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnQR.setBackground(new java.awt.Color(204, 255, 255));
        pnQR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnQR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnQR.add(lbQRCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 250, 250));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Nhập OTP");
        pnQR.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        pnQR.add(txtOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 110, 30));

        btnCheck.setText("Check");
        btnCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        pnQR.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        btnTaoQR.setText("Tạo QR");
        btnTaoQR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaoQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoQRActionPerformed(evt);
            }
        });
        pnQR.add(btnTaoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jPanel1.add(pnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 310, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("GOOGLE AUTHENTICATOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 380, 40));

        btnGuiOTP.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnGuiOTP.setText("Gửi OTP");
        btnGuiOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiOTPActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuiOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 120, 40));

        btnXacThuc.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btnXacThuc.setText("Xác thực");
        btnXacThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacThucActionPerformed(evt);
            }
        });
        jPanel1.add(btnXacThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 140, 40));
        jPanel1.add(txtOTPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Nhập OTP vừa nhận được");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lbThongBao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lbThongBao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 660, 30));

        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        btnXacNhan.setText("Xác nhận");
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        jPanel1.add(btnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Made by ChillGroup");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 240, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\Authenticator.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Vui lòng xác thực Gmail!");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon("F:\\1Hutech\\BaoMat\\DoAn\\DoAnBMTT\\src\\main\\java\\com\\mycompany\\doanbmtt\\HinhNen\\btnback.png")); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String userEmail = txtEmail.getText();
        String otp = txtOTP.getText();  
        String secretKey = tempSecretKeys.get(userEmail);

        if (otp.isEmpty()) {
            lbThongBao.setText("Vui lòng nhập mã OTP từ Authenticator!");
            return;
        }

        try {
            GoogleAuthenticator gAuth = new GoogleAuthenticator();
            boolean isCodeValid = gAuth.authorize(secretKey, Integer.parseInt(otp));

            if (isCodeValid) {
                lbThongBao.setText("Mã OTP Authenticator hợp lệ! Bạn có thể lưu secret key.");
                btnXacNhan.setEnabled(true);              } else {
                lbThongBao.setText("Mã OTP không hợp lệ! Vui lòng thử lại.");
            }
        } catch (NumberFormatException e) {
            lbThongBao.setText("Mã OTP phải là số!");
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnTaoQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoQRActionPerformed
         String userEmail = txtEmail.getText();
        if (!userEmail.isEmpty()) {
            generateQRCodeForUser(userEmail);
        } else {
            lbThongBao.setText("Vui lòng nhập email để tạo mã QR!");
        }
    }//GEN-LAST:event_btnTaoQRActionPerformed
  
    private void btnGuiOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiOTPActionPerformed
        String email = txtEmail.getText(); 
        if (email.isEmpty() || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            lbThongBao.setText("Email không hợp lệ! Vui lòng nhập email đúng định dạng (ví dụ: example@gmail.com)");
        } else {
                        if (kiemTraEmailTonTai(email)) {
                OTPGmail.sendOTP(email); 
                lbThongBao.setText("OTP đã được gửi đến email của bạn.");
            } else {
                lbThongBao.setText("Email này không tồn tại trong hệ thống!");
            }
        }
    }//GEN-LAST:event_btnGuiOTPActionPerformed

    private void btnXacThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacThucActionPerformed
        String userInputOtp = txtOTPG.getText(); 
        String generatedOtp = OTPGmail.getGeneratedOTP(); 

        if (userInputOtp.isEmpty()) {
            lbThongBao.setText("Vui lòng nhập OTP để kiểm tra!");
            return;
        }

        if (userInputOtp.equals(generatedOtp)) {
            lbThongBao.setText("Mã OTP hợp lệ! Bạn có thể tiếp tục.");
            txtOTPG.setEditable(false); 
            txtEmail.setEditable(false);
            pnQR.setVisible(true);              btnXacNhan.setEnabled(true);
        } else {
            lbThongBao.setText("Mã OTP không hợp lệ! Vui lòng thử lại.");
        }
    }//GEN-LAST:event_btnXacThucActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        String email = txtEmail.getText();
        String secretKey = tempSecretKeys.get(email);

        if (secretKey == null) {
            lbThongBao.setText("Không có secret key để lưu!");
            return;
        }

        String query = "UPDATE NguoiDung SET secret_key = ? WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, secretKey);
            stmt.setString(2, email);

            if (stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật secret key thành công!");
                resetForm();
            } else {
                lbThongBao.setText("Cập nhật thất bại! Vui lòng thử lại.");
            }
        } catch (SQLException e) {
            lbThongBao.setText("Lỗi khi cập nhật secret key: " + e.getMessage());
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked
    private boolean kiemTraEmailTonTai(String email) {
        String query = "SELECT 1 FROM NguoiDung WHERE email = ?";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            return rs.next();          } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi kiểm tra email: " + e.getMessage());
        }
        return false;
    }
    private void generateQRCodeForUser(String userEmail) {
        try {
            GoogleAuthenticatorKey key = TOTPHelper.generateSecretKey();
            String secretKey = key.getKey();
            tempSecretKeys.put(userEmail, secretKey);  
            BitMatrix qrCodeMatrix = TOTPHelper.generateQRCodeMatrix(userEmail, secretKey, "ENGCHECK");
            BufferedImage qrCodeImage = TOTPHelper.convertMatrixToImage(qrCodeMatrix);
            lbQRCode.setIcon(new ImageIcon(qrCodeImage));          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tạo mã QR: " + e.getMessage());
        }
    }
    private void resetForm() {
        txtEmail.setEditable(true);
        txtOTPG.setEditable(true);
        txtEmail.setText("");
        txtOTPG.setText("");
        txtOTP.setText("");
        lbQRCode.setIcon(null);
        pnQR.setVisible(false);
        lbThongBao.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnGuiOTP;
    private javax.swing.JButton btnTaoQR;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JButton btnXacThuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbQRCode;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JPanel pnQR;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtOTP;
    private javax.swing.JTextField txtOTPG;
    // End of variables declaration//GEN-END:variables
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ