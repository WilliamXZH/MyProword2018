import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

public class RSASignatureUtil {

    public static final String KEY_ALGORITHM = "RSA";
    public static final String RSA_PUBLIC_KEY = "RSA_PUBLIC_KEY";
    public static final String RSA_PRIVATE_KEY = "RSA_PRIVATE_KEY";
    
    /**
     * 生成公私钥密钥对
     * @throws NoSuchAlgorithmException 
     */
    
    public static Map<String, Object> initKey() throws NoSuchAlgorithmException{
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey)keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey)keyPair.getPrivate();
        Map<String, Object> keyMap = new HashMap<String, Object>();
        keyMap.put(RSA_PUBLIC_KEY, publicKey);
        keyMap.put(RSA_PRIVATE_KEY, privateKey);
        return keyMap;
    }
    
    public static byte[] getPublicKey(Map<String, Object> keyMap){
        RSAPublicKey key = (RSAPublicKey)keyMap.get(RSA_PUBLIC_KEY);
        return key.getEncoded();
    }
    
    public static byte[] getPrivateKey(Map<String, Object> keyMap){
        RSAPrivateKey key = (RSAPrivateKey)keyMap.get(RSA_PRIVATE_KEY);
        return key.getEncoded();
    }
    
}
