package solid.lsp;

public class Order extends Orderable{

    public Order(int price, int qnt) {
        super(price, qnt);
    }

    @Override
    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
