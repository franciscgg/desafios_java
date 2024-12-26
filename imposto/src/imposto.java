import java.util.Locale;
import java.util.Scanner;

public class imposto {
    public static void main(String[] agrs){
        double anualSalario, anualPrestacao, anualGanhoCapital, gastoMed, gastoEdu,rendaMensal,rendaPrestacao,rendaCapital,impostoSalario;

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
        rendaPrestacao = anualPrestacao / 12;
        rendaCapital = anualGanhoCapital / 12;

        if(rendaMensal <= 3000.00){
            impostoSalario = 0.00; //Isento
        }

    }
}