/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import banco.BancoDadosInstituicao;
import controllers.AlunosController;
import java.util.Scanner;
import models.Aluno;

/**
 *
 * @author 1616625
 */
public class AlunoView {
    
   Scanner scan = new Scanner(System.in);
   
   public void exibirMenuAluno(){
       System.out.println("");
       System.out.println("Digite: ");
       System.out.println("1 - Cadastrar Aluno");
       System.out.println("2 - Listar Alunos");
       System.out.print("3 - Buscar Aluno por codigo");
       System.out.println("");
       int opcao = scan.nextInt();
       scan.nextLine();
       
       switch(opcao){
           case 1:
               adicionarAluno();
               break;
           case 2:
               listarAlunos();
               break;
           case 3:
               buscarAlunoPorCodigo();
              
               
               
       }
       
       
       
   }
   
   public void listarAlunos(){
           System.out.println("---");
           
       for (Aluno a: BancoDadosInstituicao.getTabelaAluno()){
           
           System.out.println("Codigo: "+ a.getCodigo());
           System.out.println("Nome: " + a.getNome());
           System.out.println("CPF: " + a.getCpf());
           System.out.println("---");  
           
           
       }
   }
   public void adicionarAluno(){
       System.out.print("Digite o codigo do Aluno: ");
       int cod = scan.nextInt();
       scan.nextLine();
       
       System.out.print("Digite o nome do Aluno: ");
       String nome = scan.nextLine();
       
       System.out.print("Digite o cpf do Aluno: ");
       String cpf = scan.nextLine();
       
       AlunosController.adicionarAluno(cod, nome, cpf);
   }

    private void buscarAlunoPorCodigo() {
        System.out.print("Digite o codigo do aluno: ");
        int cod = scan.nextInt();
        scan.nextLine();

        
        Aluno z = AlunosController.buscarPorCodigo(cod);
        
        if (z != null){
           System.out.println("Codigo: "+ z.getCodigo());
           System.out.println("Nome: " + z.getNome());
           System.out.println("CPF: " + z.getCpf());
           System.out.println("---"); 
           
        }else{
            System.out.println("Aluno não Encontrado");
        }

    }
    
}
