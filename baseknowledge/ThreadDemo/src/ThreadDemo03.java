
class RunnableDemo implements Runnable{
    
    private String name;
    public RunnableDemo(String name){
        this.name = name;
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i=0;i<50;i++){
            
            /*try {
                Thread.sleep(1000);
                //System.out.println(name + ":" +i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }*/
            
            
            System.out.println(i+"��ǰ�̶߳���" + Thread.currentThread().getName());
            
            if(i==10){
                System.out.println("����");
                Thread.yield();
            }
        }
        
    }
}

public class ThreadDemo03 {

    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("A");
        RunnableDemo r2 = new RunnableDemo("A");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        System.out.println(t1.isAlive());
        t1.start();
        /*for(int i=0;i<50;i++){
            if(i>10){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("���̣߳�" +i);
        }*/
        
        System.out.println(t1.isAlive());
        
        t2.start();
    }
    
}
