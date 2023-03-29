public class Main {
    public static void main(String[] args) {
        // создаем студентов Гриффиндора
        Gryffindor[] gryffindors = {new Gryffindor("Гарри Поттер", 23, 33, 67, 12, 46),
                new Gryffindor("Гермиона Грейнджер", 54, 75, 12, 59, 13),
                new Gryffindor(" Рон Уизли", 65, 32, 90, 4, 7)};
        // создаем студентов Слизерина
        Slytherin[] slytherins = {new Slytherin("Драко Малфой", 14, 15, 88, 63, 25, 38, 44),
                new Slytherin("Грэхэм Монтегю", 74, 65, 8, 6, 75, 8, 31),
                new Slytherin("Грегори Гойл", 55, 63, 51, 3, 19, 77, 8)};
        // создаем студентов Пуффендуй
        Hufflepuff[] hufflepuff = {new Hufflepuff("Захария Смит", 10, 14, 55, 87, 69),
                new Hufflepuff("Седрик Диггори", 54, 19, 69, 13, 9),
                new Hufflepuff("Джастин Финч-Флетчли", 98, 4, 45, 7, 6)};
        //создаем студентов Когтевран
        Ravenclaw[] ravenclaw = {new Ravenclaw("Чжоу Чанг", 18, 58, 67, 42, 17, 74),
                new Ravenclaw("Падма Патил", 82, 57, 32, 2, 28, 33),
                new Ravenclaw("Маркус Белби", 39, 18, 7, 72, 7, 4)};
        System.out.println(gryffindors[1]);
        System.out.println("*************");
        System.out.println(hufflepuff[0]);
        System.out.println("*************");
        System.out.println(ravenclaw[2]);
        System.out.println("*************");
        System.out.println(slytherins[0]);
        System.out.println("*************");
        gryffindors[0].compareSkillsGryffindor(gryffindors[2]);
        System.out.println("*************");
        hufflepuff[0].compareSkillsHufflepuff(hufflepuff[2]);
        System.out.println("*************");
        ravenclaw[2].compareSkillsRavenclaw(ravenclaw[0]);
        System.out.println("*************");
        slytherins[0].compareSkillsSlytherin(slytherins[1]);
        System.out.println("*************");
        gryffindors[1].compareSkillsHogwarts(slytherins[0]);
        hufflepuff[1].compareSkillsHogwarts(ravenclaw[0]);
        slytherins[2].compareSkillsHogwarts(hufflepuff[2]);
    }
}