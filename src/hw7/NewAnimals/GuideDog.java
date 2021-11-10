package hw7.NewAnimals;


import hw7.Interfaces.TakeHome;

public class GuideDog extends Dog implements TakeHome {

    private boolean isTrained;

    public GuideDog(int id, double weight, int age, String color,
                    String name, boolean isVaccinated, boolean isTrained) {
        super(id, weight, age, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public void toTakeHome(){
        if(isTrained){
            System.out.println("I can take you home.");
        }else{
            System.out.println("I am not trained yet.");
        }
    }

    @Override
    public void toSwim(){
        if(isTrained){
            System.out.println("I even can swim with my owner.");
        }else{
            System.out.println("I am not trained for swimming yet.");
        }
    }


}
