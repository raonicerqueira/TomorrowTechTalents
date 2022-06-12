package ProgramacaoOrientadaAObjetosII.LibrarySystem;

import java.util.ArrayList;
import java.util.Arrays;

public class LibrarySystem {
    static Inventory estoque = new Inventory<>();
    static Cashier caixa = new Cashier(100);

    public static void main(String[] args) {

        Book livro = new Book("Senhor dos Aneis", 1, 200d, 150, new ArrayList<>(Arrays.asList("fantasia")), "raoni", "disney");
        Game jogo = new Game("God of War", 2, 349d, 100, "Sony", "Ação", "Sony");
        Game jogo1 = new Game("Gears of War", 3, 349d, 500, "Sony", "Ação", "Sony");


        estoque.addProductToInventory(livro);
        estoque.addProductToInventory(jogo);
        estoque.addProductToInventory(jogo1);

        System.out.println(estoque.viewAllProductsByType());

        makePurchase(1, 20);
;

        System.out.println(estoque.viewAllProductsByType());

        System.out.println(caixa.getCash());
    }

    public static void makePurchase(int productId, int quantity) {
        Product product = estoque.findProduct(productId);
        estoque.updateInventory(productId, quantity);
        caixa.setCash(caixa.getCash() + (quantity * product.getPrice()));
    }
}
