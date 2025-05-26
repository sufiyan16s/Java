package gptcourse.inheritance;

interface Ad {
    void methodAd();
}

interface Bd {
    void methodBd();
}

class Cd implements Ad, Bd {
    public void methodAd() {
        System.out.println("Interface A");
    }
    public void methodBd() {
        System.out.println("Interface B");
    }
}
public class MultipleDemo {
    public static void main(String[] args) {
        Cd c1 = new Cd();

        c1.methodAd();
        c1.methodBd();
    }
}
