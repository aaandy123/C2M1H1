import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchmakingSystem {
    Scanner scanner = new Scanner(System.in);
    private List<Individual> Individuals = new ArrayList<>();

    public MatchmakingSystem(Individual individual1, Individual individual2, Individual individual3, Individual individual4) {
        this.Individuals.add(individual1);
        this.Individuals.add(individual2);
        this.Individuals.add(individual3);
        this.Individuals.add(individual4);
    }

    public void start(){
        System.out.println("請選擇配對策略:");
        System.out.println("(1)距離先決：配對與自己距離最近的對象");
        System.out.println("(2)興趣先決：配對與自己興趣擁有最大交集量的對象");
        System.out.println("(3)反向距離先決：配對與自己距離最遠的對象");
        System.out.println("(4)反向興趣先決：配對與自己興趣擁有最小交集量的對象");
        select();
    }

    public void select(){
        switch (scanner.nextInt()){
            case 1:{
                distanceBased();
                break;
            }
            case 2:{
                //habitBased();
                break;
            }
            case 3:{
                longDistanceBased();
                break;
            }
            case 4:{
                //differHabitBased();
                break;
            }
        }
    }

    public void distanceBased(){
        double mindistance = 0;
        int minNum = 0;
        for(int i = 0; i < Individuals.size(); i++){
            mindistance = 1000000000;
            for(int j = 0; j < Individuals.size(); j++){
                if(i == j){continue;}
                int x1 = Individuals.get(i).getCoordOfX();
                int y1 = Individuals.get(i).getCoordOfY();
                int x2 = Individuals.get(j).getCoordOfX();
                int y2 = Individuals.get(j).getCoordOfY();
                int total = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
                double sqrt = Math.sqrt(total);
                if(sqrt < mindistance){
                    mindistance = sqrt;
                    minNum = j;
                }
            }
            System.out.println("用戶"+Individuals.get(i).getID()+"號適合的對象為: 用戶"+(minNum+1)+"號");
        }
    }

    public void longDistanceBased(){
        double maxdistance = 0;
        int maxNum = 0;
        for(int i = 0; i < Individuals.size(); i++){
            maxdistance = 0;
            for(int j = 0; j < Individuals.size(); j++){
                if(i == j){continue;}
                int x1 = Individuals.get(i).getCoordOfX();
                int y1 = Individuals.get(i).getCoordOfY();
                int x2 = Individuals.get(j).getCoordOfX();
                int y2 = Individuals.get(j).getCoordOfY();
                int total = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
                double sqrt = Math.sqrt(total);
                if(sqrt > maxdistance){
                    maxdistance = sqrt;
                    maxNum = j;
                }
            }
            System.out.println("用戶"+Individuals.get(i).getID()+"號適合的對象為: 用戶"+(maxNum+1)+"號");
        }
    }

}