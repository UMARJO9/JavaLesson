import lesson_9.OOP_1;

void main(){
    OOP_1 bmw = new OOP_1("Bmw",500);
    OOP_1 mers = bmw;
    bmw.speed = 400;
    bmw.model="BMMMMM";
    mers.speed = 500;
    mers.model= "Mers";
    bmw.showInf();
    mers.showInf();
}