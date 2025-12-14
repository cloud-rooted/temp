public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.replace(0, 4, "Core");
        sb.reverse();

        System.out.println(sb);
    }
}
