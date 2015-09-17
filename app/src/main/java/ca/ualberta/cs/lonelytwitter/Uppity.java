package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by egsmith on 9/16/15.
 */
public class Uppity extends Mood {
    public Uppity(){
        super();
        this.expression = new String("*Smugface*");
    }

    public Uppity(Date d){
        super(d);
    }

    @Override
    public String getExpression() {
        return this.expression;
    }

    @Override
    public void setExpression(String s) {

    }
}