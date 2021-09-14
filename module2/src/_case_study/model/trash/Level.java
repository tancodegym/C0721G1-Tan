package _case_study.model.trash;

public class Level {
    private String level;

    public Level() {
    }

    public Level(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Level{" +
                "level='" + level + '\'' +
                '}';
    }
}
