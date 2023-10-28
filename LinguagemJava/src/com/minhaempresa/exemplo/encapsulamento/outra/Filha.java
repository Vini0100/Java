package com.minhaempresa.exemplo.encapsulamento.outra;

import com.minhaempresa.exemplo.encapsulamento.Mae;

public class Filha extends Mae {
       public static void main (String [] args) {
              Filha filha = new Filha();
              System.out.println(filha.atributoStatic);
              System.out.println(filha.atributoPublic);
              //System.out.println(filha.atributoPrivate);//Erro porque é private
              System.out.println(filha.atributoProtected);
              //System.out.println(filha.atributoComModificadorPadrao);//Erro porque está em outro pacote
              System.out.println(filha.imprimeNomeDaClasse());
       }
}
