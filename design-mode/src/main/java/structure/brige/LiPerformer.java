package structure.brige;

public class LiPerformer extends AbsPerformer {
    public LiPerformer(IPlayType iPlayType) {
        super(iPlayType);
    }
    @Override
    public void preform() {
        System.out.println("li li" + iPlayType.play());
    }
}
