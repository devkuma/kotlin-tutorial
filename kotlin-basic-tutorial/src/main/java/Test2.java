import java.lang.reflect.Method;

public class Test2 {

    public static void main(String[] args) throws NoSuchMethodException {

        Test1 test1 = new Test1();
        Method method1 = test1.getClass().getMethod("setA", Long.class);

        Test3 test3 = new Test3();
        Method method3 = test3.getClass().getMethod("setA", Long.class);

        Class<?> type1 = null;
        for (Class<?> o : method1.getParameterTypes()) {
            System.out.println(o);
            type1 = o;
        }

        Class<?> type2 = null;
        for (Class<?> o : method3.getParameterTypes()) {
            System.out.println(o);
            type2 = o;
        }

        System.out.println(type1.isAssignableFrom(type2));
    }
}
