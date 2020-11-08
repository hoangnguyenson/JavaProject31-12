package Bai2;

public class Book extends Document {

    private String authorName;
    private int pageNumber;

    public Book() {
    }

    public Book(String id, String publishName, long releaseVolume, String authorName, int pageNumber) {
        super(id, publishName, releaseVolume);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
