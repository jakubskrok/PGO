public class Animal {

    String makeNoise;
    String roam;

    public Animal(){}

    public void sleep(){
        System.out.println("Zzz");
    }

    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
    }

    public String getMakeNoise() {
        return makeNoise;
    }

    public void setRoam(String roam) {
        this.roam = roam;
    }

    public String getRoam() {
        return roam;
    }
}
