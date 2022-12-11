package task1;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private int weight;


    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.model = "Monoblock";
        this.weight=300;
        this.number="+375295775056";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name,String number) {
        System.out.println("Call " + name + " " + number);
    }
    public void sendMessage(String... number){
        System.out.println("Send a message to the numbers: "+Arrays.deepToString(number));
    }

    @Override
    public String toString() {
        return "Phone:\n" +
                "number: " + number +
                ",\nmodel: " + model +
                ",\nweight: " + weight +"g"+
                ";";
    }
}
