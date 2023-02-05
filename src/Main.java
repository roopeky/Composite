public class Main {
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard(150);
        motherboard.addComponent(new Processor(450));
        motherboard.addComponent(new Memory(100));
        motherboard.addComponent(new NetworkCard(10));

        Case computerCase = new Case(90);
        computerCase.addComponent(new GraphicsCard(850));

        Computer computer = new Computer(motherboard, computerCase);
        int price = computer.getPrice();

        System.out.println("Price of the computer is: " + price);
    }
}