package com.javarush.task.task25.task2506;

/**
 * Created by Mike on 30.05.2017.
 */
public class LoggingStateThread extends Thread {
     Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {

        State state = this.thread.getState();
        System.out.println(state);
        while (state != State.TERMINATED)
        {
            if (state != this.thread.getState())
            {
                state = this.thread.getState();
                System.out.println(state);
            }
        }

    }
}
