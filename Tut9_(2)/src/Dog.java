public class Dog extends Canine {

    String dog;
    public Dog(String dog){
        this.dog = dog;
    }
    public String getDog() {
        return dog;
    }

    @Override
    public String getMakeNoise(){
        return "makes a noise";
    }

}
