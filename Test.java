
public class Test {

    public static void main(String[] args) {
        String str = "Bài tập Java - ngockhuong.com!";
        System.out.println("Chuỗi gốc: " + str);
        // Lấy ký tự tại vị trí thứ 0 và thứ 10 từ chuỗi kia
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // In kết quả
        System.out.println("Ký tự tại vị trí thứ 0: " + index1);
        System.out.println("Ký tự tại vị trí thứ 10: " + (char) index2);


    }
}
