public class UrlFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    url = url.replace("bots", "odds").replace("https", "https:");
    System.out.println(url);

    url = "https//www.reddit.com/r/nevertellmethebots";
    if (url.endsWith("bots" ) && url.startsWith("https")) {
      url = url.replace("bots", "odds").replace("https", "https:");
      System.out.println(url);
    }

    url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.substring(0, 5) + ":" + url.substring(5 , url.length() - 4) + "odds";
    System.out.println(url);
  }
}