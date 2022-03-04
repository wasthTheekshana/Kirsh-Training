package SingletonPattern.ParcticeCode;

public class SingletonClass {

    private static volatile SingletonClass singletonClass = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {

        return singletonClass;
    }
}
