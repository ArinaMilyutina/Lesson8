package task1;

public class WriterInfo {
    public  static void main(String[]args){
        Phone ph1=new Phone();
        Phone ph2=new Phone("+375292965148","Slider",200);
        Phone ph3=new Phone("+375334429887","Clamchell");
        System.out.println(ph1+"\n"+ph2+"\n"+ph3);
        ph1.receiveCall("Arina","+375295775056");
        ph1.sendMessage("+375298899771","+375331019186");
        ph2.receiveCall("Liza","+375336206041");
        ph2.sendMessage("++375336206041","+375447790865");
        ph3.receiveCall("Nastya","+375336956301");
        ph3.sendMessage("+375336956301 ","+375298343306","8029607455");

     }
}
