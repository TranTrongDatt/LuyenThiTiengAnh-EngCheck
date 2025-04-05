                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ
package com.mycompany.doanbmtt;


import java.nio.file.Files;
import java.nio.file.Paths;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
/**@author
 * Nhóm ChillGroup
 * Nguyễn Hải Đăng - 2280600668
 * Bùi Bảo Hân - 2280600871
 * Trương Minh Nhiều - 2280602242
 * Nguyễn Xuân Minh - 2280601952
 * Nguyễn Thành Phúc - 2280602462
 */
public class EncryptionHelper {
    private static final String AES_ALGORITHM = "AES";
    private static final String RSA_ALGORITHM = "RSA";

        public static String generateAESKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(AES_ALGORITHM);
        keyGen.init(128);         SecretKey secretKey = keyGen.generateKey();
        return Base64.getEncoder().encodeToString(secretKey.getEncoded());
    }

        public static String encryptAES(String plainText, String aesKey) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(Base64.getDecoder().decode(aesKey), AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());                                                                                                                                                                                                                                            
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

        public static String decryptAES(String cipherText, String aesKey) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(Base64.getDecoder().decode(aesKey), AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes);
    }

        public static KeyPair generateRSAKeyPair() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        keyPairGen.initialize(2048);         return keyPairGen.generateKeyPair();
    }

        public static String encryptRSA(String aesKey, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(aesKey.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

        public static String decryptRSA(String encryptedKey, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedKey));
        return new String(decryptedBytes);
    }
    public static PrivateKey loadPrivateKey(String filePath) throws Exception {
                String privateKeyContent = new String(Files.readAllBytes(Paths.get(filePath)));

                privateKeyContent = privateKeyContent
                .replaceAll("\\n", "")
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "");

                byte[] keyBytes = Base64.getDecoder().decode(privateKeyContent);

                PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(spec);
    }
    public static PublicKey loadPublicKey(String filePath) throws Exception {
    String publicKeyContent = new String(Files.readAllBytes(Paths.get(filePath)));
    publicKeyContent = publicKeyContent
            .replaceAll("\\n", "")
            .replace("-----BEGIN PUBLIC KEY-----", "")
            .replace("-----END PUBLIC KEY-----", "");
    byte[] keyBytes = Base64.getDecoder().decode(publicKeyContent);
    X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    return keyFactory.generatePublic(spec);
}
}
                                                                                                                                                                                                                                                                                        //@author:ÔķŇőᾝüĄĦᾍŉ¦ǠǕņĿ®đþĜĒ¾ĀĈĈĈÄĚĖôĢſĹòĚύýĄĦǌŎ¦ýòĊĊÆĔĔĚĐ¾ćăâĬĀʔɿŘŇ¦ĝĻņŀ®ĲņœᾡûðÿøĊÀĜĎĠĐ¸ĂĆĊâÜŋœţᾥôðĪōƺüĄīœŎîðÿøĊÀĜĎĠĐ·ĉćĊâÜŋœţᾥôðĦŀƸüŌþĺňƀĳòąøÀĖĖĚĖ¶ĂĆĎĊ