package encasulation;

public class Book {
    private int  noOfCopies;
    public Book(int noOfCopies) {
    }
    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }

}
