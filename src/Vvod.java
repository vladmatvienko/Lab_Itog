import java.util.Arrays;
import java.util.Scanner;
public class Vvod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (!in.hasNext("quit")) {
            String s = in.next();
            int g = 0;
                g = s.length();
                String[] array = new String[g];
                int t = 0;
                for (int k = 0; k < g; k++) {
                    String l = String.valueOf(s.charAt(k));
                    if (l.equals("1") | l.equals("2") | l.equals("3") | l.equals("4") | l.equals("5") | l.equals("6") | l.equals("7") | l.equals("8") | l.equals("9") | l.equals("0") | l.equals("+") | l.equals("-") | l.equals("/") | l.equals("*") | l.equals(":") | l.equals("(") | l.equals(")")) {
                        array[k] = String.copyValueOf(new char[]{s.charAt(k)});
                        t = t + 1;
                    } else {
                        System.out.println("BigFuckinPeaceOfShit1");
                    }
                }
                int i = 0;
                int q = 0;
                if (t == g) {
                    for (int k = 0; k < g; k++) {
                        if (array[k].equals("+") | array[k].equals("-") | array[k].equals("/") | array[k].equals("*") | array[k].equals(":")) {
                            q = q + 1;
                            if ((array[k + 1].equals("1") | array[k + 1].equals("2") | array[k + 1].equals("3") | array[k + 1].equals("4") | array[k + 1].equals("5") | array[k + 1].equals("6") | array[k + 1].equals("7") | array[k + 1].equals("8") | array[k + 1].equals("9") | array[k + 1].equals("(") | array[k + 1].equals(")")) & (array[k - 1].equals("0") | array[k - 1].equals("1") | array[k - 1].equals("2") | array[k - 1].equals("3") | array[k - 1].equals("4") | array[k - 1].equals("5") | array[k - 1].equals("6") | array[k - 1].equals("7") | array[k - 1].equals("8") | array[k - 1].equals("9") | array[k - 1].equals("(") | array[k - 1].equals(")"))) {
                                i = i + 1;
                            } else {
                                System.out.println("BigFuckinPeaceOfShit2");
                            }
                        }
                    }
                }
                int amountofarrayofnumbers = 0;
                int amountofarrayofseparation = 0;
                int amountofarrayofsign = 0;
                int w = 0;
                if (q == i) {
                    for (int j = 0; j < g; j++) {
                        if (array[j].equals("/")) {
                            amountofarrayofseparation = amountofarrayofseparation + 1;
                        }
                    }
                    for (int j = 0; j < g; j++) {
                        if (array[j].equals("+") | array[j].equals("-") | array[j].equals("*") | array[j].equals(":")) {
                            amountofarrayofsign = amountofarrayofsign + 1;
                        }
                    }
                    for (int j = 0; j < g; j++) {
                        if (array[j].equals("0") | array[j].equals("1") | array[j].equals("2") | array[j].equals("3") | array[j].equals("4") | array[j].equals("5") | array[j].equals("6") | array[j].equals("7") | array[j].equals("8") | array[j].equals("9")) {
                            amountofarrayofnumbers = amountofarrayofnumbers + 1;
                        }
                    }
                    if (amountofarrayofnumbers / 2 == amountofarrayofseparation) {
                        w = w + 1;
                    } else {
                        System.out.println("BigFuckinPeaceOfShit4");
                    }
                } else {
                    System.out.println("BigFuckinPeaceOfShit3");
                }
                Drob oneDrob = new Drob();
                Drob twoDrob = new Drob();
                Drob lastDrob = new Drob();
                if (w == 1) {
                    while (g > 4) {
                        int x = 4454545;
                        int i1 = 0;
                        int i2 = 0;
                        for (int a = 0; a < g; a++) {
                            if (array[a].equals("(")) {
                                for (int b = 0; b < g; b++) {
                                    if (array[b].equals(")")& b-a<x) {
                                        x = b-a-1;
                                        i1 = a+1;
                                        i2 = b-1;
                                    }
                                }
                            }
                        }
                        int num = 0;
                        String[] array1 = new String[x];
                        if (x != 4454545) {
                            for (; i1 <= i2; i1++) {
                                array1[num] = array[i1];
                                array[i1] = "";
                                num = num + 1;
                            }
                        }
                        int num1 = 0;
                        for (int a = 0; a < g; a++) {
                            if (array[a].equals("")){
                                num1 = num1 +1;
                            }
                        }
                        i1 = i1 - num;
                        int y = 0;
                        int key = 0;
                        if (x == 4454545) {
                            array1=array;
                            x = array.length;
                            key = 1;
                        }
                        else {
                            array[i2+1] = "";
                            array[i1-1] = "";
                        }
                        System.out.println(Arrays.toString(array1));
                       for (int k = 0; k < x; k++) {
                            if (array1[k].equals("*")) {
                                if (array1[k + 2].equals("/") & array1[k - 2].equals("/")) {
                                    oneDrob.setNumerator(Integer.parseInt(array1[k - 3]));
                                    oneDrob.setDenumerator(Integer.parseInt(array1[k - 1]));
                                    twoDrob.setNumerator(Integer.parseInt(array1[k + 1]));
                                    twoDrob.setDenumerator(Integer.parseInt(array1[k + 3]));
                                    lastDrob.setMultiply(oneDrob, twoDrob);
                                    array1[k] = "";
                                    array1[k + 1] = "";
                                    array1[k + 2] = "";
                                    array1[k + 3] = "";
                                    array1[k - 1] = String.valueOf(lastDrob.getDenumerator());
                                    array1[k - 2] = "/";
                                    array1[k - 3] = String.valueOf(lastDrob.getNumerator());
                                    y = y + 4;
                                }
                            }
                        }
                    String[] array2 = new String[x - y];
                    int u = 0;
                    for (int k = 0; k < x; k++) {
                        if (!array1[k].equals("")) {
                            array2[u] = array1[k];
                            u = u + 1;
                        }
                    }
                    array1 = array2;
                    x = x-y;
                    y = 0;
                    for (int k = 0; k < x; k++) {
                        if (array1[k].equals(":")) {
                            if (array1[k + 2].equals("/") & array1[k - 2].equals("/")) {
                                oneDrob.setNumerator(Integer.parseInt(array1[k - 3]));
                                oneDrob.setDenumerator(Integer.parseInt(array1[k - 1]));
                                twoDrob.setNumerator(Integer.parseInt(array1[k + 1]));
                                twoDrob.setDenumerator(Integer.parseInt(array1[k + 3]));
                                lastDrob.setDivide(oneDrob, twoDrob);
                                array1[k] = "";
                                array1[k + 1] = "";
                                array1[k + 2] = "";
                                array1[k + 3] = "";
                                array1[k - 1] = String.valueOf(lastDrob.getDenumerator());
                                array1[k - 2] = "/";
                                array1[k - 3] = String.valueOf(lastDrob.getNumerator());
                                y = y + 4;
                            }
                        }
                    }
                    array2 = new String[x - y];
                    u = 0;
                    for (int k = 0; k < x; k++) {
                        if (!array1[k].equals("")) {
                            array2[u] = array1[k];
                            u = u + 1;
                        }
                    }
                    array1 = array2;
                    x = x-y;
                    y = 0;
                    System.out.println(Arrays.toString(array1));
                    for (int k = 0; k < x; k++) {
                        if (array1[k].equals("+")) {
                            if (k>=4){
                                if (array1[k-4].equals("-")) {
                                    if (array1[k + 2].equals("/") & array1[k - 2].equals("/")) {
                                        twoDrob.setNumerator(Integer.parseInt(array1[k - 3]));
                                        twoDrob.setDenumerator(Integer.parseInt(array1[k - 1]));
                                        oneDrob.setNumerator(Integer.parseInt(array1[k + 1]));
                                        oneDrob.setDenumerator(Integer.parseInt(array1[k + 3]));
                                        lastDrob.setMinus(oneDrob, twoDrob);
                                        int n = lastDrob.getNumerator();
                                        if (n < 0) {
                                            n = n * -1;
                                            array1[k] = String.valueOf(lastDrob.getDenumerator());
                                            array1[k + 1] = "";
                                            array1[k + 2] = "";
                                            array1[k + 3] = "";
                                            array1[k - 1] = "/";
                                            array1[k - 2] = String.valueOf(n);
                                            array1[k - 3] = "-";
                                            y = y + 3;
                                        } else {
                                            array1[k] = "";
                                            array1[k + 1] = "";
                                            array1[k + 2] = "";
                                            array1[k + 3] = "";
                                            array1[k - 1] = String.valueOf(lastDrob.getDenumerator());
                                            array1[k - 2] = "/";
                                            array1[k - 3] = String.valueOf(lastDrob.getNumerator());
                                            y = y + 4;
                                        }
                                    }
                                }
                            } else {
                                if (array1[k + 2].equals("/") & array1[k - 2].equals("/")) {
                                    oneDrob.setNumerator(Integer.parseInt(array1[k - 3]));
                                    oneDrob.setDenumerator(Integer.parseInt(array1[k - 1]));
                                    twoDrob.setNumerator(Integer.parseInt(array1[k + 1]));
                                    twoDrob.setDenumerator(Integer.parseInt(array1[k + 3]));
                                    lastDrob.setPlus(oneDrob, twoDrob);
                                    array1[k] = "";
                                    array1[k + 1] = "";
                                    array1[k + 2] = "";
                                    array1[k + 3] = "";
                                    array1[k - 1] = String.valueOf(lastDrob.getDenumerator());
                                    array1[k - 2] = "/";
                                    array1[k - 3] = String.valueOf(lastDrob.getNumerator());
                                    y = y + 4;
                                }
                            }
                        }
                    }
                    array2 = new String[x - y];
                    u = 0;
                    for (int k = 0; k < x; k++) {
                        if (!array1[k].equals("")) {
                            array2[u] = array1[k];
                            u = u + 1;
                        }
                    }
                    array1 = array2;
                    x = x-y;
                    y = 0;
                    for (int k = 1; k < x; k++) {
                        if (array1[k].equals("-")) {
                            if (array1[k-4].equals("-")){
                                if (array1[k + 2].equals("/") & array1[k - 2].equals("/")) {
                                    oneDrob.setNumerator(Integer.parseInt(array1[k - 3]));
                                    oneDrob.setDenumerator(Integer.parseInt(array1[k - 1]));
                                    twoDrob.setNumerator(Integer.parseInt(array1[k + 1]));
                                    twoDrob.setDenumerator(Integer.parseInt(array1[k + 3]));
                                    lastDrob.setPlus(oneDrob, twoDrob);
                                    array1[k] = "";
                                    array1[k + 1] = "";
                                    array1[k + 2] = "";
                                    array1[k + 3] = "";
                                    array1[k - 1] = String.valueOf(lastDrob.getDenumerator());
                                    array1[k - 2] = "/";
                                    array1[k - 3] = String.valueOf(lastDrob.getNumerator());
                                    y = y + 4;
                                }
                            } else {
                                if (array1[k + 2].equals("/") & array1[k - 2].equals("/")) {
                                    oneDrob.setNumerator(Integer.parseInt(array1[k - 3]));
                                    oneDrob.setDenumerator(Integer.parseInt(array1[k - 1]));
                                    twoDrob.setNumerator(Integer.parseInt(array1[k + 1]));
                                    twoDrob.setDenumerator(Integer.parseInt(array1[k + 3]));
                                    lastDrob.setMinus(oneDrob, twoDrob);
                                    array1[k] = "";
                                    array1[k + 1] = "";
                                    array1[k + 2] = "";
                                    array1[k + 3] = "";
                                    array1[k - 1] = String.valueOf(lastDrob.getDenumerator());
                                    array1[k - 2] = "/";
                                    array1[k - 3] = String.valueOf(lastDrob.getNumerator());
                                    y = y + 4;
                                }
                            }
                        }
                    }
                    array2 = new String[x - y];
                    u = 0;
                    for (int k = 0; k < x; k++) {
                        if (!array1[k].equals("")) {
                            array2[u] = array1[k];
                            u = u + 1;
                        }
                    }
                    array1 = array2;
                    System.out.println(Arrays.toString(array1));
                    System.out.println(Arrays.toString(array));
                    int gh = i1+array1.length;
                    System.out.println(gh);
                    u = 0;
                    for (; i1 < gh; i1++) {
                            array[i1] = array1[u];
                            u = u + 1;
                        }
                    System.out.println(Arrays.toString(array));
                    array2 = new String[g -num1+2];
                    u = 0;
                    for (int k = 0; k < g; k++) {
                        if (!array[k].equals("")) {
                            array2[u] = array[k];
                            u = u + 1;
                        }
                    }
                    array = array2;
                    g = array.length;
                    System.out.println(Arrays.toString(array));
                    }
                }
        }
    }
}