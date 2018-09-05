import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteFile extends Thread{
	
	File file;
	int block;
	int L = 100;
	
	/**
	 * 1          2          3          4          5
	 * |----------|----------|----------|----------|
	 * 
	 * 
	 * @param f
	 * @param b
	 */
	
	public WriteFile(File f, int b){
		this.file = f;
		this.block = b;
	}
	
	@Override
	public void run(){
		try {
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			
			System.out.println(block);
			raf.seek((block-1)*L);
			raf.writeBytes("This is block:" + block);
			for(int i=0;i<20;i++){
				raf.writeBytes("-");
			}
			raf.writeBytes("\n");
			
			/**
			 * File
			 *            |****     |+++
			 * |-----------****------+++---------------|
			 *      |---
			 * 
			 * 
			 */
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
