package app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String saing;

    public Cat(@Value("${cat.saing:}") String saing) {
        this.saing = saing;
    }

    @Override
    void say() {
        System.out.println(saing);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
