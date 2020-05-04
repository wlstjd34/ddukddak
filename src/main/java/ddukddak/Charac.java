package ddukddak;

public class Charac {
    private int level;
    private int seq;
    private int target;

    public Charac(int initlevel, int targetLevel) {
        level = initlevel;
        seq = 0;
        target = targetLevel;
    }

    public void up(int u) {
        level += u;
        seq++;
    }

    public boolean isEnd() {
        if (level < target) {
            return false;
        }
        else return true;
    }

    public int getSeq() {
        return seq;
    }

    public int getCurrentLev() {
        return level;
    }
}