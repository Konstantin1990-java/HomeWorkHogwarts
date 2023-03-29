public class Hufflepuff extends Hogwarts {
    private final int industriousness; // трудолюбие шкала от 0 до 100
    private final int loyalty; // верность шкала от 0 до 100
    private final int honesty; // честность шкала от 0 до 100


    public Hufflepuff(String name, int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
    // считаем сумму навыков студента
    private int sumOfSkillsHufflepuff() {
        return this.getIndustriousness() + this.getLoyalty() + this.getHonesty();
    }
    //сравниваем студентов, у кого больше общее число навыков тот и будет самым лучшим)))
    public void compareSkillsHufflepuff(Hufflepuff student) {
        if (this.sumOfSkillsHufflepuff() > student.sumOfSkillsHufflepuff()) {
            System.out.println(this.getName() + ", лучший Пуффендуец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + ", лучший Пуффендуец, чем " + this.getName());
        }
    }
}

