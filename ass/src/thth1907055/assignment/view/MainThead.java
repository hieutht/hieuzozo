package thth1907055.assignment.view;

import thth1907055.assignment.controller.ArticleControrllerlement;
import thth1907055.assignment.entity.Article;

import java.util.Scanner;

public class MainThead {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null ;
        Boolean exit = false;
        ArticleControrllerlement blog = new ArticleControrllerlement();
        Article test = new Article();
        int check = test.getPostId();
        showMenu();

        while (true){
            choose = scanner.nextLine();
            //________________________
            switch (choose){
                case "1":
                    try {
                        blog.add();
                    } catch ( java.util.InputMismatchException e){
                        System.out.println("Đây là kiểu dữ liệu INT vui lòng nhập đúng !!!" );
                        System.exit(1);
                    }
                    break;
                case "2":
                    blog.showList();
                    break;
                case "3":
                    System.out.println("Dã thoát chương trình !!!");
                    exit = true;
                    break;
                default:
                    System.out.println("Vui lòng chọn các lựa chọn đúng để chưng trình chạy");
            }
            if (exit){
                break;
            }
            showMenu();
        }
    }
    //menu
    public static void showMenu(){
        System.out.println("____________________________MENU____________________________");
        System.out.println("|               1.Thêm mới bài viết .                      |");
        System.out.println("|               2.Hiển thị danh sách vừa nhập .            |");
        System.out.println("|               3.Thoát chương trình .                     |");
        System.out.println("|__________________________________________________________|");
        System.out.printf("Vui lòng lựa chọn : ");
    }
}
