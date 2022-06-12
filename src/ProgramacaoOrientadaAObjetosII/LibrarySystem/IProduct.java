package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public interface IProduct {

    void setName(String name);

    public String getName();

    public int getId();

    public void setId(int id);

    public double getPrice();

    public void setPrice(double price);

    public int getQuantityInventory();

    public void setQuantityInventory(int quantityInventory);

    public String getData();
}
