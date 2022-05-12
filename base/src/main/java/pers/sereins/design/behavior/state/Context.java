package pers.sereins.design.behavior.state;

public class Context {

    private AbstractState state;

    public Context() {
        this.state = new LowState(this);
    }

    public void setState(AbstractState state){
        this.state = state;
    }

    // 获取当前的状态
    public AbstractState getState(){
        return  state;
    }


    public void add(int score) {
        state.addScore(score);
    }
}
