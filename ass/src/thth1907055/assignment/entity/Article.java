package thth1907055.assignment.entity;

public class Article {
    private int postId;
    private String postTitle;
    private String postDesc;
    private String postAvatar;
    private String postContent;
    private String postAuthor;
    private String postCreatedDate;

    //____________________________________


    public Article(int postId, String postTitle, String postDesc, String postAvatar, String postContent, String postAuthor, String postCreatedDate) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.postDesc = postDesc;
        this.postAvatar = postAvatar;
        this.postContent = postContent;
        this.postAuthor = postAuthor;
        this.postCreatedDate = postCreatedDate;
    }

    public Article() {

    }

    //_____________________________________________
    public int getPostId() {
        return postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public String getPostAvatar() {
        return postAvatar;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    //_____________________________________________________________
    public String getPostCreatedDate() {
        return postCreatedDate;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public void setPostAvatar(String postAvatar) {
        this.postAvatar = postAvatar;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public void setPostCreatedDate(String postCreatedDate) {
        this.postCreatedDate = postCreatedDate;
    }
}
