package configClassApproach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User user(){
        return new User(printers());
    }

    @Bean
    public Printers printers(){
//        From here you can select the printer
        return new PrintBW();
    }

}
