package fun.mycat.demo05ioc.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Man {
    int age;
    String name;
    public String what(){
        return "man what can i say," + this.age + this.name;
    }
}
