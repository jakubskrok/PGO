import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> item = new ArrayList<>();
        HashSet<Item> hashSet = new HashSet<>();
        Map<Integer,String> hashMap = new HashMap<Integer,String>();

        System.out.println("RTV shopping list: ");
        System.out.println(" ");


        Item i1 = new Item("phone",1);
        Item i2 = new Item("cable",5);
        Item i3 = new Item("dock",4);
        Item i4 = new Item("printer",3);
        Item i5 = new Item("iPad",2);

        item.add(i1);
        item.add(i2);
        item.add(i3);
        item.add(i4);
        item.add(i5);

        i1.show();
        i2.show();
        i3.show();
        i4.show();
        i5.show();

        for(Item i : item) {
            hashMap.put(i.getId(), i.getName());
        }

        System.out.println(" ");

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            System.out.println(" ");
            System.out.println("ID:" + entry.getKey() +
                    ", Name: " + entry.getValue());

        }

        // adding 10 more items (grocery shopping list) 3 Task

        Item i6 = new Item("banana",11);
        Item i7 = new Item("orange",12);
        Item i8 = new Item("sausage",13);
        Item i9 = new Item("beef",14);
        Item i10 = new Item("chicken",15);
        Item i11 = new Item("tomatoes",6);
        Item i12 = new Item("pickles",7);
        Item i13 = new Item("peanuts",9);
        Item i14 = new Item("chips",8);
        Item i15 = new Item("water",10);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Grocery shopping list:");
        System.out.println(" ");

        item.add(i6);
        item.add(i7);
        item.add(i8);
        item.add(i9);
        item.add(i10);
        item.add(i11);
        item.add(i12);
        item.add(i13);
        item.add(i14);
        item.add(i15);

        i6.show();
        i7.show();
        i8.show();
        i9.show();
        i10.show();
        i11.show();
        i12.show();
        i13.show();
        i14.show();
        i15.show();

        List<Item> firstFive = item.subList(5, 10);
        for(Item i : firstFive) {
            hashSet.add(i);
            System.out.println(" ");
            System.out.print("ID:" +  i.getId() + " ");
            System.out.println(i.getName());
        }
    }
}
