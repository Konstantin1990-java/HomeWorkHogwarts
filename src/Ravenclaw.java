public class Ravenclaw extends Hogwarts {
    private final int intelligence; // ум шкала от 0 до 100
    private final int wisdom; // мудрость шкала от 0 до 100
    private final int wit; // остроумие шкала от 0 до 100
    private final int creativity; // творчество шкала от 0 до 100


    public Ravenclaw(String name, int witchcraft, int transgress, int intelligence, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
    // считаем сумму навыков студента
    private int sumOfSkillsRavenclaw() {
        return this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreativity();
    }
    //сравниваем студентов, у кого больше общее число навыков тот и будет самым лучшим)))
    public void compareSkillsRavenclaw(Ravenclaw student) {
        if (this.sumOfSkillsRavenclaw() > student.sumOfSkillsRavenclaw()) {
            System.out.println(this.getName() + ", лучший Когтевранец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + ", лучший Когтевранец, чем " + this.getName());
        }
    }
}

