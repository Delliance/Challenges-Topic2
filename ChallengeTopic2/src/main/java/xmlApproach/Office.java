package xmlApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Office {

    public static void main(String[] args) {

//        These three is what Spring is going to do
//        Worker worker = new Worker();
//        Printer printer = new PrinterBW();
//        worker.setPrinter(printer);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("beans.xml loaded");
        Worker worker = applicationContext.getBean("worker",Worker.class);
        worker.printSomething();

    }

}
