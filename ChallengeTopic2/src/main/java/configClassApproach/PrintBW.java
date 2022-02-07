package configClassApproach;

public class PrintBW implements Printers {
    @Override
    public void printingOptions(String selectedOption) {

        switch (selectedOption){
            case "BW":
                System.out.println("Printing Black and White");
                break;
            default:
                System.out.println("Not a valid option");
        }

    }
}
