import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class pj_1 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(normalize(input.next()));
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

        for(String option : save)
            finalPath.append("/").append(option);

        if(finalPath.length() == 0)
            return "/";
        else
            return finalPath.toString();
    }
}

