package com.jkxy.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import com.jkxy.view.MainWindow;

public class ChatManager {

    private ChatManager(){}
    
    private static final ChatManager instance = new ChatManager();
    public static ChatManager getCM(){
        return instance;
    }
    
    MainWindow window;
    Socket socket;
    String IP;
    BufferedReader reader;
    PrintWriter writer;
    
    public void setWindow(MainWindow window){
        this.window = window;
        window.appendText("文本框已经和ChatManager绑定了!");
    }
    
    public void connect(String ip){
        this.IP = ip;
        new Thread(){
            @Override
            public void run() {
                try {
                    socket = new Socket(IP, 12345);
                    
                    writer = new PrintWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream()));
                    reader = new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));
                    
                    String line;
                    while((line = reader.readLine())!=null){
                        window.appendText("收到：" + line);
                    }
                    //writer.close();
                    //reader.close();
                    //writer = null;
                    //reader = null;
                    
                } catch (UnknownHostException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            };
        }.start();
    }
    
    public void send(String out){
        if(writer!=null){
            writer.write(out);
            writer.flush();
        }else{
            window.appendText("当前的链接已中断");
        }
    }
    
}
