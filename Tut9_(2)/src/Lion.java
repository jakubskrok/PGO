public class Lion extends Feline {

    String lion;
    public Lion(String lion){
        this.lion = lion;
    }
    public String getLion() {
        return lion;
    }

    @Override
    public String getMakeNoise(){
        return "makes a noise";
    }



}
