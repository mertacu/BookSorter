import java.util.Comparator;

public class Books implements Comparable<Books> {
    private String name;
    private int pageNumb;
    private String author;
    private String published;

    public Books(String name, int pageNumb, String author, String published) {
        this.name = name;
        this.pageNumb = pageNumb;
        this.author = author;
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumb() {
        return pageNumb;
    }

    public void setPageNumb(int pageNumb) {
        this.pageNumb = pageNumb;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public int compareTo(Books x) {
        return this.name.compareTo(x.name);
    }

    @Override
    public String toString() {
        return String.format(name, pageNumb, author, published);
    }
}
