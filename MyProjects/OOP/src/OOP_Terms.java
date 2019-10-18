public class OOP_Terms {

/*
Класс - абстрактный тип данных Java. Как правило оформляется в ввиде отдельного файла, имя которого совпадает с названием
класса.

Поля класса -(fields) - переменные, обьявленные внутри класса

Методы класса (methods) - функции и процедуры, объявленнные внутри класса.Определяют поведение объектов данного класса

Объект - экзепляр класса - обладает состоянием и поведением.

Члены класса (class memebers) - поля и методы. Обращение к полям и методам происходит через оператор "точка".

this - ключевое слово, позволяет указывать явно член класса.

this - объектная переменная, которая в момент выполнения содержит ссылку на объект,внутри которого происходят вычисления.
У каждого объекта есть своя переменная this, указывающая на этот объект

Контруктор - набор инструкций, выполняющий инициализацию объекта

Инициализация объекта  - формирование его изначального состояния. Задание опредеденных значений полям объекта

Java по умолчанию создает пустой контруктор  - пустой. Это называется конструктором по умолчанием

Если был написан пользовательский конструктор о конструктор по умолчанию затирается польностью

КОНСТРУКТОР НЕ ЯВЛЯЕТСЯ ЧЛЕНОМ КЛАССА

Конструктор в некоторых трактовках методом не является, в других - является специфичным методом.

Human anton; //объектная переменная, изначально не содержит никаких значений, следовательно работа с ней
    //не возможна
    //anton = new Human();new - оператор выделения памяти, Human() - конструктор, все выражение создает объект  и
    //помещает ссылку на объект в переменную - "anton"

Ассоциация - означает что объекты как то связаный с друг другом и имеют некоторую связь.К примеру Банк и банковская карта
Менеджер и Счет,Преподаватель и Студент,Машина и Колесо.Идея просто,2 объекта как то связанны и это необходимо описать.

Агрегирование - это частный случай ассоциации,когда объект является частью другого объекта (Например колесо является частью автомобиля
студент является частью группы студентов)

Композиция - еще более жесткая связь,когда объект не только является частью другого,но и вообще не может принадлежать еще кому то.Например двигатель и машина
Конечно двигатель может быть и без машины,но один двигатель не может быть в 2ух или 3ех машиных одновременно,а студент к примеру может являтся частью другой
группы
JAVA IT

Ассоциация - означает любую связь между двумя произвольными классами
Если в классе А есть какая-либо ссылка (поле) на другой класс B, то говорят что класс А ассоциирован с классом B
*********
class A {
private B b;
}
*********
Композиция  - частный случай ассоциации, когда класс B не может существовать без класса A

Агрегирование  - частный случай ассоциации.Подразумевает независимость между классами ю

class A {
 private B b;

 public A(B b) {
 this.b = b;
 }
*/

}