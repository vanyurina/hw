/**
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
 */
public class Employee {
    private String fio; //Фамилия, имя, отчество
    private String position; //Должность
    private String email; // email
    private String phone; //Телефон
    private float salary; //Зарплата
    private int age; //Возраст

    /**
     * Конструктор класса должен заполнять эти поля при создании объекта;
     */
    public Employee() {
        fio = "Иванов";
        position = "программист";
        email = "test@mail.ru";
        phone = "+7(931)340-07-84";
        salary = 50000.00f;
        age = 25;
    }

    /**
     * Это параметризированный конструктор
     * @param fio ФИО сотрудника
     * @param position должность сотрудника
     * @param email электронная почта сотрудника
     * @param phone телефон сотрудника
     * @param salary зарплата сотрудника
     * @param age возраст сотрудника
     */
    public Employee (String fio, String position, String email, String phone, float salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
     */
    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    /**
     * Метод, возвращающий возраст сотрудника
     */
    public int getAge() {
        return age;
    }
}

