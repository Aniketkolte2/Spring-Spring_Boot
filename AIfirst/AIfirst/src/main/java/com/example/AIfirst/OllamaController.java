package com.example.AIfirst;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class OllamaController {

    private ChatClient chatClient;


    public  OllamaController(OllamaChatModel chatModel){
        this.chatClient =ChatClient.create(chatModel);
    }

    @GetMapping("/{message}")
    public ResponseEntity<String> getanswer(@PathVariable String message){
        String response = chatClient
                .prompt(message)
                .call().content();
        return ResponseEntity.ok(response);

    }
}
