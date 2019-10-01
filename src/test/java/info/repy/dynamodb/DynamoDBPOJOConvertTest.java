package info.repy.dynamodb;

import info.repy.dynamodb.model.A;
import info.repy.dynamodb.model.B;
import org.junit.Test;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DynamoDBPOJOConvertTest {

    @Test
    public void test() {
        A a = new A();
        a.setSuperA("SA");
        a.setA("SA");
        B b = new B();
        b.setA(a);
        b.setB("B");
        Map<String,A> map = new HashMap<>();
        map.put("a",a);
        map.put("a1",a);
        map.put("a2",a);
        b.setMapA(map);
        b.setSuperListA(Arrays.asList(a,a,a,a,a));
        b.setSuperA(a);

        System.out.println(b);

        HashMap<String, AttributeValue> attributeValueB = DynamoDBPOJOConvert.toAttributeObject(b);
        B changeB = DynamoDBPOJOConvert.toJavaObject(B.class ,attributeValueB);

        System.out.println(changeB);
    }

}
