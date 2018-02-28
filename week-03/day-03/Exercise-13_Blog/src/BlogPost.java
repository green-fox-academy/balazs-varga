public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String duplicationDate;

  public BlogPost(String authorName, String title, String text, String duplicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.duplicationDate = duplicationDate;
  }

  @Override
  public String toString() {
    return "BlogPost{" +
            "authorName='" + authorName + '\'' +
            ", title='" + title + '\'' +
            ", text='" + text + '\'' +
            ", duplicationDate='" + duplicationDate + '\'' +
            '}';
  }
}