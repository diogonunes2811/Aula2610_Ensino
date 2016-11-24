/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.List;
import models.Aluno;

/**
 *
 * @author 1616625
 */
public class BancoDadosInstituicao {
    
    private static List<Aluno> tabelaAluno;

    public static List<Aluno> getTabelaAluno() {
        return tabelaAluno;
    }
    
    public static void inicializarBanco(){
        tabelaAluno = new ArrayList<Aluno>();
    }
}
