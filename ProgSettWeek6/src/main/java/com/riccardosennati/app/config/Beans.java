package com.riccardosennati.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.riccardosennati.app.entities.Dispositivo;
import com.riccardosennati.app.entities.Ruolo;
import com.riccardosennati.app.entities.StatoDispositivo;
import com.riccardosennati.app.entities.TipoDispositivo;
import com.riccardosennati.app.entities.TipoRuolo;
import com.riccardosennati.app.entities.Utente;

@Configuration
public class Beans {

	@Bean
	@Scope("prototype")
	public Utente utente(String nome, String cognome, String email, String password, String username) {
		
		return Utente.builder()
				.nome(nome)
				.cognome(cognome)
				.email(email)
				.password(password)
				.username(username)
				.attivo(true)
				.build();	
	}
	
	@Bean
    @Scope("prototype")
    public Ruolo ruolo(TipoRuolo rt) {
        return Ruolo.builder()
                .tipoRuolo(rt)
                .build();
    }
	
	@Bean
    @Scope("prototype")
    public Dispositivo dispositivo(TipoDispositivo td, StatoDispositivo sd) {
        return Dispositivo.builder()
                .tipoDispositivo(td)
                .stato(sd)
                .build();
    }
}
