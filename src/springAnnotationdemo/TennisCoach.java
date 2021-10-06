package springAnnotationdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;


import java.beans.ConstructorProperties;

@Component
public class TennisCoach implements Coach{
    @Autowired
    //@Qualifier("happyFortuneService")
    @Qualifier("randomService")
    private FortuneService fortuneService;
    /*
    //Constructor Injection
    @Autowired
    public TennisCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }*/

    //Default Constructor
    public TennisCoach()
    {
        System.out.println("TennisCoach Class constructor");
    }

    //Setter method Injection
   /*  @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter method Of tenniscoach class");
        this.fortuneService = fortuneService;
    }
    */
    //Define my init method
    public void startupStuff()
    {
        System.out.println("In StartupStuff method");
    }
    //Define my Destroy method

    public void cleanupStuff()
    {
        System.out.println("In cleanupStuff method");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
