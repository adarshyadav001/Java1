//Sealed Class
sealed class Vehicles permits Car, Bike {
    public void speed(){
        System.out.println(" min Speed is 20km/hr");
    }
}
sealed class Car extends Vehicles permits Evcar{
    @Override
    public void speed(){
        System.out.println(" Min Car Speed is 20km/hr");
    }
}

final class Evcar extends Car{
    @Override
    public void speed(){
        System.out.println(" Min Evcar Speed is 20km/hr");
    }
}