package ddukddak;

import java.util.Random;

public class Simulator {
    private int initLevel, targetLevel;
	private double repeat;
    public Simulator(int init, int target, int repe) {
        this.initLevel = init;
        this.targetLevel= target;
        this.repeat = repe;
    }

    public Result run() throws Exception {
        int total = 0;
        Result result = new Result();
        for(int i = 1; i <= repeat; i++) {
            int ret = simulate();
            total += ret;
            result.addCase(ret);
        }
        result.setAverage(total / repeat);
        return result;
    }

    private int simulate() throws Exception {
        Charac one = new Charac(initLevel, targetLevel);
        while (!one.isEnd()) {
            Random rand = new Random();
            one.up(Engine.getDdukddak(one.getCurrentLev(), rand.nextInt(100)));
        }
        return one.getSeq();
    }
}
