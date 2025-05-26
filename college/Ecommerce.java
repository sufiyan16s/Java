package college;

class Shipping{
    // String distance;
    // String day;
    // double deliveryCharge;
    public double calculateShippingCost(){

        return 0.0;
    }
}


class StandardShipping extends Shipping{
    @Override
    public double calculateShippingCost(){
    //    if(distance <=50){
    //     return 100.0;
    //    }
    //      else if(distance > 50 && distance <= 100){
    //       return 200.0;
    //      }
    //      else{
          return 20.0;
    //      }
     }
}

class ExpressShipping extends Shipping{
    
    @Override
    public double calculateShippingCost(){
        return 30.0;
    }
}

class OvernightShipping extends Shipping {
    
    @Override
    public double calculateShippingCost(){
        return 50.0;
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        Shipping Standard = new StandardShipping();
        Shipping Express = new ExpressShipping();
        Shipping OverNight = new OvernightShipping();


        System.out.println("Standard Shipping Cost: " + Standard.calculateShippingCost());
        System.out.println("Express Shipping Cost: " + Express.calculateShippingCost());
        System.out.println("Overnight Shipping Cost: " + OverNight.calculateShippingCost());
    }
}
