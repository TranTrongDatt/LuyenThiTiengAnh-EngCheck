                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;


import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class GenerateKeyPair {

    public static void main(String[] args) {
        try {
                        String privateKeyPath = "src/resources/privateKey.pem";
            String publicKeyPath = "src/resources/publicKey.pem";
            Files.createDirectories(Paths.get("src/resources"));

                        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
            keyPairGen.initialize(2048);             KeyPair keyPair = keyPairGen.generateKeyPair();

                        PrivateKey privateKey = keyPair.getPrivate();
            String privateKeyPem = "-----BEGIN PRIVATE KEY-----\n" +
                Base64.getEncoder().encodeToString(privateKey.getEncoded()) +
                "\n-----END PRIVATE KEY-----";

                        try (FileOutputStream fos = new FileOutputStream(privateKeyPath)) {
                fos.write(privateKeyPem.getBytes());
                System.out.println("Private Key đã được lưu vào: " + privateKeyPath);
            }

                        PublicKey publicKey = keyPair.getPublic();
            String publicKeyPem = "-----BEGIN PUBLIC KEY-----\n" +
                Base64.getEncoder().encodeToString(publicKey.getEncoded()) +
                "\n-----END PUBLIC KEY-----";

                        try (FileOutputStream fos = new FileOutputStream(publicKeyPath)) {
                fos.write(publicKeyPem.getBytes());
                System.out.println("Public Key đã được lưu vào: " + publicKeyPath);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ