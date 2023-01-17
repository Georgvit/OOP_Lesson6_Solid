package solid.srp.models;

import java.util.Scanner;

public class InputData {
    private Order order;

    public InputData(Order order) {
        this.order = order;
    }

    public void inputFromConsole(Order order) {
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
