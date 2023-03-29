public class Gryffindor extends Hogwarts {
    private final int nobility;//благородство шкала от 0 до 100
    private final int honor;//честь шкала от 0 до 100
    private final int bravery;//храбрость шкала от 0 до 100

    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    // считаем сумму навыков студента
    private int sumOfSkillsGryffindor() {
        return this.getNobility() + this.getHonor() + this.getBravery();
    }

    //сравниваем студентов, у кого больше общее число навыков тот и будет самым лучшим)))
    public void compareSkillsGryffindor(Gryffindor student) {
        if (this.sumOfSkillsGryffindor() > student.sumOfSkillsGryffindor()) {
            System.out.println(this.getName() + ", лучший Гриффиндорец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + ", лучший Гриффиндорец, чем " + this.getName());
        }
    }
}
