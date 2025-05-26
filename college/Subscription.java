package college;

public class Subscription {
    void showFeatuers(){
        System.out.println("General Subscription Features");
    }

    class Basic extends Subscription {
        @Override
        void showFeatuers() {
            System.out.println("Basic subscription featuers");
            System.out.println("Access to Standard Content");
        }
    }
    
}
