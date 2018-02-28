import java.util.ArrayList;
import java.util.List;

public class Blog {

  //Reuse your BlogPost class
  //Create a Blog class which can
    // store a list of BlogPosts
    // add BlogPosts to the list
    // delete(int) one item at given index
    // update(int, BlogPost) one item at the given index and update it with another BlogPost

  List<BlogPost> blogPosts = new ArrayList<>();

  public void addBlogPost(BlogPost blogPost) {
    this.blogPosts.add(blogPost);
  }

  public void deleteBlogPost(int index) {
    this.blogPosts.remove(index);
  }

  public void updateBlogPost(int index, BlogPost blogPost) {
    this.blogPosts.set(index, blogPost);
  }

  public List<BlogPost> getBlogPosts() {
    return blogPosts;
  }

  @Override
  public String toString() {
    return "Blog{" +
            "blogPosts=" + blogPosts +
            '}';
  }
}
