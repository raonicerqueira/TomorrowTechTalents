package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public interface IInventoryManager {

    public void addProductToInventory(Product newProduct);

    public void updateInventory(int id, int quantityInventory);

    public void removeProductFromInventory(int id);

    public String viewSingleProductData(int id);

    public String viewAllProductData();

    public int findProductIndex(int id);

    public Product findProduct(int id);

    public int quantityProductByType(Product type);

    public String viewProductsByType(Product type);

    public String viewAllProductsByType();
}
