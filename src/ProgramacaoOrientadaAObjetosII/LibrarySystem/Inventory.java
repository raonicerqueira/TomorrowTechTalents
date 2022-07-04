package ProgramacaoOrientadaAObjetosII.LibrarySystem;

import java.util.ArrayList;

public class Inventory implements IInventoryManager {
    public ArrayList<Product> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();
    }

    public void addProductToInventory(Product newProduct) {
        int index = findProductIndex(newProduct.id);
        if (index == -1) {
            this.inventory.add(newProduct);
        } else {
            updateInventory(newProduct.id, newProduct.quantityInventory);
        }
    }

    public void updateInventory(int id, int quantityInventory) {
        int index = findProductIndex(id);
        this.inventory.get(index).quantityInventory += quantityInventory;
    }

    public void removeProductFromInventory(int id) {
        int index = findProductIndex(id);
        this.inventory.remove(index);
    }

    public String viewSingleProductData(int id) {
        int index = findProductIndex(id);
        return this.inventory.get(index).getData();
    }

    public String viewAllProductData() {
        String result = "";
        for (Product product : this.inventory) {
            result += product.getData();
        }
        return result;
    }

    public int findProductIndex(int id) {
        for (Product listProduct : this.inventory) {
            if (id == listProduct.getId()) {
                return inventory.indexOf(listProduct);
            }
        }
        return -1;
    }

    public Product findProduct(int id) {
        int index = findProductIndex(id);
        return this.inventory.get(index);
    }

    public int quantityProductByType(Product type) {
        int quantity = 0;
        for (Product product : this.inventory) {
            if (product.getClass() == type.getClass()) {
                quantity += product.getQuantityInventory();
            }
        }
        return quantity;
    }

    public String viewProductsByType(Product type) {
        String dataByType = "";
        for (Product product : this.inventory) {
            if (product.getClass() == type.getClass()) {
                dataByType += product.getData();
            }
        }
        return dataByType;
    }

    public String viewAllProductsByType() {
        String finalData = "";
        String dataBooks = this.viewProductsByType(new Book());
        String dataGames = this.viewProductsByType(new Game());
        String dataMovies = this.viewProductsByType(new Movie());
        String dataMusicAlbuns = this.viewProductsByType(new MusicAlbum());
        String dataToy = this.viewProductsByType(new Toy());

        if (!dataBooks.isEmpty()) {
            finalData += "------------Books------------\n" + dataBooks;
        }
        if (!dataGames.isEmpty()) {
            finalData += "------------Games------------\n" + dataGames;
        }
        if (!dataMovies.isEmpty()) {
            finalData += "------------Movies------------\n" + dataMovies;
        }
        if (!dataMusicAlbuns.isEmpty()) {
            finalData += "------------MusicAlbuns------------\n" + dataMusicAlbuns;
        }
        if (!dataToy.isEmpty()) {
            finalData += "------------Toys------------\n" + dataToy;
        }
        return finalData;
    }
}
