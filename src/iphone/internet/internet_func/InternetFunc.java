package iphone.internet.internet_func;

import iphone.internet.Browser;

public class InternetFunc implements Browser {
    @Override
    public String displayPage (String url) {
        System.out.println (url);
        return url;
    }

    @Override
    public void newTab () {
        System.out.println ("Adding new tab");
    }

    @Override
    public void reloadPage () {
        System.out.println ("Reloading page");
    }
}
