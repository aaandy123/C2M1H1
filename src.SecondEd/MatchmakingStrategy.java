import java.util.ArrayList;

public interface MatchmakingStrategy {
    void MatchMaking(ArrayList<Individual> Individuals);
    void reverseMatchMaking(ArrayList<Individual> Individuals);
}