package SingletonPattern.ParcticeCode;

public class Test {
    public static void main(String[] args) {
        SingletonClass c1 = SingletonClass.getSingletonClass();
        System.out.println(c1);

        SingletonClass c2 = SingletonClass.getSingletonClass();
        System.out.println(c2);
    }
}
