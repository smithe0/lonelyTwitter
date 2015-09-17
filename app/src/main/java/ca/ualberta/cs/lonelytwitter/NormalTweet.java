package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by egsmith on 9/16/15.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String t, Date d) {
        super(t, d);
    }

    public NormalTweet(String t) {
        super(t);
    }

    public boolean isImportant(){
        return Boolean.FALSE;
    }
}
