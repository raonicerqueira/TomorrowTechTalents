package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public abstract class Product implements IProduct {
    protected String name;
    protected int id;
    protected double price;
    protected int quantityInventory;

    public Product() {
    }

    protected Product(String name, int id, double price, int quantityInventory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantityInventory = quantityInventory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInventory() {
        return quantityInventory;
    }

    public void setQuantityInventory(int quantityInventory) {
        this.quantityInventory = quantityInventory;
    }

    public String getData (){
        String data = "";
        data += "Name: " + this.name + " \n";
        data += "Id: " + this.id + " \n";
        data += "Price: " + this.price + " \n";
        data += "Quantity: " + this.quantityInventory + "\n\n";

        return data;
    }
}
