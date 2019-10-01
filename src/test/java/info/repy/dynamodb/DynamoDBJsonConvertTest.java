package info.repy.dynamodb;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.io.IOException;
import java.util.Map;

public class DynamoDBJsonConvertTest {

    @Test
    public void test() throws IOException {
        String json = "{\"n\":null,\"s\":\"\",\"a\":\"a\",\"b\":[\"b\",\"b2\"],\"c\":{\"c1\":\"c1\",\"c2\":[\"c21\",\"c22\"]}}";
        JsonNode jsonNode = DynamoDBJsonConvert.mapper.readTree(json);
        System.out.println(json);
        System.out.println(jsonNode.toString());
        Map<String, AttributeValue> attributeValueB = DynamoDBJsonConvert.toAttributeMap(jsonNode);
        JsonNode jsonNode2 = DynamoDBJsonConvert.toJson(attributeValueB);
        System.out.println(jsonNode2.toString());
    }

}
