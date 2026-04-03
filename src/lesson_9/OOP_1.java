package lesson_9;

public class OOP_1 {
    public String model;
    public Integer speed;
    public OOP_1(String model, Integer speed){
        this.model = model;
        this.speed =speed;
    }
    public void showInf(){
        IO.println("Model"+model+" Speed"+speed);
    }
}
