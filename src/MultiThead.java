class T {
    int n;
    int flag = 0, flag1 = 0;
    synchronized void generate(){
        while(flag == 1 || flag1 == 1){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println("Blah Blah");
            }
        }
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Inreupt");
        }
        n = (int)(Math.random()*100 + 1);
        System.out.println("Generated Number is " + n);
        flag = flag1 = 1;
        notifyAll();
    }
    synchronized void square(){
        while (flag == 0){
            try{
                wait();
            }
            catch (InterruptedException e ){
                System.out.println("dfdb");
            }

        }
        System.out.println("Square of " + n + " is " + (n*n));
        flag = 0;
        notifyAll();
    }
    synchronized void cube(){
        while(flag1 == 0){
            try {
                wait();
            }
            catch (InterruptedException e){
                System.out.println("dfhbd");
            }
        }
        System.out.println("The cube of " + n + " is " + (n*n*n));
        flag1 = 0;
        notifyAll();
    }

}

public class MultiThead {
    public static void main(String[] args) {
        T m = new T();
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                m.generate();
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                m.square();
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                m.cube();
            }
        }).start();

    }
}
