import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("WELCOME TO CALCULATOR");
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your input:");
            System.out.println(main.calc(scanner.nextLine()));
        }
    }
    public static String calc(String input) throws IOException {
        String[] numbersStrings = new String[2];
        input = input.toUpperCase(Locale.ROOT);
        Integer firstInt, secondInt, answer;
        RomanNumber firstRoman;
        RomanNumber secondRoman;
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        if (input.contains("+")) {
            numbersStrings = input.split("\\+");
            try {
                if (Integer.parseInt(numbersStrings[0].trim()) > 0 && Integer.parseInt(numbersStrings[0].trim()) < 11
                        && Integer.parseInt(numbersStrings[1].trim()) > 0 && Integer.parseInt(numbersStrings[1].trim()) < 11) {

                    firstInt = Integer.valueOf(numbersStrings[0].trim());
                    secondInt = Integer.valueOf(numbersStrings[1].trim());

                    answer = firstInt + secondInt;
                    return (answer.toString());
                } else {
                    System.out.println("Numbers must be from 1 to 10");
                    throw new IOException();
                }
            } catch (NumberFormatException e) {
                try {
                    firstRoman = RomanNumber.valueOf(numbersStrings[0]);
                    secondRoman = RomanNumber.valueOf(numbersStrings[1]);
                    if (firstRoman.arabNumber > 0 && firstRoman.arabNumber < 11 && secondRoman.arabNumber > 0 && secondRoman.arabNumber < 11) {
                        answer = firstRoman.arabNumber + secondRoman.arabNumber;
                        return (converter.convert(answer));
                    } else {
                        System.out.println("Numbers must be from I to X");
                        throw new IOException();
                    }
                } catch (IllegalArgumentException e2) {
                    System.out.println("Wrong input");
                    throw new IllegalArgumentException();
                }
            }


        }

        if (input.contains("*")) {
            numbersStrings = input.split("\\*");
            try {
                if (Integer.parseInt(numbersStrings[0].trim()) > 0 && Integer.parseInt(numbersStrings[0].trim()) < 11
                        && Integer.parseInt(numbersStrings[1].trim()) > 0 && Integer.parseInt(numbersStrings[1].trim()) < 11) {

                    firstInt = Integer.valueOf(numbersStrings[0].trim());
                    secondInt = Integer.valueOf(numbersStrings[1].trim());

                    answer = firstInt * secondInt;
                    return (answer.toString());
                } else {
                    System.out.println("Numbers must be from 1 to 10");
                    throw new IOException();
                }
            } catch (NumberFormatException e) {
                try {
                    firstRoman = RomanNumber.valueOf(numbersStrings[0]);
                    secondRoman = RomanNumber.valueOf(numbersStrings[1]);
                    if (firstRoman.arabNumber > 0 && firstRoman.arabNumber < 11 && secondRoman.arabNumber > 0 && secondRoman.arabNumber < 11) {
                        answer = firstRoman.arabNumber * secondRoman.arabNumber;
                        return (converter.convert(answer));
                    } else {
                        System.out.println("Numbers must be from I to X");
                        throw new IOException();
                    }
                } catch (IllegalArgumentException e2) {
                    System.out.println("Wrong input");
                    throw new IllegalArgumentException();
                }
            }


        }

        if (input.contains("/")) {
            numbersStrings = input.split("/");
            try {
                if (Integer.parseInt(numbersStrings[0].trim()) > 0 && Integer.parseInt(numbersStrings[0].trim()) < 11
                        && Integer.parseInt(numbersStrings[1].trim()) > 0 && Integer.parseInt(numbersStrings[1].trim()) < 11) {

                    firstInt = Integer.valueOf(numbersStrings[0].trim());
                    secondInt = Integer.valueOf(numbersStrings[1].trim());

                    answer = firstInt / secondInt;
                    return (answer.toString());
                } else {
                    System.out.println("Numbers must be from 1 to 10");
                    throw new IOException();
                }
            } catch (NumberFormatException e) {
                try {
                    firstRoman = RomanNumber.valueOf(numbersStrings[0]);
                    secondRoman = RomanNumber.valueOf(numbersStrings[1]);
                    if (firstRoman.arabNumber > 0 && firstRoman.arabNumber < 11 && secondRoman.arabNumber > 0 && secondRoman.arabNumber < 11) {
                        answer = firstRoman.arabNumber / secondRoman.arabNumber;
                        return (converter.convert(answer));
                    } else {
                        System.out.println("Numbers must be from I to X");
                        throw new IOException();
                    }
                } catch (IllegalArgumentException e2) {
                    System.out.println("Wrong input");
                    throw new IllegalArgumentException();
                }
            }
        }

        if (input.contains("-")) {
            numbersStrings = input.split("-");
            try {
                if (Integer.parseInt(numbersStrings[0].trim()) > 0 && Integer.parseInt(numbersStrings[0].trim()) < 11
                        && Integer.parseInt(numbersStrings[1].trim()) > 0 && Integer.parseInt(numbersStrings[1].trim()) < 11) {

                    firstInt = Integer.valueOf(numbersStrings[0].trim());
                    secondInt = Integer.valueOf(numbersStrings[1].trim());

                    answer = firstInt - secondInt;
                    return (answer.toString());
                } else {
                    System.out.println("Numbers must be from 1 to 10");
                    throw new IOException();
                }
            } catch (NumberFormatException e) {
                try {
                    firstRoman = RomanNumber.valueOf(numbersStrings[0]);
                    secondRoman = RomanNumber.valueOf(numbersStrings[1]);
                    if (firstRoman.arabNumber > 0 && firstRoman.arabNumber < 11 && secondRoman.arabNumber > 0 && secondRoman.arabNumber < 11) {
                        answer = firstRoman.arabNumber - secondRoman.arabNumber;
                        if (answer<1) {
                            System.out.println("Roman numbers can't go lower than 1");
                            throw new IOException();
                        }
                        return (converter.convert(answer));
                    } else {
                        System.out.println("Numbers must be from I to X");
                        throw new IOException();
                    }
                } catch (IllegalArgumentException e2) {
                    System.out.println("Wrong input");
                    throw new IllegalArgumentException();
                }
            }
        }
        System.out.println("=wrong input=");
        throw new IOException();
    }
}


class ArabicToRomanConverter {

    String convert(int ArabicNumber) {
        String romanAnswer;
        int x = 1;

        switch (ArabicNumber) {
            case 1:
                return ("I");

            case 2:
                return ("II");


            case 3:
                return ("III");


            case 4:
                return("IV");


            case 5:
                return("V");


            case 6:
                return("VI");


            case 7:
                return("VII");


            case 8:
                return("VIII");


            case 9:
                return("IX");


            case 10:
                return("X");


            case 11:
                return("XI");


            case 12:
                return("XII");


            case 13:
                return("XIII");


            case 14:
                return("XIV");


            case 15:
                return("XV");


            case 16:
                return("XVI");


            case 17:
                return("XVII");


            case 18:
                return("XVIII");


            case 19:
                return("XIX");


            case 20:
                return("XX");


            case 21:
                return("XXI");


            case 24:
                return("XXIV");


            case 25:
                return("XXV");


            case 27:
                return("XXVII");


            case 28:
                return("XXVIII");


            case 30:
                return("XXX");


            case 32:
                return("XXXII");


            case 35:
                return("XXXV");


            case 36:
                return("XXXVI");


            case 40:
                return("XL");


            case 42:
                return("XLII");


            case 45:
                return("XLV");


            case 48:
                return("XLVIII");


            case 49:
                return("XLIX");


            case 50:
                return("L");


            case 54:
                return("LIV");

            case 56:
                return("LVI");


            case 60:
                return("LX");


            case 63:
                return("LXIII");


            case 64:
                return("LXIV");


            case 70:
                return("LXX");


            case 72:
                return("LXXII");


            case 80:
                return("LXXX");


            case 81:
                return("LXXXI");


            case 90:
                return("XC");


            case 100:
                return("C");


        }
        return "wrong input";
    }
}


enum RomanNumber {
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10),
    XI(11),
    XII(12),
    XIII(13),
    XIV(14),
    XV(15),
    XVI(16),
    XVII(17),
    XVIII(18),
    XIX(19),
    XX(20),
    XXI(21),
    XXIV(24),
    XXV(25),
    XXVII(27),
    XXVIII(28),
    XXX(30),
    XXXII(32),
    XXXV(35),
    XXXVI(36),
    XL(40),
    XLII(42),
    XLV(45),
    XLVIII(48),
    XLIX(49),
    L(50),
    LIV(54),
    LVI(56),
    LX(60),
    LXIII(63),
    LXIV(64),
    LXX(70),
    LXXII(72),
    LXXX(80),
    LXXXI(81),
    XC(90),
    C(100);


    int arabNumber;

    RomanNumber(int arabNumber) {
        this.arabNumber = arabNumber;
    }

}



