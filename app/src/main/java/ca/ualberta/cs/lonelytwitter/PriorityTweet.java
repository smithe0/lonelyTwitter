package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by egsmith on 9/16/15.
 */
public class PriorityTweet extends Tweet{

    public PriorityTweet(String t, Date d) {
        super(t, d);
    }

    public PriorityTweet(String t) {
        super(t);
    }

    public boolean isImporant() {
        return Boolean.TRUE;
    }

    @Override
    public String getText() {
        return "!!!!" + super.getText() + "!!!!";
    }
}
