public class Memory implements Component {
    private int price;

    public Memory(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
