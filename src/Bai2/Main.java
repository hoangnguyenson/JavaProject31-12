package Bai2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To delete by Id: ");
            System.out.println("Enter 3: To show document by Id");
            System.out.println("Enter 4: To search document by Id");
            System.out.println("Enter 5: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1":
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Magazine");
                    System.out.println("Enter c: to insert NewsPaper");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":
                            insertBook(bookManager, scanner);
                            break;
                        case "b":
                            insertMagazine(bookManager, scanner);
                            break;
                        case "c":
                            insertNewsPaper(bookManager, scanner);
                            break;
                    }
                case "2": {
                    deleteDocument(bookManager, scanner);
                    break;
                }
                case "3": {
                    System.out.println("Enter Id to Show Infor :");
                    String id = scanner.nextLine();
                    bookManager.showListInfoOfficer(id);
                    break;
                }
                case "4": {
                    searchDocumentById(bookManager, scanner);
                    break;
                }
                case "5": {
                    bookManager.exit();
                }
                default:
                    System.out.println("Invalid");
            }
        }
    }

    private static void insertBook(BookManager bookManager, Scanner scanner) {
        System.out.print("Enter Id: ");
        String idBook = scanner.nextLine();
        System.out.print("Enter PublishName:");
        String publishName = scanner.nextLine();
        System.out.print("Enter ReleaseVolume > 0: ");
        int releaseVolume = scanner.nextInt();
        System.out.print("Enter AuthorName: ");
        String authorName = scanner.nextLine();
        System.out.print("Enter PageNumber > 0: ");
        int pageNumber = scanner.nextInt();
        Book book = new Book(idBook, publishName, releaseVolume, authorName, pageNumber);
        bookManager.addNewDocument(book);
        System.out.println("ID: " + book.getId());
        System.out.println("PublishName: " + book.getPublishName());
        System.out.println("ReleaseVolume: " + book.getReleaseVolume());
        System.out.println("Authorname: " + book.getAuthorName());
        System.out.println("PageNumber: " + book.getPageNumber());
    }

    private static void insertMagazine(BookManager bookManager, Scanner scanner) {
        System.out.print("Enter idMagazine: ");
        String idMagazine = scanner.nextLine();
        System.out.print("Enter publishNameMagazine:");
        String publishNameMagazine = scanner.nextLine();
        System.out.print("Enter ReleaseVolume > 0: ");
        int releaseVolumeMagazine = scanner.nextInt();
        System.out.print("Enter ReleaseNumber > 0: ");
        int releaseNumber = scanner.nextInt();
        System.out.print("Enter PageNumber > 0: ");
        int releaseMonth = scanner.nextInt();
        Magazine magazine = new Magazine(idMagazine, publishNameMagazine, releaseVolumeMagazine, releaseNumber, releaseMonth);
        bookManager.addNewDocument(magazine);
        System.out.println("ID: " + magazine.getId());
        System.out.println("PublishName: " + magazine.getPublishName());
        System.out.println("ReleaseVolume: " + magazine.getReleaseVolume());
        System.out.println("ReleaseNumber: " + magazine.getReleaseNumber());
        System.out.println("ReleaseMonth: " + magazine.getReleaseMonth());
    }

    private static void insertNewsPaper(BookManager bookManager, Scanner scanner) {
        System.out.print("Enter idNewsPaper: ");
        String idNewsPaper = scanner.nextLine();
        System.out.print("Enter publishNameNewsPaper:");
        String publishNameNewsPaper = scanner.nextLine();
        System.out.print("Enter releaseVolumeNewsPaper > 0: ");
        int releaseVolumeNewsPaper = scanner.nextInt();
        System.out.print("Enter releaseDay: ");
        String releaseDay = scanner.nextLine();
        NewsPaper newsPaper = new NewsPaper(idNewsPaper, publishNameNewsPaper, releaseVolumeNewsPaper, releaseDay);
        bookManager.addNewDocument(newsPaper);
        System.out.println("ID: " + newsPaper.getId());
        System.out.println("PublishName: " + newsPaper.getPublishName());
        System.out.println("ReleaseVolume: " + newsPaper.getReleaseVolume());
        System.out.println("ReleaseDay: " + newsPaper.getReleaseDay());
    }

    private static void searchDocumentById(BookManager bookManager, Scanner scanner) {
        System.out.println("Enter d: to search Book");
        System.out.println("Enter e: to search Magazine");
        System.out.println("Enter f: to search NewsPaper");
        String typeDoc = scanner.nextLine();
        switch (typeDoc) {
            case "d": {
                bookManager.searchByBook();
                break;
            }
            case "e": {
                bookManager.searchByMagazine();
                break;
            }
            case "f": {
                bookManager.searchByNewspaper();
                break;
            }
        }
    }

    private static void deleteDocument(BookManager bookManager, Scanner scanner) {
        System.out.print("Enter ID to delete: ");
        String id = scanner.nextLine();
        bookManager.deleteDocument(id);
    }
}
