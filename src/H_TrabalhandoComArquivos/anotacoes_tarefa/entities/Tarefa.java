package H_TrabalhandoComArquivos.anotacoes_tarefa.entities;

public class Tarefa {
    private String tituloDaTarefa;
    private String descricao;

    public Tarefa(String tituloDaTarefa, String descricao) {
        this.tituloDaTarefa = tituloDaTarefa;
        this.descricao = descricao;
    }

    public String getTituloDaTarefa() {
        return tituloDaTarefa;
    }

    public void setTituloDaTarefa(String tituloDaTarefa) {
        this.tituloDaTarefa = tituloDaTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
