import java.util.ArrayList;

public class WebCrawlerOne {
    private String topic;
    private String startingURL;
    private String urlLimiter;
    private final int PAGE_LIMIT = 20;
    private ArrayList<String> visitedList = new ArrayList<>();
    private ArrayList<String> pageList = new ArrayList<>();

    public WebCrawlerOne() {
        topic = "NewJeans"; // page must contain value stored in topic
        startingURL = "https://en.wikipedia.org/wiki/Ditto_(NewJeans_song)";
        urlLimiter = "NewJeans"; // link must contain value stored in limiter
        visitPage(startingURL);
    }

    public void visitPage(String url) {
        if(this.pageList.size() >= this.PAGE_LIMIT) return;

        if(visitedList.contains(url)) {

        }else {
            visitedList.add(url);
        }
    }
}
