public class CargoPlein  extends DecoratorTrain{


    public CargoPlein(InterTrain newTrain) {
        super(newTrain);
    }
    @Override
    public String print(){
        String s =wtrain.print() +"|^^^^|";
        return s;
    }
}
