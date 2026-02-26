package browser;

import java.util.*;

public class BrowserHistory {

    Stack<Page> backStack = new Stack<>();

    Stack<Page> forwardStack = new Stack<>();

    Queue<Page> historyQueue = new LinkedList<>();

    Deque<Page> recentDeque = new ArrayDeque<>();
    
    List<Page> historyList = new ArrayList<>();

    Page currentPage = null;

    public void visit(String url)
    {

        Page newPage = new Page(url);

        if(currentPage != null)
        {
            backStack.push(currentPage);
        }

        currentPage = newPage;

        forwardStack.clear();

        historyQueue.add(newPage);

        recentDeque.addFirst(newPage);
        
        historyList.add(newPage);

        System.out.println("Visited: " + url);

    }

    public void back()
    {

        if(!backStack.isEmpty())
        {

            forwardStack.push(currentPage);

            currentPage = backStack.pop();

            System.out.println("Back to: " + currentPage);

        }

        else
        {
            System.out.println("No back page");
        }

    }

    public void forward()
    {

        if(!forwardStack.isEmpty())
        {

            backStack.push(currentPage);

            currentPage = forwardStack.pop();

            System.out.println("Forward to: " + currentPage);

        }

        else
        {
            System.out.println("No forward page");
        }

    }

    public void showHistory()
    {

        System.out.println("Full History:");

        for(Page p : historyQueue)
        {
            System.out.println(p);
        }

    }

    public void showRecent()
    {

        System.out.println("Recent History:");

        for(Page p : recentDeque)
        {
            System.out.println(p);
        }

    }
    
    public void showList()
    {

        System.out.println("History using List:");

        for(Page p : historyList)
        {
            System.out.println(p);
        }

    }

}