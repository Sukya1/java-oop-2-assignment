package mobilePhone;

public class Main {
    public static void main(String[] args) {
    	
        // Instantiate a brand new MobilePhone object and pass it the 4 parameters for your phone (Brand, Model, Phone Number, and Storage Capacity)
    	MobilePhone phone = new MobilePhone("Apple", "13", "9178285465", 12);
        
        // Call the makeCall() method using your phone object - remember to pass it a phone number as input!
    	phone.makeCall("5674568638");
        
        // Call the installApp() method using your phone object - remember to pass it an app name as input!
    	phone.installApp("instagram");
        
        // Display your phones information using the displayInfo() method!
    	phone.displayInfo();
    }
}
