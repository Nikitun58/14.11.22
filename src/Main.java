public class Main {
    public static void main(String[] args) {
        // Задача №1-2-3
        System.out.println("Задача №1");
        String firstName = "Иван";
        String middleName = "Иванов";
        String lastName = "Иванович";
        String fullName = firstName+" "+ middleName+" "+ lastName;
        String fullNameUp = fullName.toUpperCase();
        String fullName2 = "Иванов Иван Иванович";
        fullName2 = fullName2.replace('ё', 'е');
        System.out.println("1 Задание: ФИО сотрудника — " + fullName + "\n2 Задание: Данные ФИО сотрудника для заполнения отчета — " + fullNameUp + "\n3 Задание: Данные ФИО сотрудника — " + fullName2);
    }
}