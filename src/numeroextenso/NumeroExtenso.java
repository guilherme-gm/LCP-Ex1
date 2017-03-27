/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numeroextenso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class NumeroExtenso {
    
    private static final String[][] TESTES =
    {
        { "1", "Um" },
        { "2", "Dois" },
        { "3", "Três" },
        { "4", "Quatro" },
        { "5", "Cinco" },
        { "6", "Seis" },
        { "7", "Sete" },
        { "8", "Oito" },
        { "9", "Nove" },
        { "10", "Dez" },
        { "11", "Onze" },
        { "12", "Doze" },
        { "13", "Treze" },
        { "14", "Quatorze" },
        { "15", "Quinze" },
        { "16", "Dezesseis" },
        { "17", "Dezessete" },
        { "18", "Dezoito" },
        { "19", "Dezenove" },
        { "20", "Vinte" },
        { "21", "Vinte e Um" },
        { "22", "Vinte e Dois" },
        { "30", "Trinta" },
        { "31", "Trinta e Um" },
        { "32", "Trinta e Dois" },
        { "40", "Quarenta" },
        { "43", "Quarenta e Três" },
        { "44", "Quarenta e Quatro" },
        { "50", "Cinquenta" },
        { "56", "Cinquenta e Seis" },
        { "57", "Cinquenta e Sete" },
        { "60", "Sessenta" },
        { "68", "Sessenta e Oito" },
        { "69", "Sessenta e Nove" },
        { "70", "Setenta" },
        { "75", "Setenta e Cinco" },
        { "80", "Oitenta" },
        { "90", "Noventa" },
        { "100", "Cem" },
        { "110", "Cento e Dez" },
        { "108", "Cento e Oito" },
        { "118", "Cento e Dezoito" },
        { "128", "Cento e Vinte e Oito" },
        { "200", "Duzentos" },
        { "400", "Quatrocentos" },
        { "600", "Seiscentos" },
        { "800", "Oitocentos" },
        { "999", "Novecentos e Noventa e Nove" },
        { "1000", "Mil" },
        { "4000", "Quatro Mil" },
        { "50500", "Cinquenta Mil e Quinhentos" },
        { "55555", "Cinquenta e Cinco Mil e Quinhentos e Cinquenta e Cinco" },
        { "100000", "Cem Mil" },
        { "1000500", "Um Milhão e Quinhentos" },
        { "2055555", "Dois Milhões e Cinquenta e Cinco Mil e Quinhentos e Cinquenta e Cinco" }
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//        System.out.println("Digite o numero");
//        float num = Float.parseFloat(lerString());
        
        
        
        // Parte inteira
        for (String[] t : TESTES) {
            if (!extenso(Float.parseFloat(t[0])).equals(t[1])) {
                System.out.println("Erro: " + t[0]);
            }
        }
//        if (!"Um".equals(extenso(1))) System.out.println("Erro: 1");
//        if (!"Dois".equals(extenso(2))) System.out.println("Erro: 2");
//        if (!"Três".equals(extenso(3))) System.out.println("Erro: 3");
//        if (!"Quatro".equals(extenso(4))) System.out.println("Erro: 4");
//        if (!"Cinco".equals(extenso(5))) System.out.println("Erro: 5");
//        if (!"Seis".equals(extenso(6))) System.out.println("Erro: 6");
//        if (!"Sete".equals(extenso(7))) System.out.println("Erro: 7");
//        if (!"Oito".equals(extenso(8))) System.out.println("Erro: 8");
//        if (!"Nove".equals(extenso(9))) System.out.println("Erro: 9");
//        if (!"Dez".equals(extenso(10))) System.out.println("Erro: 10");
//        if (!"Onze".equals(extenso(11))) System.out.println("Erro: 11");
//        if (!"Doze".equals(extenso(12))) System.out.println("Erro: 12");
//        if (!"Treze".equals(extenso(13))) System.out.println("Erro: 13");
//        if (!"Quatorze".equals(extenso(14))) System.out.println("Erro: 14");
//        if (!"Quinze".equals(extenso(15))) System.out.println("Erro: 15");
//        if (!"Dezesseis".equals(extenso(16))) System.out.println("Erro: 16");
//        if (!"Dezessete".equals(extenso(17))) System.out.println("Erro: 17");
//        if (!"Dezoito".equals(extenso(18))) System.out.println("Erro: 18");
//        if (!"Dezenove".equals(extenso(19))) System.out.println("Erro: 19");
//        if (!"Vinte".equals(extenso(20))) System.out.println("Erro: 20");
//        if (!"Vinte e Um".equals(extenso(21))) System.out.println("Erro: 21");
//        if (!"Vinte e Dois".equals(extenso(22))) System.out.println("Erro: 22");
//        if (!"Trinta".equals(extenso(30))) System.out.println("Erro: 30");
//        if (!"Trinta e Um".equals(extenso(31))) System.out.println("Erro: 31");
//        if (!"Trinta e Dois".equals(extenso(32))) System.out.println("Erro: 32");
//        if (!"Quarenta".equals(extenso(40))) System.out.println("Erro: 40");
//        if (!"Quarenta e Três".equals(extenso(43))) System.out.println("Erro: 43");
//        if (!"Quarenta e Quatro".equals(extenso(44))) System.out.println("Erro: 44");
//        if (!"Cinquenta".equals(extenso(50))) System.out.println("Erro: 50");
//        if (!"Cinquenta e Seis".equals(extenso(56))) System.out.println("Erro: 56");
//        if (!"Cinquenta e Sete".equals(extenso(57))) System.out.println("Erro: 57");
//        if (!"Sessenta".equals(extenso(60))) System.out.println("Erro: 60");
//        if (!"Sessenta e Oito".equals(extenso(68))) System.out.println("Erro: 68");
//        if (!"Sessenta e Nove".equals(extenso(69))) System.out.println("Erro: 69");
//        if (!"Setenta".equals(extenso(70))) System.out.println("Erro: 70");
//        if (!"Setenta e Cinco".equals(extenso(75))) System.out.println("Erro: 75");
//        if (!"Oitenta".equals(extenso(80))) System.out.println("Erro: 80");
//        if (!"Noventa".equals(extenso(90))) System.out.println("Erro: 90");
//        if (!"Cem".equals(extenso(100))) System.out.println("Erro: 100");
//        if (!"Cento e Dez".equals(extenso(110))) System.out.println("Erro: 110");
//        if (!"Cento e Oito".equals(extenso(108))) System.out.println("Erro: 108");;
//        if (!"Cento e Dezoito".equals(extenso(118))) System.out.println("Erro: 118");
//        if (!"Cento e Vinte e Oito".equals(extenso(128))) System.out.println("Erro: 128");
//        if (!"Duzentos".equals(extenso(200))) System.out.println("Erro: 200");
//        if (!"Quatrocentos".equals(extenso(400))) System.out.println("Erro: 400");
//        if (!"Seiscentos".equals(extenso(600))) System.out.println("Erro: 600");
//        if (!"Oitocentos".equals(extenso(800))) System.out.println("Erro: 800");
//        if (!"Novecentos e Noventa e Nove".equals(extenso(999))) System.out.println("Erro: 999");;
//        if (!"Mil".equals(extenso(1000))) System.out.println("Erro: 1000");
//        if (!"Quatro Mil".equals(extenso(4000))) System.out.println("Erro: 4000");
//        if (!"Cinquenta Mil e Quinhentos".equals(extenso(50500))) System.out.println("Erro: 50500");;
//        if (!"Cinquenta e Cinco Mil e Quinhentos e Cinquenta e Cinco".equals(extenso(55555))) System.out.println("Erro: 55555");
//        if (!"Cem Mil".equals(extenso(100000))) System.out.println("Erro: 100000");
//        if (!"Um Milhão e Quinhentos".equals(extenso(1000500))) System.out.println("Erro: 1000500");;
//        if (!"Dois Milhões e Cinquenta e Cinco Mil e Quinhentos e Cinquenta e Cinco".equals(extenso(2055555))) System.out.println("Erro: 2055555");
        //if (!"Cem Mil".equals(extenso(100000))) System.out.println("Erro: 100000");
    }
    
    private static final String[] unidades = new String[]
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
    
    private static final String[] dezenas = new String[]
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
    
    private static final String[] dezes = new String[]
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
    
    private static final String[] centenas = new String[]
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
    
    private static final String[] milharesSing = new String[]
    {
        "Zero",
        "Mil",
        "Milhão",
        "Bilhão"
    };
    
    private static final String[] milharesPlur = new String[]
    {
        "Zero",
        "Mil,",
        "Milhões,",
        "Bilhões,"
    };
    
    public static String extenso(float num) {
        int inteiro = (int) (num / 1);
        int decimal = (int) ((num % 1) * 100);
        
        StringBuilder str = new StringBuilder();
        List<String> inteiroStr = new ArrayList<>();
        
        if (num == 0) {
            return "Zero";
        }
        
        if (inteiro > 2000000) {
            inteiroStr.add(getNumero(inteiro / 1000000) + " Milhões");
            inteiro %= 1000000;
        } else if (inteiro > 1000000) {
            inteiroStr.add("Um Milhão");
            inteiro %= 1000000;
        }
        
        if (inteiro > 1000) {
            inteiroStr.add(getNumero(inteiro / 1000) + " Mil");
            inteiro %= 1000;
        } else if (inteiro == 1000) {
            inteiroStr.add("Mil");
            inteiro %= 1000;
        }
        
        inteiroStr.add(getNumero(inteiro));
        
        str.append(inteiroStr.get(0));
        inteiroStr.remove(0);
        for (String v : inteiroStr) {
            if (!v.equals("")) {
                str.append(" e ").append(v);
            }
        }
        
//        System.out.println(str.toString());
        return str.toString();
    }
    
    public static String getNumero(int num) {
        StringBuilder str = new StringBuilder();
        List<String> inteiroStr = new ArrayList<>();
        
        if (num == 0) {
            return "";
        }
        
        if (num == 100) {
            inteiroStr.add("Cem");
            num %= 100;
        } else if (num > 100) {
            inteiroStr.add(centenas[num / 100]);
            num %= 100;
        }
        
        if (num >= 20) {
            inteiroStr.add(dezenas[num / 10]);
            num %= 10;
        }
        if (num >= 10) {
            inteiroStr.add(dezes[num % 10]);
            num %= 10;
        } else if (num > 0) {
            inteiroStr.add(unidades[num]);
            num = 0;
        }
        
        str.append(inteiroStr.get(0));
        inteiroStr.remove(0);
        for (String v : inteiroStr) {
            str.append(" e ").append(v);
        }
        
//        System.out.println(str.toString());
        return str.toString();
    }
    
    public static String lerString() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }
    
}
 