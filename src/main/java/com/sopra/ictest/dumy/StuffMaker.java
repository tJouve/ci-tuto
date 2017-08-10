package com.sopra.ictest.dumy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by tjouve on 09/08/2017..
 * Classe qui fait des trucs
 */
@Slf4j
@Service("stuffMaker")
public class StuffMaker {

    void go(){
        doStuff1();
        doStuff2();
        doStuff3();
        doStuff4();
        doStuff5();
        doStuff6();

    }

    private int doStuff(int number) {
        log.error("My Stuff {} return {}",number,number);
        return number;
    }
    int doStuff1(){
        return doStuff(1);
    }

    int doStuff2(){
        return doStuff(2);
    }
    int doStuff3(){
        return doStuff(3);
    }
    int doStuff4(){
        return doStuff(4);
    }
    int doStuff5(){
        return doStuff(5);
    }
    int doStuff6(){
        return doStuff(6);
    }
    int doStuff7(){
        return doStuff(456);
    }
}
