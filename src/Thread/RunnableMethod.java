package Thread;

// If the class implement the Runnable interface, the thread can be run by passing an instance of the class to a Thread object constructor and then call start
// Benefit in extending other class
public class RunnableMethod implements Runnable{
    @Override
    public void run() {
        System.out.println("This code is running in a (runnable) thread");
    }
    public static void main(String[] args){
        RunnableMethod obj = new RunnableMethod(); // create instance of thread
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running outside of the thread");
    }
}
