package com.jkxy.main;

public class MyServerSocket {

    public static void main(String[] args) {
        new ServerListener().start();
        
        
/*        //1-65535
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            //bock
            Socket socket = serverSocket.accept();
            //建立连接
            JOptionPane.showMessageDialog(null, "有客户端链接到了本机的12345端口");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        
    }
    
}
