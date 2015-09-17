package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
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
            throw new RuntimeException(e);
        }
        this.date = d;
        this.tweetMoods = new ArrayList<Mood>();
    }

    public Tweet(String t) {
        try {
            this.setText(t);
        } catch (TweetTooLongException e) {
            throw new RuntimeException(e);
        }
        this.date = new Date();
        this.tweetMoods = new ArrayList<Mood>();
    }

    private String text;
    private Date date;
    private ArrayList<Mood> tweetMoods;

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

    public ArrayList<Mood> getTweetMoods() {
        return tweetMoods;
    }

    public void addMood(ArrayList<Mood> m) {
        this.tweetMoods.addAll(m);
    }

    public void addMood(Mood m) {
        this.tweetMoods.add(m);
    }
}
