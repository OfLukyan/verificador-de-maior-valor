public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        int MaiorValor = max(a,b,c);

        MostrarValor(MaiorValor);
    }
    public static int max(int x, int y, int z) {
        int xyz;

        if (x > y && x > z) {
            xyz = x;
        } else if (y > z && y > x) {
            xyz = y;
        } else {
            xyz = z;
        }
        return xyz;

    }
    public static void MostrarValor(int value) {
        System.out.println("O maior valor é: " + value);
    }
}
