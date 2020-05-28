public class Item {

    private String name;
    private int id;

    public Item(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void show(){
        System.out.println(this.name);
    }
}