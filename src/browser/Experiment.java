package browser;

public class Experiment {

    public static void main(String args[])
    {
    	BrowserHistory browser = new BrowserHistory();
    	int size = 10000;
        long start = System.nanoTime();
        for(int i=0;i<size;i++)
        {
            browser.visit("Page " + i);
        }
        long end = System.nanoTime();
        System.out.println("Total Time: " + (end-start));
    }
}