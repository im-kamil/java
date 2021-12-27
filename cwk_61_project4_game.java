// online library project
class library {
    String[] books;
    int no_of_books;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }

        }
        System.out.println("This book doesnot exist");
    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class cwk_61_project4_game {
    public static void main(String[] args) {
        library centralLibrary = new library();
        centralLibrary.addBook("Think grow and reach");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("c++");
        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
