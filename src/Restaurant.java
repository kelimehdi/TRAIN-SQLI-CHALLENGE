class Restaurant extends DecoratorTrain{




    public Restaurant(InterTrain newTrain) {
        super(newTrain);
    }


    @Override
    public String print(){
        String s =wtrain.print() +"|hThT|";
        return s;
    }



}