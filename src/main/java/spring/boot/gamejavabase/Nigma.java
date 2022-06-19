package spring.boot.gamejavabase;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class Nigma {

    private int nigma;
    private int counter;

    @PostConstruct
    public int getNigma() {
        if (counter == 0) {
            nigma = new Random().nextInt(1000);
            counter++;
        }
        return nigma;
    }

    @Override
    public String toString() {
        return "Nigma{" +
                "nigma=" + nigma +
                '}';
    }
}