import java.util.Locale;
import java.util.Scanner;

public class imposto {
    public static void main(String[] agrs){
        double anualSalario, anualPrestacao, anualGanhoCapital, gastoMed, gastoEdu,rendaMensal,impostoSalario = 0.00,impostoServ, impostoCap,gastosTotal,rendaTotal,maxDedutivel;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        anualSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        anualPrestacao = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        anualGanhoCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        gastoMed = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        gastoEdu = sc.nextDouble();

        rendaMensal = anualSalario / 12;

        if(rendaMensal <= 3000.00){
            impostoSalario = 0.00;
        }else if(rendaMensal > 3000.00 && rendaMensal <= 5000.00) {
            impostoSalario = anualSalario * 0.10;
        }else{
            impostoSalario = anualSalario * 0.20;
        }

        impostoServ = anualPrestacao  * 0.15;
        impostoCap = anualGanhoCapital * 0.20;

        gastosTotal = gastoMed + gastoEdu;
        rendaTotal = impostoSalario + impostoServ + impostoCap;
        maxDedutivel = rendaTotal * 0.30;

        System.out.printf("RELATÓRIO DE IMPOSTO DE RENDA%n" +
                "CONSOLIDADO DE RENDA: %n" +
                "Imposto sobre salário: R$%.2f%n" +
                "Imposto sobre serviços: R$%.2f%n" +
                "Imposto sobre ganho de capital: R$%.2f%n" +
                "DEDUÇÕES:%n" +
                "Máximo dedutível: R$%.2f%n" +
                "Gastos dedutíveis: R$%.2f%n" +
                "RESUMO:%n" +
                "Imposto bruto total: R$%.2f%n" +
                "Abatimento: R$%.2f%n" +
                "Imposto devido: ", impostoSalario,impostoServ,impostoCap,maxDedutivel,gastosTotal,rendaTotal,gastosTotal);

    }
}