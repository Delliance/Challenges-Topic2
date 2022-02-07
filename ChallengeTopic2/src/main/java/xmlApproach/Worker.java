package xmlApproach;

public class Worker {
//I know the name is not used at all in this project, but I just leave it there as a worker has a name
    private String workerName;
    private Printer printer;

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printSomething(){
        printer.printingOptions();
    }

}
