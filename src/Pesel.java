public class Pesel {
    public static boolean isLengthOK(String pesel) {
        if (pesel.length() != 11) return false;
        else return true;
    }

    public static String isPeselOK(String pesel) {
        if (isLengthOK(pesel)) {
            byte[] PESEL = new byte[11];
            int peselLength = pesel.length();
            for (int i = 0; i < peselLength; i++) {
                PESEL[i] = Byte.parseByte(pesel.substring(i, i + 1));
            }
                int sum = 1 * PESEL[0] +
                        3 * PESEL[1] +
                        7 * PESEL[2] +
                        9 * PESEL[3] +
                        1 * PESEL[4] +
                        3 * PESEL[5] +
                        7 * PESEL[6] +
                        9 * PESEL[7] +
                        1 * PESEL[8] +
                        3 * PESEL[9];
                sum = sum % 10;
                sum = 10 - sum;
            if(sum == PESEL[10]){
                return  "Pesel prawidłowy";
            };
            return "Nieprawidłowy pesel";
        } else return "Nieprawidłowy pesel";
    }


    public static String dateOfBirth(String pesel) {
        String year = pesel.substring(0, 2);
        year = "19" + year;
        String month = pesel.substring(2, 4);
        String day = pesel.substring(4, 6);
        return "Data urodzania to: rok " + year + ", miesiac " + month + ", dzień " + day + ".";
    }

    public static String sex(String pesel) {
        int sex = Integer.parseInt(pesel.substring(9, 10));
        if (sex % 2 == 0) {
            return "Płeć: kobieta";
        } else {
            return "Płeć: mężczyzna";
        }
    }
}
