class Passenger  extends DecoratorTrain{



    public Passenger(InterTrain newTrain) {
        super(newTrain);
    }


    @Override
    public String print(){
        String s =wtrain.print() +"|OOOO|";
        return s;
    }

}
