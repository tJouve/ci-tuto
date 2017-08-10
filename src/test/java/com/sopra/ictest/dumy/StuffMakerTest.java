package com.sopra.ictest.dumy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tjouve on 09/08/2017.
 * Classe qui test des trucs
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StuffMakerTest {
    @Autowired
    private StuffMaker sm;

    @Test
    public void doStuff1() throws Exception {
        Assert.assertEquals(1,sm.doStuff1());
    }

    @Test
    public void doStuff2() throws Exception {
        Assert.assertEquals(2,sm.doStuff2());
    }

    @Test
    public void doStuff3() throws Exception {
        Assert.assertEquals(3,sm.doStuff3());
    }

    @Test
    public void doStuff4() throws Exception {
        Assert.assertEquals(4,sm.doStuff4());
    }

    @Test
    public void doStuff5() throws Exception {
        Assert.assertEquals(5,sm.doStuff5());
    }

    @Test
    public void doStuff6() throws Exception {
        Assert.assertEquals(6,sm.doStuff6());
    }

    @Test
    public void doStuff7() throws Exception {
        Assert.assertEquals(7,sm.doStuff7());
    }

}