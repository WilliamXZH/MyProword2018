
public class MyRunnable implements Runnable{

    private String name;
    public MyRunnable(String name){
        this.name = name;
    }
    
    @Override
    public void run() {
        
        for(int i=0;i<1000;i++){
            System.out.println(name +":" + i);
        }
        
        // TODO Auto-generated method stub
        
    }

}
