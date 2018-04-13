package doSingleton;

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    public static Singleton getInstance() {
        return ourInstance;
    }
    private Singleton() {
    }
    public void doWork(){
        System.out.println("Job is done!");
    }
    public class TestSingleton {
        public  void main(String[] args) {
            Singleton singleton = Singleton.getInstance();
            singleton.doWork();
            Singleton singleton1 =  Singleton.getInstance();
            singleton1.doWork();

        }
    }
}
