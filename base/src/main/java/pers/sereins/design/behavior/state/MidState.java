package pers.sereins.design.behavior.state;

public class MidState extends AbstractState {
    public MidState(AbstractState state) {
        context = state.context;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score < 60) {
            context.setState(new LowState(this));
        } else if (score >= 90) {
            context.setState(new HighState(this));
        }
    }
}
