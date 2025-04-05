                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;


                                                                                                                                                                                                                                                                                        

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.SecureRandom;
import java.util.Properties;
import javax.mail.MessagingException;
/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */


public class OTPGmail {
 
        private static String generatedOTP;

        public static void sendOTP(String recipientEmail) {
        String host = "smtp.gmail.com";         final String username = "mnhieu04@gmail.com";         final String password = "aytc vaey apix vuxc"; 
                Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");

                Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
                        String otp = generateOTP();             MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject("ENGCHECK OTP");
            message.setText("Your OTP is: " + otp);

                                                
                        Transport.send(message);
            System.out.println("Email đã được gửi thành công!");

                        setGeneratedOTP(otp);

        } catch (MessagingException e) {
        }
    }

        public static String generateOTP() {
        SecureRandom random = new SecureRandom();
        int otp = 100000 + random.nextInt(900000);         return String.valueOf(otp);
    }

        public static void setGeneratedOTP(String otp) {
        generatedOTP = otp;
    }

        public static String getGeneratedOTP() {
        return generatedOTP;
    }
}       
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ