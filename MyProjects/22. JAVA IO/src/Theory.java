public class Theory {
    /*
    *Поток (в терминах IO) -  некоторая последовательность байт.
    *
    * При запуске приложения по умолчанию открывается три потока
    *
    * - System.in
    * - System.out
    * - System.err
##  Классы Java IO
*
* InputStream - абстрактный класс, описывает базовое поведение и состояние объектов, которые могут читать данные (байты)
* из потока
*
   public abstract int read();//метод для чтения данных из потока, очевидно что потоки могут быть разные, поэтому данный метод
   абстрактный и реализуется в потомках
   int read(byte b[]);

         FileInputStream extends InputStream - класс, читающий данные из файла.

1 байт - 0 ... 255
byte - -128 ... 127

Мы полагаем, что метод read должен вернуть -1, когда поток закончился
*
* byte read()

Тогда байт, который имеет значение 255 юудет считан как -1 и возникает путаница, то ли я считал байт со значением 255, то ли у меня поток закончился.

По этой причине метод read возвращает int, тогда 255 будет считано как 255, а -1 - сигнал что поток закончился
*
* №№Reader/Writer
* Инструменты работающие с потоками символов а не байтов
     */
}
