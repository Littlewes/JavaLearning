package littlewes.name;


public class Names extends Thread{
    @Override
    public synchronized void run() {
        for(int i = 0; i <= 100; i =  i + 12){
         System.out.println(System.currentTimeMillis()+" "+i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}