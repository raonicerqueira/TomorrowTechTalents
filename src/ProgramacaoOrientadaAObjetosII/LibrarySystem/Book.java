package ProgramacaoOrientadaAObjetosII.LibrarySystem;

import java.util.ArrayList;

public class Book extends Product {
    private ArrayList<String> genres;
    private String writer;
    private String publisher;

    public Book() {
    }

    public Book(String name, double price, int quantityInventory, ArrayList<String> genres, String writer, String publisher) {
        super(name, price, quantityInventory);
        this.genres = genres;
        this.writer = writer;
        this.publisher = publisher;
    }

}
