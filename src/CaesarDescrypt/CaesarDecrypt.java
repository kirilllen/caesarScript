package CaesarDescrypt;

import java.util.Locale;

public class CaesarDecrypt {
    public static void main (String[] args) {
        String inputString; //строка ввода

        inputString="Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";
        StringBuilder decryptorTrial=new StringBuilder(inputString.length());
        decryptorTrial.append(inputString.toLowerCase()); //большая буква или маленькая - для расшифровки неважно
        int moveNumber=2; //насколько сдвигаем
        for (int i=0; i<inputString.length(); i++) {
            char inputChar=decryptorTrial.charAt(i);
            switch (inputChar) {
                case ' ', '-', '!', '?', '.', ',', '\n':
                    break;
                case 'ё':
                    decryptorTrial.setCharAt(i, 'ж'); //буква ё по номерации стоит не там, где надо бы
                    break;
                case 'е':
                    decryptorTrial.setCharAt(i, 'ё');
                    break;
                default:
                    if ((inputChar+moveNumber)<255) {   //проверяем не пересекли ли букву я
                        decryptorTrial.setCharAt(i, (char)(inputChar+moveNumber));
                    }
                    else {
                        decryptorTrial.setCharAt(i, (char)(inputChar+moveNumber-32));
                    }

                    break;
            }

        }
        System.out.println(decryptorTrial);
    }


}
