
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
                    System.out.println("车票:" + ticket--);
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
            System.out.println("车票:" + ticket--);
        } 
    }
    
}

/**
 * 死锁：学生找工作（高薪）
 *     企业需要你有工作经验（经验）
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
