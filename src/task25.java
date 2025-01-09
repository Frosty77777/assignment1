public class task25 {
    public static void main(String[] args) {
        signIn("user");
        signIn("John");
    }

    public static void signIn(String username) {
        if ("user".equals(username)) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}

