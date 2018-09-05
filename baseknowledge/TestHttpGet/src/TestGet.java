import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TestGet {

	public static void main(String[] args) {
		new ReadByGet().start();
	}
	
}
	class ReadByGet extends Thread{
		String test = "http://fanyi.youdao.com/openapi.do?keyfrom=JKXY-test&key=343166845&type=data&doctype=xml&version=1.1&q=welcome";
		
		@Override
		public void run(){
			try {
				URL url = new URL(test);
				URLConnection connection = url.openConnection();
				InputStream is = connection.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				String line;
				StringBuilder builder = new StringBuilder();
				while((line = br.readLine())!=null){
					builder.append(line);
				}
				br.close();
				isr.close();
				is.close();
				
				System.out.println(builder.toString());
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
