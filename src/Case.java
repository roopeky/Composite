import java.util.ArrayList;
import java.util.List;

public class Case implements Component {
    private int price;
    private List<Component> components = new ArrayList<>();

    public Case(int price) {
        this.price = price;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        int totalPrice = price;
        for (Component component : components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }
}