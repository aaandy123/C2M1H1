import java.util.ArrayList;

public class DistanceBased implements MatchmakingStrategy {
    @Override
    public void MatchMaking(ArrayList<Individual> Individuals) {
        System.out.println("此為DistanceBased配對策略");
        int count;
        int total = 0;
        int maxNum = 0;
        for(int i = 0; i < Individuals.size(); i++){
            for(int j = (Individuals.size()-1); j >= 0; j--){
                count = 0;
                if(i == j){continue;}
                for(int k = 0; k < Individuals.get(i).getHabits().size(); k++){
                    for(int l = 0; l < Individuals.get(i).getHabits().size(); l++){
                        if(Individuals.get(i).getHabits().get(k) == Individuals.get(j).getHabits().get(l)){
                            count++;
                        }
                    }
                }
                if(count >= total){
                    total = count;
                    maxNum = j;
                }
            }
            System.out.println("用戶"+Individuals.get(i).getID()+"號適合的對象為: 用戶"+Individuals.get(maxNum).getID()+"號");
        }
    }

    @Override
    public void reverseMatchMaking(ArrayList<Individual> Individuals) {
        System.out.println("此為reverseDistanceBased配對策略");
        int count;
        int total = 0;
        int minNum = 0;
        for(int i = 0; i < Individuals.size(); i++){
            for(int j = (Individuals.size()-1); j >= 0; j--){
                count = 0;
                if(i == j){continue;}
                for(int k = 0; k < Individuals.get(i).getHabits().size(); k++){
                    for(int l = 0; l < Individuals.get(i).getHabits().size(); l++){
                        if(Individuals.get(i).getHabits().get(k) != Individuals.get(j).getHabits().get(l)){
                            count++;
                        }
                    }
                }
                if(count >= total){
                    total = count;
                    minNum = j;
                }
            }
            System.out.println("用戶"+Individuals.get(i).getID()+"號適合的對象為: 用戶"+Individuals.get(minNum).getID()+"號");
        }
    }
}