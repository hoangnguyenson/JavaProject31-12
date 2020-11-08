package Bai2;

public class NewsPaper extends Document {

    private final String releaseDay;

    public String getReleaseDay() {
        return releaseDay;
    }

    public NewsPaper(String id, String publishName, long releaseVolume, String releaseDay) {
        super(id, publishName, releaseVolume);
        this.releaseDay = releaseDay;
    }
}
