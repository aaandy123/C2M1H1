public class Main {

    public static void main(String[] args) {

        Individual individual1 = new Individual(1, 20, 5, 5, "MALE", "program", "hi");
        Individual individual2 = new Individual(2, 30, 6, 7, "FEMALE", "program", "hello");
        Individual individual3 = new Individual(3, 25, 7, 10, "MAMALE", "program", "bello");
        Individual individual4 = new Individual(4, 27, 12, 15, "FEMALE", "program", "pello");

        MatchmakingSystem matchmakingSystem = new MatchmakingSystem(individual1, individual2, individual3, individual4);
        matchmakingSystem.start();

    }
}
