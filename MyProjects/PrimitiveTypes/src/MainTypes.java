public class MainTypes {
    public static void main(String[] args) {
        /*
        long       ->          int       ->            short     ->         byte
       64 бита     ->        32 бита     ->            16 бит    ->        8 бит

       Конвертация из меньшего в большее происходит без проблем,это как положить что то из маленькой коробки в большую.
       Ведь раз вместилось в маленькую то вместится и в большую.Эта операция называется - АВТОМАТИЧЕСКИМ ПРЕОБРАЗОВАНИЕМ
       про другому - РАСШИРЕНИЕМ.
       int a = 100000
       byte b = 15
       a = b;

       Операция наоорот,то есть из большего к меньшему называется СУЖЕНИЕМ и отличается нюансами при ее проведении,при
       проведении такой операции необходимо указать к какому типу мы приводим значение

       int bigNumber = 1000000;

       short littleNumber = 1000;

       littleNumber = (short) bigNumber; -  скобках указали что приводим именно к "short"
       System.out.println(littleNumber);

       Вывод в консоль будет - -27008.Происходит это потому что число хранилось в системе в 32 - битном представлении.
       а short это 16 бит!И поэтому только первые 16 бит будут скопированы а остальные отброшены.И получилось что в
       двоичном представлении это - -27008

       Для дробных типов (float и double) сужение происходит по-своему. Если попытаться привести такое число к
       целочисленному типу, у него будет отброшена дробная часть.

       double d = 2.7;

       long x = (int)d;
       System.out.println(x);// вывод  будет 2

       Тип char
       Значения char хранятся в Java в формате Юникода
       Например если сделать так:

       char c = 5051;

       System.out.println(c);

       Вывод будет:Ꮋ

       Это обусловленоо тем что когда мы в char засовываем числовое значение то выведется символ который хранится в
       Юникод таблице под данным номером

         */
    }
}
