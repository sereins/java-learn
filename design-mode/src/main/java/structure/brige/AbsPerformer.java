package structure.brige;

public abstract class AbsPerformer {
    protected IPlayType iPlayType;
    AbsPerformer(IPlayType iPlayType){
        this.iPlayType = iPlayType;
    }

   protected abstract void preform();
}
