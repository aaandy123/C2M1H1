import java.util.ArrayList;

public class MatchmakingSystem {
    private ArrayList<Individual> Individuals = new ArrayList<>();
    private MatchmakingStrategy matchmakingStrategy;
    private boolean reverse;

    public MatchmakingSystem(Individual individual1, Individual individual2, Individual individual3, Individual individual4, MatchmakingStrategy matchmakingStrategy, boolean reverse) {
        this.Individuals.add(individual1);
        this.Individuals.add(individual2);
        this.Individuals.add(individual3);
        this.Individuals.add(individual4);
        this.matchmakingStrategy = matchmakingStrategy;
        this.reverse = reverse;
    }

    public void start(){
        if(reverse == true){
                matchmakingStrategy.reverseMatchMaking(Individuals);
        } else {
                matchmakingStrategy.MatchMaking(Individuals);
        }
    }
}