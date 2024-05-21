public class Programming {

        String author;
        float version;
        Programming()
        {

        }
        Programming(String author, float version)
        {
            this.author=author;
            this.version=version;
        }

    public static void main(String[] args) {
        Programming p1 = new Programming();
        System.out.println(p1.author);
        Programming p2 = new Programming("a1", 1.0f);
        System.out.println(p2.author + p2.version);
    }
}
