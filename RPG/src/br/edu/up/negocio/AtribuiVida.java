package br.edu.up.negocio;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.entidades.Equipe;
import br.edu.up.entidades.Jogador;
import br.edu.up.entidades.Monstro;

public class AtribuiVida {

    public static Monstro atribuiVida(Monstro objmonstro, Equipe equipe, int opcao) {
        List<Jogador> jogadoresEquipe = new ArrayList<Jogador>();
        int auxNumJogadores;
        Monstro monstro = objmonstro;
        jogadoresEquipe = equipe.getJogadores();
        auxNumJogadores = jogadoresEquipe.size();
        if (opcao == 1) {
            if (auxNumJogadores < 2) {
                monstro.setVida(50);
            } else if (auxNumJogadores <= 3) {
                monstro.setVida(100);
            } else if (auxNumJogadores <= 5) {
                monstro.setVida(150);
            } else if (auxNumJogadores <= 8) {
                monstro.setVida(200);
            } else if (auxNumJogadores > 8) {
                monstro.setVida(250);
            }
        } else if (opcao == 2) {
            if (auxNumJogadores < 2) {
                monstro.setVida(50);
            } else if (auxNumJogadores <= 3) {
                monstro.setVida(100);
            } else if (auxNumJogadores <= 5) {
                monstro.setVida(125);
            } else if (auxNumJogadores <= 8) {
                monstro.setVida(150);
            } else if (auxNumJogadores > 8) {
                monstro.setVida(175);
            }
        } else if (opcao == 3) {
            if (auxNumJogadores < 2) {
                monstro.setVida(50);
            } else if(auxNumJogadores <= 3) {
                monstro.setVida(75);
            } else if (auxNumJogadores <= 5) {
                monstro.setVida(100);
            } else if (auxNumJogadores <= 8) {
                monstro.setVida(125);
            } else if (auxNumJogadores > 8) {
                monstro.setVida(150);
            }
        }

        return monstro;
    }
}
