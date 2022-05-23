import java.util.ArrayList;

public class HabitBased implements MatchmakingStrategy {
    @Override
    public void MatchMaking(ArrayList<Individual> Individuals) {
        System.out.println("此為HabitBased配對策略");
        double mindistance;
        int minNum = 0;
        for(int i = 0; i < Individuals.size(); i++){
            mindistance = 1000000000;
            for(int j = (Individuals.size()-1); j >= 0; j--){
                if(i == j){continue;}
                int x1 = Individuals.get(i).getCoordOfX();
                int y1 = Individuals.get(i).getCoordOfY();
                int x2 = Individuals.get(j).getCoordOfX();
                int y2 = Individuals.get(j).getCoordOfY();
                int total = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
                double sqrt = Math.sqrt(total);
                if(sqrt <= mindistance){
                    mindistance = sqrt;
                    minNum = j;
                }
            }
            System.out.println("用戶"+Individuals.get(i).getID()+"號適合的對象為: 用戶"+Individuals.get(minNum).getID()+"號");
        }
    }

    @Override
    public void reverseMatchMaking(ArrayList<Individual> Individuals) {
        System.out.println("此為reverseHabitBased配對策略");
        double maxdistance;
        int maxNum = 0;
        for(int i = 0; i < Individuals.size(); i++){
            maxdistance = 0;
            for(int j = (Individuals.size()-1); j >= 0; j--){
                if(i == j){continue;}
                int x1 = Individuals.get(i).getCoordOfX();
                int y1 = Individuals.get(i).getCoordOfY();
                int x2 = Individuals.get(j).getCoordOfX();
                int y2 = Individuals.get(j).getCoordOfY();
                int total = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
                double sqrt = Math.sqrt(total);
                if(sqrt >= maxdistance){
                    maxdistance = sqrt;
                    maxNum = j;
                }
            }
            System.out.println("用戶"+Individuals.get(i).getID()+"號適合的對象為: 用戶"+Individuals.get(maxNum).getID()+"號");
        }
    }
}