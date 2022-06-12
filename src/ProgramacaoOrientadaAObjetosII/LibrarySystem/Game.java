package ProgramacaoOrientadaAObjetosII.LibrarySystem;

public class Game extends Product {
    private String distributor;
    private String genre;
    private String Studio;

    public Game() {
    }

    public Game(String name, int id, double price, int quantityInventory, String distributor, String genre, String studio) {
        super(name, id, price, quantityInventory);
        this.distributor = distributor;
        this.genre = genre;
        Studio = studio;
    }
}

