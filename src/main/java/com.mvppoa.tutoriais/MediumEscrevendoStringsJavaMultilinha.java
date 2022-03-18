package com.mvppoa.tutoriais;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MediumEscrevendoStringsJavaMultilinha {

    /**
     * O separador de linhas pode ser facilmente obtido através das propriedades de sistema
     */
    private static final String SEPARADOR_DE_LINHAS = System.getProperty("line.separator");

    public static void main(String[] args) {
        blocoDeTexto();
        concatenacaoPorConcat();
        concatenacaoOperadorMais();
        juncaoDeStrings();
        testeStringBuilder();
        testeStringWriter();
        testeGoogleGuava();
    }

    /**
     * Exemplo de código utilizando "text blocks", presente desde a versão 15.
     */
    public static void blocoDeTexto() {
        System.out.println("""
                Olá
                Sou uma string com várias linhas.
                Esse é um adeus a concatenação utilizando milhares de +
                """);
    }

    /**
     * Concatenacão utilizando "".concat()
     */
    public static void concatenacaoPorConcat() {
        System.out.println("A vida"
                .concat(SEPARADOR_DE_LINHAS)
                .concat("não é")
                .concat(SEPARADOR_DE_LINHAS)
                .concat("um moranguinho!")
                .concat(SEPARADOR_DE_LINHAS));
    }

    /**
     * Concatenacão utilizando "String"+"String"
     */
    public static void concatenacaoOperadorMais() {
        System.out.println("Supletivo"
                + SEPARADOR_DE_LINHAS
                + "supletivo"
                + SEPARADOR_DE_LINHAS
                + "Supletivo."
                + SEPARADOR_DE_LINHAS);
    }


    /**
     * Concatenacão utilizando String.join()
     */
    public static void juncaoDeStrings() {
        System.out.println(String.join(SEPARADOR_DE_LINHAS,
                "all", "your", "base", "are", "belong", "to", "us"));
    }

    /**
     * Concatenacão utilizando StringBuilder
     */
    public static void testeStringBuilder() {
        System.out.println(new StringBuilder(SEPARADOR_DE_LINHAS)
                .append("A Vaca")
                .append(SEPARADOR_DE_LINHAS)
                .append("foi pro brejo.")
                .append(SEPARADOR_DE_LINHAS));
    }

    /**
     * Concatenacão utilizando StringWriter
     */
    public static void testeStringWriter() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("Olá");
        printWriter.println("Enfermeira");
        System.out.println(stringWriter.toString());
    }

    /**
     * Concatenação utilizando bibliotecas externas
     */
    public static void testeGoogleGuava() {
        System.out.println(Joiner.on(SEPARADOR_DE_LINHAS).join(
                ImmutableList.of("Teste",
                        "Google",
                        "Guava")));
    }

    /**
     * Carregar string de arquivo
     */
    public String carregarStringDeArquivo() throws IOException {
        return new String(Files.readAllBytes(
                Paths.get("src/main/resources/stringLonga.txt")));
    }
}
