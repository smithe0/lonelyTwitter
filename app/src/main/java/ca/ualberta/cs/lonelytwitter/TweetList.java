package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by egsmith on 9/30/15.
 */
public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) throws IllegalArgumentException{
        if(hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);
    }

    public int getCount(){
        return tweets.size();
    }
}
