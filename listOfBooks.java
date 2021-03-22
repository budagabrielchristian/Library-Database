import java.util.ArrayList;
import java.util.List;

public class listOfBooks {
    List<Library> books = new ArrayList<>();
    int totalPages;
    int numberOfBooks;
    public void addBook(String name, int pages, double rating,String genre,String description){
        books.add(new Library(name, pages, rating,genre,description));
    }

    public void getListOfBooks(){
        for(Library tmpName: books){
            tmpName.printData();

        }
    }
    public void getTitlesOfBooks(){
        for(Library tmpName: books){
            System.out.println(tmpName.getName());
        }
    }
    public void getByRating(double rating){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Books that are rated higher or equal to "+rating+"/5* :");
        for(Library tmpName : books){
            if(tmpName.getRating()>=rating){
                tmpName.printData();
            }
        }
    }
    public void getByTitle(String name){
        for(Library tmpName : books){
            if(tmpName.getName()==name){
                tmpName.printData();
            }
        }
    }
    public void getByGenre(String genre){
        System.out.println(' ');
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Books from the "+genre+" genre: ");
        for(Library tmpName : books){
            if(tmpName.getGenre()==genre){
                tmpName.printData();
            }
        }
    }
    public void getPages(){
        for(Library tmpName : books){
            totalPages+=tmpName.getNumberOfPages();
        }
        System.out.println("You have read a total of "+totalPages+" pages.");
    }
    public void getNumberOfBooks(){
        for(Library tmpName : books){
            numberOfBooks++;
        }
        System.out.println("The Number Of Books In This List: "+numberOfBooks);
    }
}
