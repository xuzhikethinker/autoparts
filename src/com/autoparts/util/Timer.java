package com.autoparts.util;

import java.io.Serializable;

public class Timer implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long startTime = null;
    private Long lapTime = null;
    private Long stopTime = null;

    public Timer()
    {}

    public static Timer getTimer()
    {
        return new Timer();
    }

    public void start()
    {
        if (this.startTime != null)
        {
            throw new IllegalStateException("Must reset Timer before starting again");
        }
        this.startTime = System.currentTimeMillis();
        this.lapTime = this.startTime;
    }

    public void stop()
    {
        this.stopTime = System.currentTimeMillis();
    }

    public void lap()
    {
        if (this.startTime == null)
        {
            throw new IllegalStateException("Timer must be started before lapping.");
        }
        this.lapTime = this.getFinalTime();
    }

    public void reset()
    {
        this.stopTime = null;
        this.startTime = null;
        this.lapTime = null;
    }

    public long getElapsedMilliseconds()
    {
        if (this.startTime != null)
        {
            return this.getFinalTime() - this.startTime;
        }
        return 0;
    }

    public long getLapMilliseconds()
    {
        if (this.lapTime != null)
        {
            return this.getFinalTime() - this.lapTime;
        }
        return 0;
    }

    private long getFinalTime()
    {
        if (this.stopTime != null)
        {
            return this.stopTime;
        }
        return System.currentTimeMillis();
    }
}

