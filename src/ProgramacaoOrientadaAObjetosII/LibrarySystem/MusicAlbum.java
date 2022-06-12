package ProgramacaoOrientadaAObjetosII.LibrarySystem;

import java.util.ArrayList;

public class MusicAlbum extends Product{
    private ArrayList<String> musiciansAndBands;
    private ArrayList<String> genre;
    private ArrayList<String> labels;

    public MusicAlbum() {
    }

    public MusicAlbum(String name, int id, double price, int quantityInventory, ArrayList<String> musiciansAndBands, ArrayList<String> genre, ArrayList<String> labels) {
        super(name, id, price, quantityInventory);
        this.musiciansAndBands = musiciansAndBands;
        this.genre = genre;
        this.labels = labels;
    }
}
