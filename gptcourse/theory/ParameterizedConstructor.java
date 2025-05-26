package gptcourse.theory;
class Cars{
    String model;

    Cars(String m) {
        model = m;
    }

    void show(){
        System.out.println("Car model: " + model);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args){
        Cars c1 = new Cars("BMW");

        c1.show();
    }
    
}
