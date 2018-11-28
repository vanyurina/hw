public class Main {

    public static void main (String[] args) {
        Employee employee_1 = new Employee();
        System.out.println(employee_1.toString());

        Employee emp = new Employee("Ivanov", "accountant", "qqq@mail.ru", "+79998881234", 123000, 21);
        System.out.println(emp.toString());

        Employee[] employees_list = new Employee[5];
        employees_list[0] = new Employee("Сидоров", "тестировщик", "zzz@mail.ru", "+7(999)1111111", 50000, 23);
        employees_list[1] = new Employee("Петров", "менеджер", "xxx@mail.ru", "+7(999)2222222", 70000, 45);
        employees_list[2] = new Employee("Козлов", "дизайнер", "vvv@mail.ru", "+7(999)3333333", 65000, 21);
        employees_list[3] = new Employee("Соколов", "бухгалтер", "ccc@mail.ru", "+7(999)4444444", 1500000, 41);
        employees_list[4] = new Employee("Деточкин", "водитель", "aaa@mail.ru", "+7(999)5555555", 300000, 50);


        /**
         * С помощью цикла вывести информацию только о сотрудниках старше 40 лет
         */
        System.out.println();
        System.out.println("Список сотрудников старше 40 лет");
        for (int i = 0; i < employees_list.length ; i++) {
            if (employees_list[i].getAge() > 40){
                System.out.println(employees_list[i].toString());
            }
        }
    }
}
