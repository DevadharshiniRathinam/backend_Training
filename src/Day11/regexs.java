package Day11;

public class regexs{
    public static void main(String[] args) {
        String[] emails = {
                "user@example.com",
                "user.name@domain.org",
                "invalid-email@domain",
                "user@domain_net",
                "@missinguser.com"
        };

        String emailRegex = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";

        for (String email : emails) {
            if (email.matches(emailRegex)) {
                System.out.println(email + ": Valid");
            } else {
                System.out.println(email + ": Invalid");
            }
        }
    }
}

