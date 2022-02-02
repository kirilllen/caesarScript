package CaesarDescrypt;

public class CaesarDecrypt {
    public static void main (String[] args) {
        String inputString="Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. \n" +
                "Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. \n" +
                "Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. \n" +
                "Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. \n" +
                "Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. \n" +
                "Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";

        StringBuilder decryptorTrial=new StringBuilder(inputString.length());
        decryptorTrial.append(inputString.toLowerCase()); //большая буква или маленькая - для расшифровки неважно
        for (int j=0; j<32; j++){
            for (int i=0; i<inputString.length(); i++) {
                char inputChar=decryptorTrial.charAt(i);
                switch (inputChar) {
                    case ' ', '-', '!', '?', '.', ',', '\n':
                        break;
                    case 'ё': //буква ё по номерации стоит не там, где надо бы, аналогично после е идёт ё
                        decryptorTrial.setCharAt(i, 'ж');
                        break;
                    case 'е':
                        decryptorTrial.setCharAt(i, 'ё');
                        break;
                    default:
                        if ((inputChar+1)<1104) {   //проверяем не пересекли ли букву я
                            decryptorTrial.setCharAt(i, (char)(inputChar+1));
                        }
                        else {
                            decryptorTrial.setCharAt(i, (char)(inputChar+1-32));
                        }
                        break;
                }

            }
            System.out.println(decryptorTrial);
            System.out.println();
        }

    }


}
