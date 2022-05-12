package pers.sereins.design.behavior.state;

// 抽象状态类(状态的行为,已经状态的转换)
public abstract class AbstractState {
    public Context context;

    protected int score;

    protected String stateName;

    public abstract void checkState();

    // 新增分数
    public void addScore(int x) {
        this.score += x;

        System.out.print("加上:" + x + "分\t当前分数" + this.score);

        checkState();

        System.out.println("分\t当前的状态:" + context.getState().getStateName());
    }

    public String getStateName() {
        return stateName;
    }
}
