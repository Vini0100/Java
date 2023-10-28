package Logic;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> responsaveisAlunos = new ArrayList<>(Arrays.asList("Jose", "Maria"));

        System.out.println(responsaveisAlunos.get(0));

        responsaveisAlunos = adicionaResponsavel(responsaveisAlunos, "Danivel");
        responsaveisAlunos = adicionaResponsavel(responsaveisAlunos, "Vini");
        responsaveisAlunos = editaResponsavel(responsaveisAlunos, "Edso", 1);
        responsaveisAlunos = removeResponsavel(responsaveisAlunos);
        responsaveisAlunos = ordenaResponsavel(responsaveisAlunos);
        exibeResponsaveis(responsaveisAlunos);

        System.out.println(Arrays.toString(responsaveisAlunos.toArray()));
    }

    public static void exibeResponsaveis(List<String> responsaveisAlunos){
        for (int i = 0; i < responsaveisAlunos.size(); i++){
            System.out.println(i + ") " + responsaveisAlunos.get(i));
        }
    }
    public static List<String> adicionaResponsavel(List<String> responsaveisAlunos, String nomeResponsavel){
        responsaveisAlunos.add(nomeResponsavel);
        return responsaveisAlunos;
    }
    public static List<String> editaResponsavel(List<String> responsaveisAlunos, String nomeResponsavel, int index/*Local da lista onde o responsável está*/){
        responsaveisAlunos.set(index, nomeResponsavel);
        return responsaveisAlunos;
    }
    public static List<String> removeResponsavel(List<String> responsaveisAlunos){
        responsaveisAlunos.remove(responsaveisAlunos.size() -1);
        return responsaveisAlunos;
    }
    public static List<String> ordenaResponsavel(List<String> responsaveisAlunos){
        responsaveisAlunos.sort(null);
        return responsaveisAlunos;
    }
}
