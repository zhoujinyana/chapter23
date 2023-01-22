import java.lang.reflect.Field;

public class HomeWork {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> privateTest = Class.forName("PrivateTest");
        Object o = privateTest.newInstance();
        Field name = privateTest.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"lily");
        System.out.println(name.get(o));


    }
}
class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}