package Bai2;

public class Magazine extends Document {

    private int releaseNumber;
    private int releaseMonth;

    public Magazine() {
    }

    public Magazine(String id, String publishName, long releaseVolume, int releaseNumber, int releaseMonth) {
        super(id, publishName, releaseVolume);
        this.releaseNumber = releaseNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }
}
