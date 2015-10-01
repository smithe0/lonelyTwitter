package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.SimpleCursorTreeAdapter;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

/**
 * Created by egsmith on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {


    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Words, many words");
        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));

        // int newTweetCount = tweetList.getTweetCount();
        // int tweetCount = tweetList.getTweetCount();
    }

    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Words, many words");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Words, many words");
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
        try {
            tweetList.add(tweet);
            assertTrue(false);
        } catch(IllegalArgumentException e) {
            assertTrue(true);
        }

    }

    public void testGetCount() {
        TweetList tweetList = new TweetList();
        final int N = 53;
        int count = 0;
        for(int i=0;i<N;i++){
            tweetList.add(new NormalTweet("This is a tweet " + i));
        }
        count = tweetList.getCount();
        assertEquals(count,N);
    }

    public void testGetTweets() {
        TweetList tweetList = new TweetList();
        final int N = 53;
        int count = 0;
        for(int i=0;i<N;i++){
            tweetList.add(new NormalTweet("This is a tweet " + i, new Date(i)));
        }
        ArrayList<Tweet> tweet = tweetList.getTweets();

    }

    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Words, many words");
        tweetList.add(tweet);
        Tweet returnedTweet = tweetList.getTweet(0);
        assertTrue(tweet.equals(returnedTweet));
    }

    public void testGetTweetType() {

    }


}

