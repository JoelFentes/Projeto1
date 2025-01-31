package Main.Model;

import java.io.*;

public class Sala {
    private static final String bdSalas = "C:\\Users\\joelf\\IdeaProjects\\ProjetoJavaEBD\\BD_SALAS.txt";
    private static int proximoId = lerUltimoID();
    private int id;
    private String descricao;
    private String professorResponsavel;
    private int idadeMinima;
    private int idadeMaxima;

    public Sala(String descricao, String professorResponsavel, int idadeMinima, int idadeMaxima) {
        this.id = proximoId++;
        this.descricao = descricao;
        this.professorResponsavel = professorResponsavel;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public int getIdadeMinimaSala() {
        return idadeMinima;
    }

    public void setIdadeMinimaSala(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMaximaSala() {
        return idadeMaxima;
    }

    public void setIdadeMaximaSala(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    private static int lerUltimoID() {
        int ultimoID = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(bdSalas))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] data = linha.split(";");
                ultimoID = Integer.parseInt(data[0]);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao ler o último ID do banco de dados das salas.");
        }
        return ultimoID + 1;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Descrição: %s, Professor: %s, Idade Mínima: %d, Idade Máxima: %d",
                id, descricao, professorResponsavel, idadeMinima, idadeMaxima);
    }


}
