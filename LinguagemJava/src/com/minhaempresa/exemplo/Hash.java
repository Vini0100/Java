package com.minhaempresa.exemplo;

import com.minhaempresa.exemplo.encapsulamento.ContaCorrente;
import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String [] args) {
    /*
        HashMap utilizado quando queremos recuperar determinado dado baseado em uma chave valor.
        Não admite repetição do objeto chave.
        O acesso, inserção e remoção dos elementos são rápidos

        Existem outras implementações de Map sendo que HasMap é a mais rápidas das três:
            - LinkedHasMap de velocidade de acesso intermediária quando comparada com as três aqui mencionadas;
            - TreeMap é a mais lenta e é ordenada pelo compareTo do objeto ou Comparator
    */

        Map<String, ContaCorrente> map = new HashMap();
        //map.put("001878788-8", new ContaCorrente(300.00));
        //map.put("09988h760-5", new ContaCorrente(8500.00));
        //ap.put("9999i9000-4", new ContaCorrente(7700.00));

        ContaCorrente contaCorrente = map.get("001878788-8");

        System.out.println(contaCorrente.saldo());

        System.out.println("--------------------");

        for(ContaCorrente conta : map.values()) {
            System.out.println(conta.saldo());
        }

        for(String key : map.keySet()) {
            ContaCorrente conta = map.get(key);
            System.out.println(conta.saldo());
        }

        map.remove("9999i9000-4");
        map.clear();//remove todos os elementos
        map.size();//retona a quantidade de elementos
   }
}
