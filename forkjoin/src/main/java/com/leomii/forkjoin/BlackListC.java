package com.leomii.forkjoin;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

/**
 * @author ronglei
 */
public class BlackListC implements Callable {

    @Override
    public Boolean call() {
        System.out.println("BlackListC.call" + LocalDateTime.now());
        return true;
    }
}
