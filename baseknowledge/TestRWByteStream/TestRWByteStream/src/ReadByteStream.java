import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class ReadByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			byte input[] = new  byte[31];
			fis.read(input);
			
			String inputString = new String(input, "UTF-8");
			System.out.println(inputString);
			System.out.println(":");
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
