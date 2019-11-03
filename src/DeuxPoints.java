class DeuxPoints extends DecoratorTrain{


    public DeuxPoints(InterTrain newTrain) {
        super(newTrain);
    }



    @Override
    public String print(){
        String s =wtrain.print() +"::";
        return s;
    }



}
