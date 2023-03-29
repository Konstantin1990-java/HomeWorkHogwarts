public class Slytherin extends Hogwarts {
    private final int cunning; // хитрость шкала от 0 до 100
    private final int determination; // решительность шкала от 0 до 100
    private final int ambition; // амбициозность шкала от 0 до 100
    private final int resourcefulness; // находчивость шкала от 0 до 100
    private final int lustForPower; // жажда власти шкала от 0 до 100

    public Slytherin(String name, int witchcraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
    // считаем сумму навыков студента
    private int sumOfSkillsSlytherin() {
        return this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness()+ this.getLustForPower();
    }
    //сравниваем студентов, у кого больше общее число навыков тот и будет самым лучшим)))
    public void compareSkillsSlytherin(Slytherin student) {
        if (this.sumOfSkillsSlytherin() > student.sumOfSkillsSlytherin()) {
            System.out.println(this.getName() + ", лучший Слизеринец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + ", лучший Слизеринец, чем " + this.getName());
        }
    }
}

