package book;

public class Comicbook extends Book {
    private int episode;
    public Comicbook(String cover, int numberofpage, int episode) {
        super(cover, numberofpage);
        this.episode = episode;

    }
}
