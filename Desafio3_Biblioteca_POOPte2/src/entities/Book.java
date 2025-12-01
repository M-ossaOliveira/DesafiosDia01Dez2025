package entities;

public class Book {

    private String title;
    private String author;
    private Boolean freeToBook;

    public Book(String title, String author, Boolean freeToBook) {
        this.title = title;
        this.author = author;
        this.freeToBook = freeToBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getFreeToBook() {
        return freeToBook;
    }

    public void setFreeToBook(Boolean freeToBook) {
        this.freeToBook = freeToBook;
    }

    public void emprestar(){
        if(freeToBook){
            freeToBook=false;
            System.out.println("Livro reservado com sucesso");
        }
        else {
            System.out.println("Livro indisponível");
        }
    }

    public void devolver(){
        if(!freeToBook){
            freeToBook=true;
            System.out.println("Livro devolvido com sucesso");
        }
        else {
            System.out.println("Livro não pode ser devolvido, está disponível");
        }
    }

    @Override
    public String toString(){
        return"";
    }
}
