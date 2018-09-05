
class MyThreadDemo implements Runnable{

    private int ticket = 5;
    
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            tell();
/*            synchronized (this) {
                   
                if(ticket>0){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("��Ʊ:" + ticket--);
                } 
            }*/
        }
        
        // TODO Auto-generated method stub
        
    }
    
    public synchronized void tell(){
        if(ticket>0){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("��Ʊ:" + ticket--);
        } 
    }
    
}

/**
 * ������ѧ���ҹ�������н��
 *     ��ҵ��Ҫ���й������飨���飩
 * 
 */

public class ThreadDemo05 {

    
    public static void main(String[] args) {
        MyThreadDemo m = new MyThreadDemo();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        t1.start();
        t2.start();
        t3.start();
    }
}
