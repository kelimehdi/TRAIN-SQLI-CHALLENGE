 class FirstWagon extends DecoratorTrain
{
    public FirstWagon(InterTrain newTrain) {
        super(newTrain);
    }


    @Override
    public String print(){
        String s =wtrain.print() +"<HHHH";
        return s;
    }
}
