package thth1907055.assignment.controller;

import thth1907055.assignment.entity.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleControrllerlement implements ArticleContorller {
    Scanner scanner = new Scanner(System.in);
    private List<Article> blogList;
    public ArticleControrllerlement() {
        blogList = new ArrayList<>();
    }



    @Override
    public void add() {
        int blogID = (blogList.size() > 0 ? (blogList.size() + 1 ) : 1 );
        System.out.println("Blog ID : " + blogID );
        int postId = inputPostID();
        scanner.nextLine();
        String postTitle = inputTitle();
        String postDesc = inputDesc();
        String postAvatar = inputAvatar();
        String postContent = inputContent();
        String postAuthor = inputAuthor();
        String postCreatedDate = inputCreatedDate();
        Article blog = new Article(postId, postTitle, postDesc, postAvatar, postContent, postAuthor, postCreatedDate);
        blogList.add(blog);
        if (blog.getPostAuthor().length() == 0 || blog.getPostDesc().length() == 0 || blog.getPostAvatar().length() == 0 || blog.getPostContent().length() == 0 || blog.getPostCreatedDate().length() == 0 || blog.getPostContent().length() == 0 || blog.getPostTitle().length() == 0){
            System.out.println("Vui lòng nhập đủ để lưu danh sách");
            blogList.remove(blog);
        }
    }
    @Override
    public void check() {
        Article blog = new Article();
        blogList.remove(blog);
    }
    @Override
    public void showList() {
        if (blogList.size() == 0) {
            System.out.println("Vui lòng nhập để hiển thị chương trình");
        } else {
            System.out.println("|   Mã bài viết     |  Tiêu đề bài viết |       Mô tả        |   Ảnh đại diện   |  Nội dung chính  |   Tên tác giả    |       Ngày viết     |");
            for (Article blog : blogList) {
                System.out.format("|%-19d", blog.getPostId());
                System.out.format("|%-19s", blog.getPostTitle());
                System.out.format("|%-20s", blog.getPostDesc());
                System.out.format("|%-18s", blog.getPostAvatar());
                System.out.format("|%-18s", blog.getPostContent());
                System.out.format("|%-18s", blog.getPostAuthor());
                System.out.format("|%-21s|%n", blog.getPostCreatedDate());
            }
        }
    }

    private int inputPostID(){
        System.out.printf("Mời bạn nhập mã ID          : ");
        return scanner.nextInt();
    }

    private String inputTitle() {
        System.out.printf("Mời nhập tiêu đề bài viết   : ");;
        return scanner.nextLine();
    }

    private String inputDesc() {
        System.out.printf("Mời bạn nhập phần mô tả     : ");
        return scanner.nextLine();
    }

    private String inputAvatar() {
        System.out.printf("Mời bạn nhập ảnh đại diện   : ");
        return scanner.nextLine();
    }

    private String inputContent(){
        System.out.printf("Mời bạn nhập nội dung chính : ");
        return scanner.nextLine();
    }

    private String inputAuthor(){
        System.out.printf("Mời bạn nhập tên tác giả    : ");
        return scanner.nextLine();
    }

    private String inputCreatedDate(){
        System.out.printf("Mời bạn nhập ngày viết      : ");
        return scanner.nextLine();
    }
}
