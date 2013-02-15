package se.diversify.webroti.rest.vo;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author dvalfrid
 * @version 1.0
 */
public class MeetingTest {
    @Test
    public void testGetAverage() throws Exception {
        Meeting meeting = Meeting.getBuilder().id("10").add(new Vote(1.0)).add(new Vote(3.0)).build();
        Assert.assertEquals(2.0, meeting.getAverage());
    }
}
