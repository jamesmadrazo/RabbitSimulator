package com.sparta.engineering50;
import java.util.Timer;
import java.util.TimerTask;
public class TimeSimulator {
    static int count = 0;
    public void initialiseTimeSimulator(int seconds) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                for(Rabbit rabbit: Field.getRabbits()) {
                    rabbit.increaseAge();
                    Field.addRabbits(rabbit.giveBirth());
                }
                Field.breed();
                System.out.println(1);
                if (count >= seconds) {
                    timer.cancel();
                    timer.purge();
                    return;
                }
            };
        };
        timer.scheduleAtFixedRate(timerTask,0,1000);
    }
    public int getCount() {
        return count;
    }
}