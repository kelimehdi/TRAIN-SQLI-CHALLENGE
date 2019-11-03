import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<InterTrain> trainParts= null;

    public Train(final String train){

        trainParts =new ArrayList<InterTrain>();

        for(int i =0 ; i<train.length();i++){
            if (i!=0) {

                trainParts.get(trainParts.size() - 1);
            }
                if (train.charAt(i) =='P'&& i!=0){
                    trainParts.add(new DeuxPoints(new BasiTrain()));
                    trainParts.add(new Passenger((new BasiTrain())));


                }
                if (train.charAt(i) =='R'&& i!=0){
                    trainParts.add(new DeuxPoints(new BasiTrain()));
                    trainParts.add(new Restaurant(new BasiTrain()));

                }
                if (train.charAt(i) =='H'&& i==0){
                    trainParts.add(new FirstWagon((new BasiTrain())));

                }
                if (train.charAt(i) =='H'&& i!=0){
                    trainParts.add(new DeuxPoints(new BasiTrain()));
                    trainParts.add(new LastWagon((new BasiTrain())));

                }
                 if (train.charAt(i) =='C'&& i!=0){
                     trainParts.add(new DeuxPoints(new BasiTrain()));
                     trainParts.add(new CargoVide(new BasiTrain()));

                  }


            }




        }


    public String   print() {
     String res ="";
        for (InterTrain wg: trainParts){
           res +=  wg.print();
        }
        return res;
    }

    public void detachEnd(){
        trainParts.remove(trainParts.size()-1);
        trainParts.remove(trainParts.size()-1);


    }
    public  void detachHead(){
        trainParts.remove(0);
        trainParts.remove(0);

    }
    public boolean fill(){
        int i=0;
        boolean isFilled=false;
        for (InterTrain wg: trainParts){
            if (wg instanceof CargoVide){
                trainParts.set(i,new CargoPlein(new BasiTrain()));
                isFilled=true;
                break;

            }
            i++;
        }
        return  isFilled;
    }
}
