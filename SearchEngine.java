import java.io.IOException;
import java.net.URI;
import java.util.*;

class SearchEngine implements URLHandler{
    public String handleRequest(URI url) {
        ArrayList<String> arr = new ArrayList<>();
        if (url.getPath().contains("/add")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                arr.add(parameters[1]);
                return String.format("New string is %s", parameters[1]);
            }
        }
        // if (url.getPath().equals("/search")) {
        //     //search implementation
        //     return String.format("Dylan's Number: %d", num);
        // } else if (url.getPath().equals("/increment")) {
            
        //     return String.format("Number incremented!");
        // } else {
        //     System.out.println("Path: " + url.getPath());
        //     if (url.getPath().contains("/add")) {
        //         String[] parameters = url.getQuery().split("=");
        //         if (parameters[0].equals("count")) {
        //             num += Integer.parseInt(parameters[1]);
        //             return String.format("Number increased by %s! It's now %d", parameters[1], num);
        //         }
        //     }
        //     return "404 Not Found!";
        // }
    }
}