package book;

public abstract class Book {
    private String cover;
    private int numberofpage;
    private boolean isbookopen;

    public void open(int page){
        if(page <=0 || page > numberofpage) return;
        if(page == 0) {
            isbookopen = false;
            System.out.println("You are on cover page.");
            return;
        }
        System.out.println("You are on page " + page + ".");
        isbookopen = true;
    }
    public boolean isIsbookopen(){
        return isbookopen;
    }

    public Book(String cover, int numberofpage) {
        this.cover = cover;
        this.numberofpage = numberofpage;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getNumberofpage() {
        return numberofpage;
    }

    public void setNumberofpage(int numberofpage) {
        this.numberofpage = numberofpage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "cover='" + cover + '\'' +
                ", numberofpage=" + numberofpage +
                '}';
    }
}