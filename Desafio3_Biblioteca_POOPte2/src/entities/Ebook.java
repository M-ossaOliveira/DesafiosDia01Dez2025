package entities;

public class Ebook extends Book{

    private String extension;

    public Ebook(String title, String author, Boolean freeToBook, String extension) {
        super(title, author, freeToBook);
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
    @Override
    public String toString(){
        return "Livro "+getTitle()+", autor: "+getAuthor()+"\n Tem formato digital ."+getExtension();
    }
}
