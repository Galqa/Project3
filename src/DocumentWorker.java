import java.util.Scanner;

/**
 * Cтворіть проект. Потрібно: Створити клас DocumentWorker.
 * У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
 * У тілі кожного з методів додайте виведення на екран відповідних рядків:
 * "Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа доступне у версії Про".
 * Створіть похідний клас ProDocumentWorker.
 * Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки:
 * "Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт".
 * Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker.
 * Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран документ збережений в новому форматі.
 * У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp.
 * Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу),
 * якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
 */

public class DocumentWorker {
    // створення методів
    public void openDocument() {
        System.out.println("Документ відкритий");
    }

    public void editDocument() {
        System.out.println("Правка документа доступна у версії Про");
    }

    public void saveDocument() {
        System.out.println("Збереження документа доступне у версії Про");
    }

}


// створення похідних класів
class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument() {
        super.editDocument();
        System.out.println("Документ відредаговано");
    }

    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
}

class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        super.saveDocument();
        System.out.println("Документ збережений в новому форматі");
    }
}

// вводимо дані з консолі
class NewDocumentWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер ключа доступу користувача: ");
        String key = scanner.nextLine();
        DocumentWorker worker = switch (key) {
            case "pro" -> new ProDocumentWorker();
            case "exp" -> new ExpertDocumentWorker();
            default -> new DocumentWorker();
        };
        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();
    }
}