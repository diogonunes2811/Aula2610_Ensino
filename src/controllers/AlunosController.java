/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import banco.BancoDadosInstituicao;
import models.Aluno;

/**
 *
 * @author 1616625
 */
public class AlunosController {
    
    public static void adicionarAluno (int codigo, String nome, String cpf){
        Aluno a = new Aluno();
        a.setCodigo(codigo);
        a.setNome(nome);
        a.setCpf(cpf);
        
        BancoDadosInstituicao.getTabelaAluno().add(a);
    }
    
    public static Aluno buscarPorCodigo (int codigo){
        for (Aluno a: BancoDadosInstituicao.getTabelaAluno()){
            if (codigo == a.getCodigo()){
                return a;
            }
        }    
        
        return null;    
    }
        
}
