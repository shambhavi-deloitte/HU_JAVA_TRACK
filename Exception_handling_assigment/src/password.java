package Exception_handling_assigment.src;

class password {

    public static void isValid(String password)
            throws password
    {

        if (!((password.length() >= 5)
                && (password.length() <= 10))) {
            throw new password(1);
        }

        // to check space
        if (password.contains(" ")) {
            throw new PasswordCreation(2);
        }
        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PasswordCreation(3);
            }
        }

        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            throw new PasswordCreation(4);
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PasswordCreation(5);
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PasswordCreation(6);
            }
        }
    }
    public static void main(String[] args)
    {

        String password1 = "hashedlnbydeloitte";

        try {
            System.out.println("Is Password "
                    + password1 + " valid?");
            isValid(password1);
            System.out.println("Valid Password");
        }
        catch (PasswordCreation e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

        String password2 = "Hash0210@BYD";
        try {
            System.out.println("\nIs Password "
                    + password2 + " valid?");
            isValid(password2);
            System.out.println("Valid Password");
        }
        catch (PasswordCreation e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}