public class Computer {
    private Motherboard motherboard;
    private Case computerCase;

    public Computer(Motherboard motherboard, Case computerCase) {
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }

    public int getPrice() {
        return motherboard.getPrice() + computerCase.getPrice();
    }
}