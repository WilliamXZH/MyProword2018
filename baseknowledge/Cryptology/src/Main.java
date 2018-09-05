import java.security.NoSuchAlgorithmException;
import java.util.Map;

public class Main {
    
    
    public static void main(String[] args) throws NoSuchAlgorithmException {

        //Test RSASignature
        //≥ı ºªØ√‹‘ø∂‘
        Map<String, Object> keyMap = RSASignatureUtil.initKey();
        byte[] rsaPublicKey = RSASignatureUtil.getPublicKey(keyMap);
        byte[] rsaPrivateKey = RSASignatureUtil.getPrivateKey(keyMap);
        System.out.println("RSASignature PublicKey :" + ByteToHex.fromBytesToHex(rsaPublicKey) );
        System.out.println("RSASignature PrivateKey :" + BytesToHex.fromBytesToHex(rsaPrivateKey));
        
    }
    
}
