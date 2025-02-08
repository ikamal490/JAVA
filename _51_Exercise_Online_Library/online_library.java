package _51_Exercise_Online_Library;
/*
    You have to implement a library using java class Library
    Methods: addBook, issueBook, returnBook, showAvailableBook
    Properties: Array to store the available Book
    Array to store the issued book
 */
class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        int no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }

    void showAvailableBook() {
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+book);
             }
        }
        void issueBook(String book){
        for(int i=0; i<books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued !");
                this.books[i] = null;
                return;
            }
            System.out.println("This book does not exist");
        }
        }
    }

    public class online_library {

        public static void main(String[] args) {
            Library centralLibrary = new Library();
            centralLibrary.addBook("\"Rich Dad Poor Dad\"");
            centralLibrary.addBook("\"Python FUll Syllabus\"");
            centralLibrary.addBook("\"JAVA\"");
            centralLibrary.showAvailableBook();

            centralLibrary.issueBook("\"JAVA\"");
            centralLibrary.showAvailableBook();

        }
    }
