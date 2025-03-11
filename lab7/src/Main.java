public class Main {
    public static void main(String[] args) {
        // Тест бібліотеки
        Library myLibrary = new Library();
        myLibrary.addBook(new Book("1984", "George Orwell", "Dystopian", 1949));
        myLibrary.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1937));

        System.out.println("Книги жанру Fantasy:");
        for (Book book : myLibrary.searchByGenre("Fantasy")) {
            book.displayInfo();
        }

        // Тест студентської групи
        Group studentGroup = new Group();
        studentGroup.addStudent(new Student("Іван", "KP-11", 4.5));
        studentGroup.addStudent(new Student("Марія", "KP-11", 3.8));

        System.out.println("Студенти з високим балом:");
        for (Student student : studentGroup.findTopStudents(4.0)) {
            System.out.println(student.name);
        }

        // Тест аналітики сайту
        WebsiteAnalytics analytics = new WebsiteAnalytics();
        analytics.addVisitor(new Visitor("192.168.1.1", "Chrome", "12:00"));
        analytics.addVisitor(new Visitor("192.168.1.2", "Firefox", "12:05"));
        analytics.addVisitor(new Visitor("192.168.1.1", "Safari", "12:10"));

        System.out.println("Унікальні відвідувачі: " + analytics.getUniqueVisitorCount());
        System.out.println("Список IP: " + analytics.getAllUniqueIPs());
    }
}
