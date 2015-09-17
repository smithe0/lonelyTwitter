package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by egsmith on 9/16/15.
 */
public abstract class Mood {
    protected String expression;
    private Date date;

    protected Mood() {
        this.date = new Date();
    }

    protected Mood(Date d){
        this.date = d;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public abstract String getExpression();
    public abstract void setExpression(String s);
}
