

Main Class

package com.company;

public class Main {
    public static void main(String[] args) {
        Cellphone OnePlus = new Cellphone();
        Cellphone Apple = new Cellphone();
        OnePlus.setModel("8max");
        System.out.println("The phone model is " + OnePlus.getModel());
    }
}


CellPhone Class

package com.company;

public class Cellphone {

    private int ram;
    private int noOfCameras;
    private String model;
    private String colour;
    private String processor;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("nord") || validModel.equals("7pro")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

	public String getModel(){
	return this.model;
}
}