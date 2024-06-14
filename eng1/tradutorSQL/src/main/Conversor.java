package main;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.localai.LocalAiChatModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Conversor {
    public Conversor() {
        iniciarServidor();
    }

    public String converter(String input) {
        ChatLanguageModel model = LocalAiChatModel.builder()
                .baseUrl("http://localhost:1234/v1")
                .modelName("TheBloke/nsql-llama-2-7B-GGUF")
                .temperature(0.9)
                .build();

        return model.generate(input);
    }

    private void executarComando(String comando) {
        ProcessBuilder processBuilder = new ProcessBuilder(comando.split(" "));
        try {
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while (reader.readLine() != null) {}
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void iniciarServidor() {
        executarComando("cmd.exe /c lms server start");
    }

    public void desligarServidor() {
        executarComando("cmd.exe /c lms server stop");
    }
}

    

