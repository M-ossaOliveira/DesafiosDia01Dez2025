package entities;

public class PhysicBook extends Book{

    private String localizacaoPrateleira;

    public PhysicBook(String title, String author, Boolean freeToBook, String localizacaoPrateleira) {
        super(title, author, freeToBook);
        this.localizacaoPrateleira = localizacaoPrateleira;
    }

    public String getLocalizacaoPrateleira() {
        return localizacaoPrateleira;
    }

    public void setLocalizacaoPrateleira(String localizacaoPrateleira) {
        this.localizacaoPrateleira = localizacaoPrateleira;
    }

    @Override
    public String toString(){
        return "Livro "+getTitle()+", autor: "+getAuthor()+"\n Está localizado na "+getLocalizacaoPrateleira();
    }
}
