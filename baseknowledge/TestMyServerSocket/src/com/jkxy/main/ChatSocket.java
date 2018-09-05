package com.jkxy.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatSocket extends Thread{

    Socket socket;
    public ChatSocket(Socket s){
        this.socket = s;
    }
    
    public void out(String out){
        
        try {
            socket.getOutputStream().write(out.getBytes("UTF-8"));
            socket.getOutputStream().flush();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(),"UTF-8"));
            out("你已经连接到本服务器了!!!");
            System.out.println(socket.getInetAddress()+":"+socket.getPort());
            String line = null;
            while((line=br.readLine())!=null){
                System.out.println(line);
                ChatManager.getChatManager().publish(this, line);
                
            }
            //br.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
/*    @Override
    public void run() {
        
        int count = 0;
        while(true){
            count++;
            out("loop+"+count);
            
            try {
                sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }*/
    
/*    @Override
    public void run() {
     
        try {
            BufferedWriter bw = 
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream()));
            int count = 0;
            while(true){
                bw.write("1000" + count);
                sleep(1000);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        // TODO Auto-generated method stub
        super.run();
    }*/
}
