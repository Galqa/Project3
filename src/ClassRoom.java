/* Cтворіть проект. Потрібно:
 Створити клас, який представляє навчальний клас ClassRoom.
 Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
 Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня.
 Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
 Передбачте можливість, що користувач може передати 2 або 3 аргументи.
 Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
*/

class Pupil {
    void study() {
        System.out.println("Учень вчиться");
    }

    void read() {
        System.out.println("Учень читає");
    }

    void write() {
        System.out.println("Учень пише");
    }

    void relax() {
        System.out.println("Учень відпочиває");
    }
}
// Успадкування від класу Pupil
class ExcelentPupil extends Pupil {
    void study() {
        System.out.println("Відмінник вчиться відмінно");
    }

    void read() {
        System.out.println("Відмінник читає відмінно");
    }

    void write() {
        System.out.println("Відмінник пише відмінно");
    }

    void relax() {
        System.out.println("Відмінник спокійно відпочиває");
    }
}

class GoodPupil extends Pupil {
    void study() {
        System.out.println("Добрий учень вчиться нормально");
    }
}

class BadPupil extends Pupil {
    void relax() {
        System.out.println("Поганий учень багато відпочиває");
    }
}

class ClassRoom {
    Pupil pupil1, pupil2, pupil3, pupil4;

    ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = new Pupil();
    }

    void show() {
        System.out.println("Перший учень:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();

        System.out.println("\nДругий учень:");
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();

        System.out.println("\nТретій учень:");
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();

        System.out.println("\nЧетвертий учень:");
        pupil4.study();
        pupil4.read();
        pupil4.write();
        pupil4.relax();
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new ExcelentPupil(), new GoodPupil(), new BadPupil());
        classRoom.show();

    }
}