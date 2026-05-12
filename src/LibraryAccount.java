public class LibraryAccount {
    private final String readerName;
    private final int borrowedBooks;
    private final int lateDays;

    public LibraryAccount(String readerName, int borrowedBooks, int lateDays) {
        this.readerName = readerName;
        this.borrowedBooks = borrowedBooks;
        this.lateDays = lateDays;
    }

    //non-static inner class
    public class FineCalculator {
        public double calculate() {
            //fine formula
            return borrowedBooks * lateDays * 1.50;
        }
    }

    public String getReaderName() {
        return readerName;
    }
}