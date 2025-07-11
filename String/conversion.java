public class conversion {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == ' ' && i < str.length() - 1) {
                sb.append(current);
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(current);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello, i am harshika";
        System.out.println(toUpperCase(str));
    }
}
