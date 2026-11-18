package PBO4;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> nilaiNama = new Pair<>(90, "Andi");
        System.out.println("Pasangan awal: " + nilaiNama);
        Pair<String, Integer> nilaiNamaSwapped = nilaiNama.swap();
        System.out.println("Setelah swap: " + nilaiNamaSwapped);

        Pair<Double, Boolean> ukuranAktif = new Pair<>(3.14, true);
        System.out.println("Pasangan awal: " + ukuranAktif);
        Pair<Boolean, Double> ukuranAktifSwapped = ukuranAktif.swap();
        System.out.println("Setelah swap: " + ukuranAktifSwapped);
    }
}

class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

