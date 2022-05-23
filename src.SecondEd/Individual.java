import java.util.ArrayList;

public class Individual {
    private int ID;
    private int age;
    private int coordOfX;
    private int coordOfY;
    private String gender;
    private String intro;
    private ArrayList<String> habits = new ArrayList<>();

    public Individual(int ID, int age, int coordOfX, int coordOfY, String gender, String intro, String habits1, String habits2, String habits3) {
        this.ID = ID;
        this.age = age;
        this.coordOfX = coordOfX;
        this.coordOfY = coordOfY;
        this.gender = gender;
        this.intro = intro;
        this.habits.add(habits1);
        this.habits.add(habits2);
        this.habits.add(habits3);
    }

    public ArrayList<String> getHabits() {
        return habits;
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