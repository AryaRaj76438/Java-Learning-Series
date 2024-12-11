package Thread;

// If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method
public class ThreadMethod extends Thread{
    public void run(){
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args){
        ThreadMethod thread = new ThreadMethod();
        thread.start();
        System.out.println("this code is outside of the thread");
    }
}
