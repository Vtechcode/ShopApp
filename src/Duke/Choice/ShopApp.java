package Duke.Choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2, total;
        System.out.println("Welcome to Duke Choice shop");
        Customer c1 = new Customer();
        c1.name ="Pinky";
        c1.size = "S";
        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        System.out.println("Hello " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";

       Clothing[] items = {item1, item2};

        System.out.println(item1.description + ", " + item1.price + ", " + items[0].size);
        System.out.println(item2.description + ", " + item2.price + ", " + item2.size);

        total = ((item1.price * tax) + item1.price) + ((item2.price * tax *2) + (item2.price *2));
        System.out.println(c1.name + " your total purchase is " + total + " and you wear size " + c1.size);
    }
}
