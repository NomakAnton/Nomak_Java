public class MainAbstractionTheory {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
/*
Принцип слабых связей
Принцип слабых связей - это принцип по которому объекты обьединяеются в группы и внутри этой группы происходит интенсивная
связь между объектами.В свою очередь связь между группами должна быть слабая,это позволит вносить изменения в программу
с минимальными переделками и затратами.
Правильная разбивка объектов на группы и способов взаимодействие различных групп - это принцип АБСТРАКЦИИ
А сокрытие внутренних частей группы называется инкапсуляцией.
Абстрацкия и инкапсуляция хорошо работают и раскрывают свой смысл в паре.
В абстракции главное выделить основную информцию об объекте,а точнее в рамках задачи выделить главные-необходимые свойства
класса.К примеру есть класс "Human" и для работадателя важны такие параметры как опыт работы,навыки,возраст и т.д. но
компанию совершенно не интересует вкусовые предпочтения "Human" или его цвет глаз.А например для модельного агенства
интересны такие параметры как цвет глаз,рост,комплекция и т.д.Принцип абстракции  позволяет выделить некий абстрактный класс
- Human  выделить общие черты человека - имя и возраст


                                                    Human(String name,int age)
                             |                                                              |
        Worker extends Human                                                        Model extends Human

        int workExperience;                                                         String colorEye;
        String [] skills;                                                           int weight;
                                                                                    int height;
       public Worker(String name,int age,int workExperience,                        public Model(String name,int age,String
        String[] skills)                                                            colorEye,int weight,int height){
        {
        super(name,age)// так как поля у класса Human                               super(name,age)
        private то они не наследуются,то мы можем обратиться                        this.weight = weight;
        к конструктору класса родителя                                              this.height = height;
        this.workExperience = workExperience;                                       this.colorEye = colorEye;
        this.skills = skills;                                                       }
        }
То есть принцип абстрации это правильная разбивка обьектов на группы.
Инкапсуляция - это правильное определение какие аргументы и поля надо сделать открытими,а какие являються  внутренней
реализацией и должны быть сокрыты и недоступны для изменения
Наследование же,заключается в использовании уже существующих классов для описания новых.
Теперь если мы посмотрим и на рабочего и на модель ,мы понимаем что это человек и он обладает некими общими свойставми.
Говоря языком программирования они имеют одинаковый интерфейс.Принцип в ООП когда программа может использовать объекты
с одинаковым интерфейсом без информации о внутреннем устройстве объекта называется ПОЛИМОРФИЗМОМ



 */