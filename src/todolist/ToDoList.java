/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escolha uma opção:");
        int acesso = acesso;

switch (acesso) {
    case 1:
        System.out.println("Adicionar Tarefa: 1");
        break;
    case 2:
        System.out.println("Listar Tarefas: 2");
        break;
    case 3:
        System.out.println("Concluir Tarefa: 3"); // This will execute
        break; 
    default:
        System.out.println("Deletar Tarefa: 4"); // Executes if no cases match
        break;
        
        
}
           
        }
    }
    