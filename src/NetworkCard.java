public class NetworkCard implements Component {
    private int price;

    public NetworkCard(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}