package x.y.utils;

import javax.servlet.http.Cookie;

public class CookieUtil {
    public static Cookie getCookieByName(Cookie[] cookies,String name){
        for (Cookie cookie:cookies){
            if (cookie.getName().equals(name)){
                return cookie;
            }
        }
        return null;
    }
}
