public class Main {
    public static void main(String[] args) {
        Formdate date = new Formdate();
        date.day = 29;
        date.month = 3;
        date.year = 1900;

        Post post = new Post();
        post.name = "Ivan";
        post.passport = "9999111111";
        post.patronymic = "Ivanovich";
        post.surname = "Ivanov";
        post.phone = "1111111111";
        post.birthday = date;
        post.subscription = true;
    }
}
