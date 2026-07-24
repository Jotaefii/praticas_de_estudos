package H_TrabalhandoComArquivos.anotacoes_tarefa;

import H_TrabalhandoComArquivos.anotacoes_tarefa.entities.Tarefa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

// Usando Path para criar pasta e arquivo
// Files.writeString() para a escrita
// Lis<String> nome = Files.readAllLines() para leitura

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Path pasta = Path.of("out");
        Path arquivo = pasta.resolve("tarefas.txt");

        if (!Files.exists(arquivo)){
            Files.createFile(arquivo);
        }

        System.out.print("Titula da tarefa: ");
        String titulo = sc.nextLine();
        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        Tarefa tarefa = new Tarefa(titulo, descricao);
        String cadastro = tarefa.getTituloDaTarefa() + "\n" + "- " + tarefa.getDescricao() + "\n";

        try {
            Files.writeString(arquivo, cadastro, StandardOpenOption.APPEND);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
