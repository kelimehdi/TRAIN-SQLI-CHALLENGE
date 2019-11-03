 class LastWagon extends DecoratorTrain {

    public LastWagon(InterTrain newTrain) {
        super(newTrain);
    }


    @Override
    public String print(){
        String s =wtrain.print() +"HHHH>";
        return s;
    }
}
