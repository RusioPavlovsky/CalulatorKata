public class Boolens {
    boolean howManyElementsOfArray (String[] strings){    // проверяет количетсво элементов массива строк+++
        if (strings.length!=2) return true;
        return false;
    }

    boolean isRoman(String s){                                //проверяет в какой системе счисления строка+++
        String[] romanArray = {"I","V","X","L","C"};
        for (int i=0; i<romanArray.length; i++){
        if (s.contains(romanArray[i])) return true;
        }
        return false;
    }
    boolean isArabian(String s){
        String[] arabianArray = {"0","1","2","3","4","5","6","7","8","9"};
        for (int i=0;i<arabianArray.length;i++){
            if (s.contains(arabianArray[i])) return true;
        }
        return false;
    }


    boolean numbersFromZeroToTen(int a, int b){
        if (a<0|a>10|b<0|b>10) return true;
        else return false;
    }


    boolean isThereAnyActions(String s){
        String[] actions = {"+","-","*","/"};
        for (int i=0;i<actions.length; i++ ) {
            if (s.contains(actions[i])) return false;
        }
        return true;
    }

}
