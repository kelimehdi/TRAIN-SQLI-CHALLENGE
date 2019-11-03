public class CargoVide extends DecoratorTrain {


    public CargoVide(InterTrain newTrain) {
        super(newTrain);
    }

    @Override
    public String print(){
        String s =wtrain.print() +"|____|";
        return s;
    }
}
