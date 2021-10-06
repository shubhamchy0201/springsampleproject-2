package springAnnotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainClass {
    public static void main(String[] args) {
        //Read spring Config file
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //Get the bean from spring container

        Coach theCoach=context.getBean("tennisCoach",Coach.class);

        //Call method
        System.out.println(theCoach.getDailyWorkout());

        //Call FortuneService method
        System.out.println(theCoach.getFortune());
    }
}
