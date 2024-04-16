public class Main {
    public static void main(String[] args) {
        Continente americaDoSul = new Continente("América do Sul");

        Pais brasil = new Pais("Brasil", 8511965, 211049527);
        Pais argentina = new Pais("Argentina", 2780400, 45195774);
        Pais chile = new Pais("Chile", 756102, 19116209);

        americaDoSul.addPais(brasil);
        americaDoSul.addPais(argentina);
        americaDoSul.addPais(chile);

        System.out.println("Dimensão total do continente: " + americaDoSul.getDimensaoTotal());
        System.out.println("População total do continente: " + americaDoSul.getPopulacaoTotal());
        System.out.println("Densidade populacional do continente: " + americaDoSul.getDensidadePopulacional());
        System.out.println("País com maior população no continente: " + americaDoSul.getPaisMaiorPopulacao().getNome());
        System.out.println("País com menor população no continente: " + americaDoSul.getPaisMenorPopulacao().getNome());
        System.out.println("País de maior dimensão territorial no continente: " + americaDoSul.getPaisMaiorDimensao().getNome());
        System.out.println("País de menor dimensão territorial no continente: " + americaDoSul.getPaisMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país: " + americaDoSul.getRazaoTerritorial());
    }
}
