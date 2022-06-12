package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public class Toy extends Product{
    private String type;

    public Toy() {
    }

    public Toy(String name, int id, double price, int quantityInventory, String type) {
        super(name, id, price, quantityInventory);
        this.type = type;
    }
}
