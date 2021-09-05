package net.zerotodev.api.redis.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data @Component
public class User {
    private String id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return String.format("%s, %s, %s \n", id, name, email);
    }
}