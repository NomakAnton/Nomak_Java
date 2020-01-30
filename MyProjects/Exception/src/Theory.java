public class Theory {
    /*
1. Ошибки времени компиляции - происходят при нарушении синтаксиса языка(то бишь программа не может быть преобразована
в байт код)Пример :
int x = 10;
double y = 5;
int z = x + y;
Программа не сможет запуститься так как double в int

2.Ошибки времени выполнения - возникают из за неправильно построенной логики приложения, непрвильной работы железа,
проблем с входными данными.Ошибки которые не факт что возникнут,но есть потенциальная возможность такой ошибки в коде.

*java.lang.ArithmeticException - класс исключения, экземпляр которого выбрасывается при арифметических ошибках.
*java.lang.NullPointerException - класс исключения,экземпляр которого выбрасывается при работе с объектной переменной
,которая не указывает на реально созданный объект (самая  частая ошибка у начинающих программистов)
*java.lang.ArrayIndexOutOfBoundsException - класс исключения, экземпляр которого вырасывается при выходе за пределы
массива.
*java.lang.OutOfMemoryError - класс исключения, экземпляр которого выбрасывается при недостатке памяти для JVM.

                                                                  Throwable
                                               |                                           |
                                               V                                           V
                                            Exception                                    Error
                                               |                                           |
                                               V                                           V
                                         RuntimeException                           VirtualMachineError
                                               |                                            |
                                               V                                            V
                                       ArithmeticException                           OutOfMemoryError
                                      NullPointerException

                                     IndexOutOfBoundsException
                                               |
                                               V
                                   ArrayIndexOutOfBoundsException
*/
}
