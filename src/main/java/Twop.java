public class Twop {
    public static void main(String[] args) {
        Employee[] empls = new Employee[5];
        empls[0] = new Employee("Иван" , "сантехник" , "ivan@milo.ru" , 89002333333L ,
                    10000 , 34);
        empls[1] = new Employee("Вася" , "инженер" , "vasya@milo.ru" , 89102333355L ,
                    20000 , 40);
        empls[2] = new Employee("Толя" , "бездельник" , "tolya@milo.ru" , 86666666666L ,
                    666666 , 66);
        empls[3] = new Employee("Дед" , "ворчун" , "ded@milo.ru" , 89002333366L ,
                    12000 , 95);
        empls[4] = new Employee("Самойлов Алексей Владимирович" , "дединсайд" , "samoiloff.alex@gmail.com"
                    , 89002933377L , 0 , 17);
        for (int i = 0; i < empls.length; i++) {
            if(empls[i].getAge() >= 40){
                    empls[i].info();
            }
        }
    }
}