import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test4 {
    public static void main(String[] args) {
        arrayTest();
    }

    static void arrayTest() {
        String[] stringArray = new String[5];

        // 배열에서는 공변이고, String은 Object의 하위 타입이기에 할당이 가능하다.
        Object[] objectArray = stringArray;

        // 공변으로 인해 선언한 objectArray은 Object로 참조가 된상태라 int도 할당 가능하다.
        objectArray[0] = 1; // 여기서 런타임에 ArrayStoreException 발생

        Object s = Arrays.stream(objectArray).findFirst();
    }
}
