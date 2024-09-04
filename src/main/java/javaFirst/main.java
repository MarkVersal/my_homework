package javaFirst;

public class main {

    public static void main(String[] args){

        //Используем
        boolean flag = true;
        flag = false;

        //целочисленные типы данных - целые числа (-1,0,2,3...) литералы всегда int
        byte aByte = -128; //-128 ... 127 (8 bit)
        short aShort = -32768; // -32768 ... 32767 (16 bit)

        //Используем
        int aInt = -2147483; //32 bit 2^(bit-1)
        long aLong = ; //64 bit

        //С плавающей точкой
        float aFloat = 1.0F;//32 bit 2^(bit-1)
        //Используем* (редко)
        double aDouble = 1.0D;//64 bit
        //Символ
        char aChar = 'a';


        //оператор
        // Присвоения '='
        char iChar = 'i';

        //Математические + - / * %
        int result = 5 - 3;

        // Сравнение < > <= >= != ==

        // Логические & Амперсант (и),&& (сокращенное и), | (или), || (Сокращенное или), ! не (отрицание)
        if (3 > 2 & 3 > 1) {
        }

        // Тернарный ? :

        //instanceof

//wrapper нужны там где нельзя работать с примитивными типами данных

}
