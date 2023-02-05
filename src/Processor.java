public class Processor implements Component {
    private int price;

    public Processor(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}