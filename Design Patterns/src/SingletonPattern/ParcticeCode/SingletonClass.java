package SingletonPattern.ParcticeCode;

public class SingletonClass {

//    private static volatile SingletonClass singletonClass = new SingletonClass();

    private static volatile SingletonClass singletonClass;

    private SingletonClass() {
        if (singletonClass != null) {
            throw new RuntimeException("Please Use getSingletonClass method");
        }
    }

    public static SingletonClass getSingletonClass() {

        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();

                }
            }
        }
        return singletonClass;
    }
}
