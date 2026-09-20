 class Computer {
    void start (){
    System.out.println("Starter");
   }
}   
class Laptop extends Computer {
    void showBattery () {
    System.out.println("showing Battery percentage");
    }
}
class gaminglaptop extends Laptop {
void playgame()
{
    System.out.println("Playing game");

  }
}

 public class Inheritance {

public static void main(String[] args) {
    // Computer pc = new Computer();
    gaminglaptop pc2 = new gaminglaptop();
    pc2.start();
    pc2.showBattery();
    pc2.playgame();
     } 
    }
