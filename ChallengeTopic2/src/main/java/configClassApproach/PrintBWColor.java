package configClassApproach;

public class PrintBWColor implements Printers {
    @Override
    public void printingOptions(String selectedOption) {

        switch (selectedOption.toUpperCase()){
            case "BW":
                System.out.println("Printing Black and White");
                break;
            case "COLOR":
                System.out.println("Printing in Color");
                break;
            default:
                System.out.println("Not a valid option");
        }

    }


}
