public class Main {

    public static void main(String[] args) {

        Individual individual1 = new Individual(1, 20, 5, 5, "MALE", "hi", "programming", "hiking", "playingGames");
        Individual individual2 = new Individual(2, 30, 6, 7, "FEMALE", "hello", "playingGames", "music", "sleeping");
        Individual individual3 = new Individual(3, 25, 7, 10, "MAMALE", "bello", "programming", "hiking", "sleeping");
        Individual individual4 = new Individual(4, 27, 12, 15, "FEMALE", "hey", "programming", "hiking", "music");

        // "programming", "hiking", "playingGames", "music", "sleeping"

        //MatchmakingSystem matchmakingSystem = new MatchmakingSystem(individual1, individual2, individual3, individual4, new HabitBased(), true);
        MatchmakingSystem matchmakingSystem = new MatchmakingSystem(individual1, individual2, individual3, individual4, new DistanceBased(), false);
        matchmakingSystem.start();

    }
}