public class Pesel {
    public static boolean isLengthOK(String pesel) {
        return pesel.length() == 11;
    }

    public static boolean isPeselOK(String pesel) {
        if (isLengthOK(pesel)) {
            byte[] PESEL = new byte[11];
            byte[] peselWeight = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
            int peselLength = pesel.length();
            for (int i = 0; i < peselLength; i++) {
                PESEL[i] = Byte.parseByte(pesel.substring(i, i + 1));
            }
            int sum = peselWeight[0] * PESEL[0] +
                    peselWeight[1] * PESEL[1] +
                    peselWeight[2] * PESEL[2] +
                    peselWeight[3] * PESEL[3] +
                    peselWeight[4] * PESEL[4] +
                    peselWeight[5] * PESEL[5] +
                    peselWeight[6] * PESEL[6] +
                    peselWeight[7] * PESEL[7] +
                    peselWeight[8] * PESEL[8] +
                    peselWeight[9] * PESEL[9];
            sum = sum % 10;
            sum = 10 - sum;
            if (sum == PESEL[10]) {
                return true;
            }
            return false;
        } else return false;
    }


    public static String dateOfBirth(String pesel) {
        if (isPeselOK(pesel)) {

            String year = pesel.substring(0, 2);
            year = "19" + year;
            String month = pesel.substring(2, 4);
            String day = pesel.substring(4, 6);
            return "Data urodzania to: rok " + year + ", miesiac " + month + ", dzień " + day + ".";
        }
        return "PESEL nieprawidłowy";
    }

    public static String sex(String pesel) {
        if (isPeselOK(pesel)) {
            int sex = Integer.parseInt(pesel.substring(9, 10));
            if (sex % 2 == 0) {
                return "Płeć: kobieta";
            } else {
                return "Płeć: mężczyzna";
            }
        }
        return "PESEL nieprawidłowy";
    }
}
