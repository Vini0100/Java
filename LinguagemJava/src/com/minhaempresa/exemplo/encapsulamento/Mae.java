package com.minhaempresa.exemplo.encapsulamento;

public class Mae {
    public static String atributoStatic = "atributoStatic";
    public String atributoPublic = "atributoPublic";
    private String atributoPrivate = "atributoPrivate";
    protected String atributoProtected = "atributoProtected";
    String atributoComModificadorPadrao = "atributoComModificadorPadrao";

    public String imprimeNomeDaClasse() {
        return "Mae";
    }
}
