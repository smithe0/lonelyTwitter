package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by egsmith on 9/16/15.
 */

public abstract class Tweet implements Tweetable {

    public static final int MAX_CHAR = 140;

    public Tweet(String t, Date d) {
        try {
            this.setText(t);
        } catch (TweetTooLongException e){
            throw new TweetTooLongException();
        }
        this.date = d;
    }

    public Tweet(String t) {
        try {
            this.setText(t);
        } catch (TweetTooLongException e) {
        }
        this.date = new Date();
    }

    private String text;
    private Date date;


    public String getText() {
        return this.text;
    }

    public void setText(String t) throws TweetTooLongException{
        if (text.length() <= MAX_CHAR) {
            this.text = t;
        } else {
            throw new TweetTooLongException();
        }
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public Date getDate() {
        return this.date;
    }

    public void updateDate() {
        date = new Date();
    }
}
