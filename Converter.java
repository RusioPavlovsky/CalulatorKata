public class Converter {
    int getRoman (char s){              //хранит данный для перевода римских чисел в арабские
        if(s == 'I') return 1;
        else if (s == 'V') return 5;
        else if (s == 'X') return 10;
        else if (s == 'L') return 50;
        else if (s == 'C') return 100;
        return 0;
    }
     int romanToArabian (String roman){
        char[] romanSymbols = roman.toCharArray();
        int end = romanSymbols.length-1;
        int arabian;
        int result = getRoman(romanSymbols[end]);
        for( int i = end-1; i>=0; i--){
            arabian = getRoman(romanSymbols[i]);
            if (arabian < getRoman(romanSymbols[i+1])){
                result -=arabian;
            } else {
                result += arabian;
            }
        }
        return result;
     }

     String getArabian(int arabian){
        switch (arabian){
            case 1: return "I";
            case 4: return "IV";
            case 5: return "V";
            case 9: return "IX";
            case 10: return "X";
            case 40: return "XL";
            case 50: return "L";
            case 90: return "XC";
            case 100: return "C";
            case 0: return null;
        }return null;
     }
     String arabianToRoman (int arabian) {
        String[] romanArray = {null,"I","II","III","IV","V","VI","VII","VIII","IX","X",
                "XI", "XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX",
                "XX","XXI","XXII","XXIII","XXIV","XXV","XXVI", "XXVII","XXVIII","XXIX",
                "XXX", "XXXI","XXXII", "XXXIII", "XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX",
                "XL","XLI","XLII","XLIII","XLIV","XLV", "XLVI","XLVII","XLVIII","XLIX",
                "L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX",
                "LX","LXI", "LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX",
                "LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV", "LXXVI","LXXVII","LXXVIII", "LXXIX","LXXX",
                "LXXXI","LXXXII", "LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX",
                "XC","XCI","XCII","XCIII", "XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C"};
        return romanArray[arabian];
     }


}
