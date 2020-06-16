public class Cat extends Animal {

    private final String name;

    public Cat(String name){
        super(name);
        this.name=name;
    }

    @Override
    public void start(){
        System.out.println("Cat starts!");
    }

    @Override
    public void stop(){
        System.out.println("Cat stopped!");
    }

    @Override
    public String getType(){
        String type="Cat";
        return type;
    }
}
