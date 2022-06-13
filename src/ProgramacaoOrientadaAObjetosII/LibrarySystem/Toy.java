package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public class Toy extends Product{
    private String type;

    public Toy() {
    }

    public Toy(String name, double price, int quantityInventory, String type) {
        super(name, price, quantityInventory);
        this.type = type;
    }
}
