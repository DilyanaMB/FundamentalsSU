public class Pokemon {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int pokemonPower = Integer.parseInt(sc.nextLine());
        int pokemonDistance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        int pokedTargets = 0;
        int originalPower = pokemonPower;

        while (pokemonPower >= pokemonDistance) {
            pokemonPower -= pokemonDistance;
            pokedTargets++;
            if (pokemonPower == originalPower / 2 && exhaustionFactor != 0) {
                pokemonPower /= exhaustionFactor;
            }
        }
        System.out.println(pokemonPower);
        System.out.println(pokedTargets);
    }
}
