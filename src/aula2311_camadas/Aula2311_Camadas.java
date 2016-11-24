/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2311_camadas;

import banco.BancoDadosInstituicao;
import views.AlunoView;

/**
 *
 * @author 1616625
 */
public class Aula2311_Camadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BancoDadosInstituicao.inicializarBanco();
        
        AlunoView alunoView = new AlunoView();
        
        while (true){
            alunoView.exibirMenuAluno();
        }
        
    }
    
}
