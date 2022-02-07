package configClassApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        User user = context.getBean(User.class);
//        Her you specify how you want to print
        user.setPrinterOptionToUse("BW");
        user.printSomething();

    }

}
