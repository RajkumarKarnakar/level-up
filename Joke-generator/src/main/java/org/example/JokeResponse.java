package org.example;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JokeResponse {
    private String id;
    private String joke;
    private int status;
}
