package mcgill.ecse321.eventregistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//Annotations let java spring & gradle know that this is a spring boot application

@RestController
@SpringBootApplication
public class EventRegistrationBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(EventRegistrationBackendApplication.class, args);
  }
// Request map
  @RequestMapping("/")
  public String greeting(){
    return "Hello world!";
  }

}