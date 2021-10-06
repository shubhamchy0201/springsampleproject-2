package springAnnotationdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService{

    //Array of string
    private String[] str={"Hii everyone", "Hellooooo", "hiiiiiiiii"};
    //Create random num generator
    private Random random=new Random();
    @Override
    public String getFortune() {
        int index=random.nextInt(str.length);
        return str[index];
    }
}
