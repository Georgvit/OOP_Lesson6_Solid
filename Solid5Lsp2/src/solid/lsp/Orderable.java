package solid.lsp;

public abstract class Orderable {
    protected int price;
    protected int qnt;

    public Orderable(int price, int qnt) {
        this.price = price;
        this.qnt = qnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public abstract int getAmount();
}
