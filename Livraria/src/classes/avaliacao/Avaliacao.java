package classes.avaliacao;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

public class Avaliacao {
    private double rating;
    private String nome;
    private String feedback;
    private LocalDateTime avaliacao = LocalDateTime.now();


//ONDE CRIA SALVAR A DATA E MOSTRAAVALIAÇÕES MOSTRAR A DATA

    // GETTERS & SETTERS

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public LocalDateTime getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(LocalDateTime avaliacao) {
        this.avaliacao = avaliacao;
    }
}
