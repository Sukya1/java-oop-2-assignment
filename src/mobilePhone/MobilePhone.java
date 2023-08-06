package mobilePhone;

public class MobilePhone {
	private String brand;
	private String model;
	private String phoneNumber;
	private int storageCapacity;
	

	public MobilePhone(String brand, String model,String phoneNumber, int storageCapacity) {
		this.brand = brand;
		this.model = model;
		this.phoneNumber = phoneNumber;
		this.storageCapacity = storageCapacity;
		}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getStorageCapacity() {
		return storageCapacity;
	}


	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}


	public void makeCall(String num) {
		System.out.println("We are calling " + num + "from our " + brand + " " + model + "phone");
	}

	public void installApp(String app) {
		System.out.println("Installing " + app + "on our " + brand + " " + model + "phone");
	}

	public void displayInfo( ) {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Storage Capacity: " + storageCapacity + "GB");
	}
}
