package configClassApproach;

import org.springframework.stereotype.Component;

@Component
public class User {

//    private String workerName; //not really using it
    private Printers printers;
    private String printerOptionToUse;

    public User (Printers printers){
        this.printers=printers;
    }

    public void setPrinterOptionToUse(String printerOptionToUse) {
        this.printerOptionToUse = printerOptionToUse;
    }

    public void printSomething(){
//        Here the user specifies that we want to print in BW
        printers.printingOptions(printerOptionToUse);
    }

}
