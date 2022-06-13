package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public class Game extends Product {
    private String distributor;
    private String genre;
    private String Studio;

    public Game() {
    }

    public Game(String name, double price, int quantityInventory, String distributor, String genre, String studio) {
        super(name, price, quantityInventory);
        this.distributor = distributor;
        this.genre = genre;
        Studio = studio;
    }
}

