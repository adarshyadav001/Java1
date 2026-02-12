class Cust {
    protected String cust_id;
    protected String cust_name;

    public Cust(String id, String name) {
        cust_id = id;
        cust_name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + cust_id);
        System.out.println("Customer Name: " + cust_name);
    }
}

class Guest extends Cust {
    private double delivery_charge;

    public Guest(String id, String name, double charge) {
        super(id, name);
        delivery_charge = charge;
    }

    public void displayGuest() {
        displayCustomer();
        System.out.println("Delivery Charge: " + delivery_charge);
    }
}

class Regular extends Cust {
    protected double discount;

    public Regular(String id, String name, double disc) {
        super(id, name);
        discount = disc;
    }

    public void displayRegular() {
        displayCustomer();
        System.out.println("Discount: " + discount + "%");
    }
}

class Premium extends Regular {
    private int reward_points;

    public Premium(String id, String name, double disc, int points) {
        super(id, name, disc);
        reward_points = points;
    }

    public void displayPremium() {
        displayRegular();
        System.out.println("Reward Points: " + reward_points);
    }
}

public class Main {
    public static void main(String[] args) {

        Guest g = new Guest("G101", "Rahul", 50);
        Regular r = new Regular("R102", "Aman", 10);
        Premium p = new Premium("P103", "Neha", 20, 500);

        System.out.println("---- Guest ----");
        g.displayGuest();

        System.out.println("\n---- Regular ----");
        r.displayRegular();

        System.out.println("\n---- Premium ----");
        p.displayPremium();
    }
}
