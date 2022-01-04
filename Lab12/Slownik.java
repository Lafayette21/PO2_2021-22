import java.util.*;
import java.io.*;
import java.time.format.TextStyle;

public class Slownik {
    private Vector<Haslo> vect;
    private File f;

    public Slownik() {
        vect = new Vector<Haslo>(0);
        try {
            f = new File("slownik.dat");
            Scanner scan = new Scanner(f);
            String[] text;
            while (scan.hasNext()) {
                text = scan.nextLine().split(" ");
                String w1 = text[0];
                String w2 = text[1];
                vect.addElement(new Haslo(w1, w2));
            }
            scan.close();
        } catch (Exception e) {
            System.out.println("Nie znaleziono pliku slownik.dat");
        }
    }

    public void addWords(Haslo h1) {
        vect.addElement(h1);
        f = new File("slownik.dat");
        if (f.canWrite()) {
            try {
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(h1.toString() + "\n");
                bw.close();
            } catch (IOException e) {
            }

        }
    }

    public void delWords(String word) {
        Haslo h = null;
        for (Haslo w : vect) {
            if (w.isPresent(word)) {
                h = w;
            }
        }
        if (h != null) {
            vect.remove(h);
            f = new File("slownik.dat");
            try {
                FileWriter fw = new FileWriter(f, false);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Haslo r : vect) {
                    bw.write(r.toString() + "\n");
                }
                bw.close();

            } catch (IOException e) {
            } catch (NoSuchElementException e) {
                System.out.println("cos sie dzieje");
            }
        }
    }

    public boolean exists(Haslo el) {
        for (Haslo h : vect) {
            if (h.equals(el)) {
                return true;
            }
        }
        return false;
    }

    public void wypiszElement(String el) {
        Haslo pomoc = null;
        for (Haslo help : vect) {
            if (help.isPresent(el)) {
                pomoc = help;
                break;
            }
        }
        if (pomoc != null) {
            if (el.equals(pomoc.english)) {
                System.out.println(pomoc.polish);
            } else {
                System.out.println(pomoc.english);
            }
        } else {
            System.out.println("Nie znaleziono w słowniku");
        }
    }

    @Override
    public String toString() {
        var help = new StringBuilder();
        for (Haslo h : vect) {
            help.append(h.toString() + "\n");
        }
        return help.toString();
    }

}