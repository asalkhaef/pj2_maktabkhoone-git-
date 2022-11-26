import java.util.Arrays;
import java.util.Stack;

public class pj_1 {
    public static void main(String[] args) {

    }
    public static String normalize(String path) {
        //remove "/" in the path.................
        String[] arrPath = path.split("/+");
        Stack<String> save = new Stack<String>();

        for (String element : arrPath) {
            if (element.equals("..") && !save.isEmpty())
                save.pop();
            else if (!Arrays.asList(".", "", "/", "..").contains(element))
                save.push(element);
        }
        StringBuilder finalPath = new StringBuilder();
        return finalPath.toString();
    }
}

