package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class UrlMain {


    public static String getParam(Url url, String paramName, String stringUrl){
        return url.getParam(paramName, stringUrl);
    }

    public static void main(String[] args) {
        String url = "url_example?param1=99&param2=string";
        String urlExtended = "url_example/param1.55/param2.byte";

//        getParam(new StandardUrl(), "param1", url);
//        getParam(new ExtendedUrl(), "param1", url);

        Url standardUrl = new StandardUrl();
        String param1 = standardUrl.getParam("param1", url);
        System.out.println(param1);

        Url extendedUrl = new ExtendedUrl();
        String param11 = extendedUrl.getParam("param1", urlExtended);
        System.out.println(param11);

        String[] strings = new String[3];
        strings[0] = "asdas";
        strings[1] = "asdas";


            }
}
