package browser;

public class Browser {

    public static void main(String args[])
    {

        BrowserHistory browser = new BrowserHistory();

        browser.visit("Google");

        browser.visit("YouTube");

        browser.visit("Facebook");

        browser.back();

        browser.forward();

        browser.showHistory();

        browser.showRecent();
        
        browser.showList();

    }

}