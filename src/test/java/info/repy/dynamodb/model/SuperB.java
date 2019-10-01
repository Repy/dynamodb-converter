package info.repy.dynamodb.model;

import lombok.Data;

import java.util.List;

@Data
public class SuperB {
    private A superA;
    private List<A> superListA;
}
