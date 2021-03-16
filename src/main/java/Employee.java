public class Employee {
    String FNF;
    String post;
    String email;
    long telephone;
    int salary;
    int age;
    int getAge(){
        return age;
    }
    void info(){
        System.out.println("Сотрудника зовут " + FNF + " ему " + age + " годиков, его контактный телефон " +
                telephone + " и мыло " + email + " ,на должности " + post + " довольствуется " + salary + " рублями.");
        //про printf знаю
    }
    public Employee(String FNF , String post , String email , long telephone , int salary , int age){
        this.FNF = FNF;
        this.post = post;
        this.email = email;
        this.telephone = telephone ;
        this.salary = salary;
        this.age = age;
    }
}

