package com.jkxy.main;

public class MyServerSocket {

    public static void main(String[] args) {
        new ServerListener().start();
        
        
/*        //1-65535
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            //bock
            Socket socket = serverSocket.accept();
            //��������
            JOptionPane.showMessageDialog(null, "�пͻ������ӵ��˱�����12345�˿�");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        */
        
    }
    
}
