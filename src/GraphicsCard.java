public class GraphicsCard implements Component {
    private int price;

    public GraphicsCard(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}