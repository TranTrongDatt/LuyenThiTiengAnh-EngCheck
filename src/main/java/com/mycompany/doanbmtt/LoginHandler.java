                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;


import java.security.PrivateKey;
import java.sql.*;
import javax.swing.*;
/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */


public class LoginHandler {
        private static final String url = "jdbc:sqlserver://FAROLPC\\SQLEXPRESS:1433;databaseName=ENGCHECK;encrypt=true;trustServerCertificate=true;";
    private static final String username = "sa";
    private static final String password = "123456789";
    private static final String RSA_PRIVATE_KEY = "src/resources/privateKey.pem"; 
    public static boolean validateLogin(String input, String plainPassword) {
                String query = "SELECT mat_khau_ma_hoa, khoa_aes_ma_hoa FROM NguoiDung WHERE ten_dang_nhap = ? OR email = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

                        stmt.setString(1, input);             stmt.setString(2, input); 
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                                String encryptedPassword = rs.getString("mat_khau_ma_hoa");
                String encryptedAESKey = rs.getString("khoa_aes_ma_hoa");

                                PrivateKey privateKey = EncryptionHelper.loadPrivateKey(RSA_PRIVATE_KEY);                 String aesKey = EncryptionHelper.decryptRSA(encryptedAESKey, privateKey);

                                String decryptedPassword = EncryptionHelper.decryptAES(encryptedPassword, aesKey);

                                return decryptedPassword.equals(plainPassword);
            } else {
                JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc email không tồn tại!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi kết nối CSDL hoặc xử lý mã hóa: " + e.getMessage());
        }
        return false;
    }
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ