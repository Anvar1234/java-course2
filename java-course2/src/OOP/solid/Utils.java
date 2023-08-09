package OOP.solid;

/**
 * Класс, хранящий публичные вспомогательные методы, применение которых возможно для разных классов.
 */
public class Utils {

    /**
     * Вспомогательный метод, который проверяет, является ли ПЕРВЫЙ символ входящей строки числом (а у нас в массиве
     * хранятся строки). И нам не за чем проверять всю строку (а строка может состоять из символов типа 10.2), а
     * достаточно проверить лишь первый символ, то есть str.charAt(0), и тогда ясно, что перед нами - число.
     */
    public final static boolean isNumber(String exp) {
        try {
            Integer.parseInt(String.valueOf(exp.charAt(0)));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    /**
     * Вспомогательный метод для добавления в строке String пробелов между операторами и операндами.
     */
    public final static String addSpaces(String exp) {
        //todo ВОПРОС: как правильно понять regexы? И составлять. Загуглить "тренажер регулярных выражений"

        // заменяем все вхождения скобок и операторов на сами символы с добавлением пробелов
        String result = exp.replaceAll("([()+\\-*/^])", " $1 ");
        // удаляем лишние пробелы
        result = result.replaceAll("\\s+", " ").trim();
        return result;
    }
}