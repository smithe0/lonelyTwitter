package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by egsmith on 9/16/15.
 */
public class Happy extends Mood {
    public Happy(){
        super();
        this.expression = new String("Oh Hai! What a lovely day!");
    }

    public Happy(Date d){
        super(d);
    }

    @Override
    public String getExpression() {
        return this.expression;
    }

    @Override
    public void setExpression(String s) {
        this.expression = s;
    }
}
