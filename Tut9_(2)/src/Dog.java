public class Dog extends Canine {

    String dog;
    public Dog(String dog){
        this.dog = dog;
    }
    public String getDog() {
        return dog;
    }

    @Override
    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
        System.out.println("Barks loudly");
    }

}
