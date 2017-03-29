package numeroextenso;

import java.util.Scanner;

/**
 * Classe Principal
 * @authors
 *      Guilherme Guiguer Menaldo
 *      Jhenifer Marques dos Santos
 *      Raphael Espindola Trench
 * - Grupo: Gambiarra
 */
public class NumeroExtenso {
//    Testes
//    private static final String[][] TESTES =
//    {
//        { "0", "Zero" },
//        { "1", "Um Reais" },
//        { "2", "Dois Reais" },
//        { "3", "Três Reais" },
//        { "4", "Quatro Reais" },
//        { "5", "Cinco Reais" },
//        { "6", "Seis Reais" },
//        { "7", "Sete Reais" },
//        { "8", "Oito Reais" },
//        { "9", "Nove Reais" },
//        { "10", "Dez Reais" },
//        { "11", "Onze Reais" },
//        { "12", "Doze Reais" },
//        { "13", "Treze Reais" },
//        { "14", "Quatorze Reais" },
//        { "15", "Quinze Reais" },
//        { "16", "Dezesseis Reais" },
//        { "17", "Dezessete Reais" },
//        { "18", "Dezoito Reais" },
//        { "19", "Dezenove Reais" },
//        { "20", "Vinte Reais" },
//        { "21", "Vinte e Um Reais" },
//        { "22", "Vinte e Dois Reais" },
//        { "30", "Trinta Reais" },
//        { "31", "Trinta e Um Reais" },
//        { "32", "Trinta e Dois Reais" },
//        { "40", "Quarenta Reais" },
//        { "43", "Quarenta e Três Reais" },
//        { "44", "Quarenta e Quatro Reais" },
//        { "50", "Cinquenta Reais" },
//        { "56", "Cinquenta e Seis Reais" },
//        { "57", "Cinquenta e Sete Reais" },
//        { "60", "Sessenta Reais" },
//        { "68", "Sessenta e Oito Reais" },
//        { "69", "Sessenta e Nove Reais" },
//        { "70", "Setenta Reais" },
//        { "75", "Setenta e Cinco Reais" },
//        { "80", "Oitenta Reais" },
//        { "90", "Noventa Reais" },
//        { "100", "Cem Reais" },
//        { "110", "Cento e Dez Reais" },
//        { "108", "Cento e Oito Reais" },
//        { "118", "Cento e Dezoito Reais" },
//        { "128", "Cento e Vinte e Oito Reais" },
//        { "200", "Duzentos Reais" },
//        { "400", "Quatrocentos Reais" },
//        { "600", "Seiscentos Reais" },
//        { "800", "Oitocentos Reais" },
//        { "999", "Novecentos e Noventa e Nove Reais" },
//        { "1000", "Mil Reais" },
//        { "4000", "Quatro Mil Reais" },
//        { "50500", "Cinquenta Mil e Quinhentos Reais" },
//        { "55555", "Cinquenta e Cinco Mil e Quinhentos e Cinquenta e Cinco Reais" },
//        { "100000", "Cem Mil Reais" },
//        { "1000500", "Um Milhão e Quinhentos Reais" },
//        { "2055555", "Dois Milhões e Cinquenta e Cinco Mil e Quinhentos e Cinquenta e Cinco Reais" },
//        { "1000000000", "Um Bilhão Reais" },
//        { "1000000500", "Um Bilhão e Quinhentos Reais" },
//        { "1100000000", "Um Bilhão e Cem Milhões Reais" },
//        { "1000100000", "Um Bilhão e Cem Mil Reais" },
//        { "1000001000", "Um Bilhão e Mil Reais" },
//        { "100.20", "Cem Reais e Vinte Centavos" }
//    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Digite o numero");
        double num = lerDouble();
        System.out.println(Numero.extenso(num));

//        for (String[] t : TESTES) {
//            double num = Double.parseDouble(t[0]);
//            if (!Numero.extenso(num).equals(t[1])) {
//                System.out.println("Erro: " + t[0]);
//            }
//        }
    }
    
    /**
     * Retorna o próximo double no input
     * @return 
     */
    public static double lerDouble() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }
    
}
 