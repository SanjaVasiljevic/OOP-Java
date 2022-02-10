package VezbanjeOOPFacebookPostReakcije;

public class FacebookPostMain {
    public static void main(String[] args) {
        FacebookPost post = new FacebookPost("Milan Jovanovic","Hahahaha");
        post.reaguj("Milan","Smile");
        post.reaguj("Dragan","Like");
        post.reaguj("Nikola","Like");
        post.reaguj("Stefan","Hart");

        post.stampaj();

    }

}
