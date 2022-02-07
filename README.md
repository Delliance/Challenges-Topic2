# Challenges-Topic2
Dependency injection with Spring

For this example I used two approaches for the dependency injection with Spring. 
One of the approaches uses a XML file to configure the Beans, the other approach configures the Beans from a Config.java class. (The approach with Config.java has the possibility to set what color you want to use based on the printer)

For this project you already have a template for the printers with the Printers Interface, this allows you to create any new printer that you want to add in the future, just be sure that the new printer matches with the options of other printers if they already exist, otherwise feel free to create a new one.

To select the option of the printer (BW or Color (only options right now)) just set it for the user.

Short version:
-Create any new printer implementing the interface Printers.java
-Select printer from the available ones in UserConfig.java
-Select how you want to print from Main.java (BW or Color)
