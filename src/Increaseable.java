import javax.naming.LimitExceededException;

public interface Increaseable {
    void increaseCloacking(int value) throws LimitExceededException;
}
