package info.repy.dynamodb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true)
@Data
public class A extends SuperA {
    private String a;
}
