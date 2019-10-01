package info.repy.dynamodb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true)
@Data
public class B extends SuperB {
    private String b;
    private A a;
    private Map<String, A> mapA;
}
