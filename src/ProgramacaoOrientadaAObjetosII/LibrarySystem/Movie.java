package ProgramacaoOrientadaAObjetosII.LibrarySystem;

import java.util.ArrayList;

public class Movie extends Product{
    private String studio;
    private String directors;
    private ArrayList<String> genres;
    private ArrayList<String> productionCompanies;

    public Movie() {
    }

    public Movie(String name, int id, double price, int quantityInventory, String studio, String directors, ArrayList<String> genres, ArrayList<String> productionCompanies) {
        super(name, id, price, quantityInventory);
        this.studio = studio;
        this.directors = directors;
        this.genres = genres;
        this.productionCompanies = productionCompanies;
    }
}

