public class Library {
    String name;
    int pages;
    double rating;
    String genre;
    String description;


    Library(){
        this.name=null;
        this.pages=0;
        this.rating=0;
        this.genre=null;
        this.description=null;
    }
    Library(String name,int pages, double rating,String genre,String description){
        this.name=name;
        this.pages=pages;
        this.rating=rating;
        this.genre=genre;
        this.description=description;
    }
    protected String getName(){
        return this.name;
    }
    protected int getNumberOfPages(){
        return this.pages;
    }
    protected double getRating(){
        return this.rating;
    }
    protected String getGenre(){
        return this.genre;
    }
    protected String getDescription(){
        return this.description;
    }
    protected void printData(){
        System.out.println(' ');
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Name Of The Book: "+this.name+';');
        System.out.println("Number Of Pages: "+this.pages+';');
        System.out.println("Rating Of The Book: "+this.rating+"/5;");
        System.out.println("Genre Of The Book: "+this.genre+';');
        System.out.println("Description: "+this.description+';');
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(' ');
    }
}
