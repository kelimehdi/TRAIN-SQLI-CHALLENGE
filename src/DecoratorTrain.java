abstract class DecoratorTrain implements InterTrain {


    protected InterTrain wtrain;

    public DecoratorTrain(InterTrain newTrain) {

         wtrain = newTrain;

    }


    @Override
    public String print() {

        return wtrain.print();
    }


}