public class Main {
    public static void main(String[] args) {
        Theater<Integer, Person> theater = new Theater<>(3, 16);

        // Добавляем клиентов, сотрудников и критиков в ряды
        theater.addPerson(1, new Client("Иван"));
        theater.addPerson(1, new Staff("Мария"));
        theater.addPerson(1, new Critic("Алексей"));

        theater.addPerson(2, new Client("Ольга"));
        theater.addPerson(2, new Staff("Анна"));
        theater.addPerson(2, new Critic("Сергей"));

        // Проверяем билеты (выводим всех людей в зале)
        theater.checkTickets();

        // Удаляем одного человека из первого ряда
        theater.removePerson(1, 1);

        // Повторная проверка билетов
        System.out.println("\nПосле удаления:");
        theater.checkTickets();
    }
}