// Desenvolvido por Guilherme Bertero e Guilherme Francisco

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String n, Author[] a, double p){
        this.name = n;
        this.authors = a;
        this.price = p;
    }

    public Book(String n, Author[] a, double p, int q){
        this.name = n;
        this.authors = a;
        this.price = p;
        this.qty = q;
    }

    public String getName(){
        return this.name;
    }

    public Author[] getAuthors(){
        return this.authors;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int q){
        this.qty = q;
    }

    public String toString() {

    String listaAutores = "";
    for (int i = 0; i < this.authors.length; i++) {
        if (this.authors[i] != null) {
            listaAutores += this.authors[i].toString() + ", ";
        }
    }
    
    return "Book[name = " + this.name + 
           ", authors = { " + listaAutores + "}" + 
           ", price: " + this.price + 
           ", qty: " + this.qty + "]";
    }   

    public String getAuthorNames(){
        String names = "";
        for(int i = 0; i < this.authors.length; i++){
            names += this.authors[i].getName();
            if(i < this.authors.length - 1){
                names += ", ";
            }
        }
        return names;
    }
}
