public class Individual {
    private int ID;
    private int age;
    private int coordOfX;
    private int coordOfY;
    private String gender;
    private String habits;
    private String intro;

    public Individual(int ID, int age, int coordOfX, int coordOfY, String gender, String habits, String intro) {
        this.ID = ID;
        this.age = age;
        this.coordOfX = coordOfX;
        this.coordOfY = coordOfY;
        this.gender = gender;
        this.habits = habits;
        this.intro = intro;
    }

    public int getID() {
        return ID;
    }

    public int getCoordOfX() {
        return coordOfX;
    }

    public int getCoordOfY() {
        return coordOfY;
    }
}