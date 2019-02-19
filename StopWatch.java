package chapter9;

import java.util.Date;

public class StopWatch {
    
    private long startTime;
    private long endTime;
    
    
    public long getStartTime(){
        return startTime;
    }
    
    public long getEndTime(){
        return endTime;
    }
    
    StopWatch(){
        startTime = System.currentTimeMillis();
    }
    
    public long start(){     
        startTime = System.currentTimeMillis();
        return startTime;
    }
    
    public long stop(){
        endTime = System.currentTimeMillis();
        return endTime;
    }
    
    public long getElapsedTime(long s, long e){
        startTime = s;
        endTime = e;        
        return (endTime - startTime);
    }
    
    
}
