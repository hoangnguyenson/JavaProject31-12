package Bai2;

public class Document {

    private String id;
    private String publishName;
    private long releaseVolume;

    public Document() {
    }

    public Document(String id, String publishName, long releaseVolume) {
        this.id = id;
        this.publishName = publishName;
        this.releaseVolume = releaseVolume;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public long getReleaseVolume() {
        return releaseVolume;
    }

    public void setReleaseVolume(long releaseVolume) {
        this.releaseVolume = releaseVolume;
    }
}
