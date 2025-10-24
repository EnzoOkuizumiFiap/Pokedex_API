package br.com.fiap.bo;

import br.com.fiap.dao.PokemonDAO;
import br.com.fiap.to.PokemonTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class PokemonBO {
    private PokemonDAO pokemonDAO;

    public ArrayList<PokemonTO> findAll() {
        pokemonDAO = new PokemonDAO();
        //Aqui implementamos a regra de negócio
        return pokemonDAO.findAll();
    }

    public PokemonTO findByCodigo(Long codigo) {
        pokemonDAO = new PokemonDAO();
        //Aqui implementamos a regra de negócio
        return pokemonDAO.findByCodigo(codigo);
    }

    public PokemonTO save(PokemonTO pokemon) {
        pokemonDAO = new PokemonDAO();
        //Regra de Negócio: Verificando se o pokemon foi capturado no passado
        //if (pokemon.getDataDaCaptura().isAfter(LocalDate.now())) {
        //    return null;
        //}
        return pokemonDAO.save(pokemon);
    }

    public boolean delete(long codigo) {
        pokemonDAO = new PokemonDAO();
        //Aqui se implementa a regra de negócio
        return pokemonDAO.delete(codigo);
    }

    public PokemonTO update(PokemonTO pokemon) {
        pokemonDAO = new PokemonDAO();
        //Aqui se implementa a regra de negócio
        return pokemonDAO.update(pokemon);
    }
}
