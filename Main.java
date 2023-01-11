public class Main{
    public static void main(String[] args) {
        HttpURLContentGetter getter = new HttpURLContentGetter("https://www.wikipedia.org/");
        getter.printFirstTenLines();
    }
}