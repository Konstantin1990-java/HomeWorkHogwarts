public class Hogwarts {
    private final String name; // имя ученика
    private final int witchcraft; // колдовать с мощностью в сколько-то баллов
    private final int transgress; // трансгрессировать на какое-то расстояние

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return "Имя - " + this.getName() + ", мощность колдовства - "
                + this.getWitchcraft() + ", трансгрессия - " + this.getTransgress();
    }
    //метод который сравнивает силу магии и дальность магии и выводит в консоль того, чья сила больше
    public void compareSkillsHogwarts(Hogwarts student) {
        if (this.witchcraft > student.witchcraft) {
            System.out.println(this.getName() + ", обладает большей силой магии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + ", обладает большей силой магии, чем " + this.getName());
        }
        if (this.transgress > student.transgress) {
            System.out.println(this.getName() + ", обладает большей дальностью магии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + ", обладает большей дальностью  магии, чем " + this.getName());
        }
    }
}
