package xmlApproach;

public class PrinterBW implements Printer{
    @Override
    public void printingOptions() {
        System.out.println("Can print only BW");
    }
}
