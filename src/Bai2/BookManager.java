package Bai2;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<Document> documentList;

    public BookManager() {
        this.documentList = new ArrayList<>();
    }

    public void addNewDocument(Document document) {
        documentList.add(document);
    }

    public void deleteDocument(String Id) {
        documentList.removeIf(document -> document.getId().equals(Id));
        System.out.println("Deleted");
    }

    public void showListInfoOfficer(String id) {
        for (Document document : documentList) {
            if (document.getId().equals(id)) {
                System.out.println("Id: " + document.getId());
                System.out.println("PublishName: " + document.getPublishName());
                System.out.println("ReleaseVolume: " + document.getReleaseVolume());
            }
        }
    }
    public void searchByBook() {
        this.documentList.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.documentList.stream().filter(doc -> doc instanceof NewsPaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByMagazine() {
        this.documentList.stream().filter(doc -> doc instanceof Magazine).forEach(doc -> System.out.println(doc.toString()));
    }
    public void exit() {
        System.exit(1);
    }
}
