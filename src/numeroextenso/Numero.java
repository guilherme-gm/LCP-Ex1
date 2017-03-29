package numeroextenso;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe para converter números em string
 * @authors
 *      Guilherme Guiguer Menaldo
 *      Jhenifer Marques dos Santos
 *      Raphael Espindola Trench
 * - Grupo: Gambiarra
 */
public class Numero {
    private static final String[] UNIDADES = new String[]
    {
        "Zero",
        "Um",
        "Dois",
        "Três",
        "Quatro",
        "Cinco",
        "Seis",
        "Sete",
        "Oito",
        "Nove"
    };
    
    private static final String[] DEZENAS = new String[]
    {
        "Zero", // Placeholder
        "Dez",  // Placeholder
        "Vinte",
        "Trinta",
        "Quarenta",
        "Cinquenta",
        "Sessenta",
        "Setenta",
        "Oitenta",
        "Noventa",
    };
    
    private static final String[] DEZES = new String[]
    {
        "Dez",
        "Onze",
        "Doze",
        "Treze",
        "Quatorze",
        "Quinze",
        "Dezesseis",
        "Dezessete",
        "Dezoito",
        "Dezenove"
    };
    
    private static final String[] CENTENAS = new String[]
    {
        "Zero",
        "Cento",
        "Duzentos",
        "Trezentos",
        "Quatrocentos",
        "Quinhentos",
        "Seiscentos",
        "Setecentos",
        "Oitocentos",
        "Novecentos",
    };
    
    /**
     * Retorna o número convertido para String
     * @param num
     * @return 
     */
    public static String extenso(double num) {
        // Separa reais de centavos
        int inteiro = (int) (num / 1);
        int decimal = (int) ((num % 1) * 100);
        
        StringBuilder str = new StringBuilder();
        List<String> inteiroStr = new ArrayList<>();
        
        // Se 0, retorna.
        if (num == 0) {
            return "Zero";
        }
        
        // Bilhões
        if (inteiro >= 2000000000) {
            // Se >= 2bi, mostra valor em Bilh[ões]
            inteiroStr.add(getNumero(inteiro / 1000000000) + " Bilhões");
            inteiro %= 1000000000;
        } else if (inteiro >= 1000000000) {
            // Se não, Bilh[ão]
            inteiroStr.add("Um Bilhão");
            inteiro %= 1000000000;
        }
        
        // Milhões
        if (inteiro >= 2000000) {
            inteiroStr.add(getNumero(inteiro / 1000000) + " Milhões");
            inteiro %= 1000000;
        } else if (inteiro >= 1000000) {
            inteiroStr.add("Um Milhão");
            inteiro %= 1000000;
        }
        
        // Mil
        if (inteiro >= 2000) {
            inteiroStr.add(getNumero(inteiro / 1000) + " Mil");
            inteiro %= 1000;
        } else if (inteiro >= 1000) {
            inteiroStr.add("Mil");
            inteiro %= 1000;
        }
        
        // Valor menor que 1000
        inteiroStr.add(getNumero(inteiro));
        
        // Concatena as pares preparadas
        
        // Primeira parte (sem prefixo "e")
        str.append(inteiroStr.get(0));
        inteiroStr.remove(0);
        
        // Demais partes (com prefixo "e")
        for (String v : inteiroStr) {
            if (!v.equals("")) {
                str.append(" e ").append(v);
            }
        }
        
        // Adiciona o Reais
        str.append(" Reais");
        
        // Se existe centavos, adiciona
        if (decimal > 0) {
            str.append(" e ").append(getNumero(decimal)).append(" Centavos");
        }
        
        return str.toString();
    }
    
    /**
     * Retorna o número (até 999) em string
     * @param num
     * @return 
     */
    private static String getNumero(int num) {
        StringBuilder str = new StringBuilder();
        List<String> inteiroStr = new ArrayList<>();
        
        // Se o número é 0, retorna nada
        if (num == 0) {
            return "";
        }
        
        // Centenas, possui um tratamento especial para o "Cem"
        if (num == 100) {
            inteiroStr.add("Cem");
            num %= 100;
        } else if (num > 100) {
            inteiroStr.add(CENTENAS[num / 100]);
            num %= 100;
        }
        
        // Dezenas, possui tratamento especial para 0-9, 10-19 e >= 20
        if (num >= 20) {
            inteiroStr.add(DEZENAS[num / 10]);
            num %= 10;
        }
        if (num >= 10) {
            inteiroStr.add(DEZES[num % 10]);
            num %= 10;
        } else if (num > 0) {
            inteiroStr.add(UNIDADES[num]);
        }
        
        // Prepara a string
        str.append(inteiroStr.get(0));
        inteiroStr.remove(0);
        for (String v : inteiroStr) {
            str.append(" e ").append(v);
        }
        
        return str.toString();
    }
}
