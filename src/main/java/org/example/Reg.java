package org.example;

public class Reg {
    public static void main(String[] args) {
        //String str = "apple";
        //String str = "7899999ffdljl";
        //String str = "ffdljlsdf";
        //String str = "t";
        //String str = "aa";
        String str = "abddsYa";

        //String regex = "^a.*"; // начинается ли наша строка с символа а ответ тру ^a.* реуглярное вырважение . означает все символы ответ тру
        //String regex = "^t.*";
        //String regex = "^a.*"; // нужно как более точно говорить что сначала и что потом * сколько раз повториться символ  ответ тру
        //String regex = ".*e$"; // заканчивется строка на е  //  . какие то символы идут * сколько то раз и потом уже конец строки ответ тру
        //String regex = ".*t$"; // ответ фолс
        //String regex = "^a?p{2}.*"; // есть ли а 1 раз и есть ли в строке p два раза
        //String regex= ".*e$"; // закачивается ли строка на e
        //String regex= "\\d*"; //   означает \\ экранирование обратного слэша для экранирования добавляем еще 1 \ в строке встречается цифра ноль или несколько раз
        //String regex= "\\d*\\w*"; //"7899999ffdljl";
        //String regex= "\\d*.*";//"7899999ffdljl";
        //String regex= ".*\\d.*"; //"ffdljlsdf";  есть ли цифра в строке ?
        //String regex= "[atu]";
        //String regex= "[abc]*"; // встречается ли в строке или а или б или с ноль или больше раз проверка происходить по точноному совпадению должно быть abc
        // а не cba или abd.
        //String regex= "[a-z]*"; // встречается ли в диапазоне от а до зет ноль или более раз
        String regex= "[a-zA-Z]*"; // встречается ли в диапазоне от а до зет ноль или более раз
        Boolean res = str.matches(regex);
        System.out.println(res);
    }
}
