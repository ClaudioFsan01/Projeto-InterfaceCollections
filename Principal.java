/*
	  A API de Collections traz a interface java.util.List , que especifica o que uma classe deve ser
   capaz de fazer para ser uma lista. 
   
   A implementação mais utilizada da interface List é a ArrayList , que trabalha com um array
   interno para gerar uma lista. Portanto, ela é mais rápida na pesquisa do que sua concorrente, a
   LinkedList , que é mais rápida na inserção e remoção de itens nas pontas.
   
   ARRAYLIST NÃO É UM ARRAY!
   
   O que ocorre é que ARRAYLIST, internamente, ela usa um array como estrutura para armazenar os dados, porém este
   atributo está propriamente encapsulado e você não tem como acessá-lo.
   
   Repare, também, que você não pode usar [] com uma ArrayList , nem acessar atributo length . Não há relação!
	 */
	
import java.util.List; 
import java.util.ArrayList;
import java.util.LinkedList;
 


public class Principal {
	
	
	public static void main(String [] args) {
		
		//Para criar um ArrayList , basta chamar o construtor:
     
		//List lista = new ArrayList();
		
		// É sempre possível abstrair a lista a partir da interface List :	
		
		/*A interface List possui dois métodos add que recebe o objeto ou o elemento(inteiro, string, double, etc..) a ser inserido e os coloca no final da lista ou 
		 * na posição especificada no parametro. EX:
		 */
		
		// criando uma lista de String
		
		/*
		Geralmente, não nos interessa uma lista com vários tipos de objetos misturados; no dia-a-dia,
		usamos listas de um determinado tipo como ex: contas correntes. No Java 5.0, podemos usar o recurso de Generics para
		restringir as listas a um determinado tipo de objetos (e não qualquer Object ): EX :				
		*/
		
		List<String> listaNomes = new ArrayList<String>(); // especificando o tipo da lista
		
		listaNomes.add("Claudio");
		listaNomes.add("Fafima");
		listaNomes.add("Terezinha"); 
		listaNomes.add("Batma");
		
		for(int i=0; i< listaNomes.size(); i++) { //listaNomes.size()  retorna a quantidade de elementos da lista
			System.out.println(" Nome : "+ listaNomes.get(i));  // listaNomes.get(i) retorna o elemento da posição especificada no parametro
		}
		System.out.println("\n");
		System.out.println("------------------");
		
		//criando uma lista de Contas Correntes:	
		/*O uso de Generics também elimina a necessidade de casting, já que, seguramente, todos os objetos
		inseridos na lista serão do tipo ContaCorrente : conforme o ex:*/
		
	   /*	A partir do Java 7, se você instancia um tipo genérico na mesma linha de sua declaração, não é
		necessário passar os tipos novamente, basta usar new ArrayList<>() . É conhecido como operador
		diamante: Ex :
		List<ContaCorrente> contas = new ArrayList<>();*/
		
		List<ContaCorrente> lista = new ArrayList<>(); 
		
		// criando as contas
		
		ContaCorrente c1 = new ContaCorrente();
		c1.numero = 1;
		c1.titular = "Joao";
		c1.deposita(100);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.numero = 2;
		c2.deposita(200);
		c2.titular = "Maria";
		
		ContaCorrente c3= new ContaCorrente();
		c3.numero = 3;
		c3.deposita(300);
		c3.titular = "Zezinho";
		
		ContaCorrente c4= new ContaCorrente();
		// adicionando as contas na lista
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		// Exibindo os elementos 
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Numero : "+ lista.get(i).numero +" - Nome : "+ lista.get(i).titular +" - Saldo : "+ lista.get(i).getSaldo());
			
		}
		System.out.println(lista.contains(c2)); // true
		System.out.println(lista.indexOf(c3)); // retorna o index da primeira ocorrencia do objeto especificado
		System.out.println(lista.lastIndexOf(c4)); // retorna o índice da última ocorrência do elemento especificado nesta lista ou -1 se essa lista não contiver o elemento
		System.out.println("\n");
		System.out.println("------------------");
		
		//remover 
		
		
		lista.remove(c2); // remove o objeto especificado da lista

		for(int i=0; i<lista.size(); i++) {
			System.out.println("Numero : "+ lista.get(i).numero +" - Nome : "+ lista.get(i).titular +" - Saldo : "+ lista.get(i).getSaldo());			
		}	
		
		//contains() , que recebe um objeto como argumento e devolve true ou false , indicando se o	elemento está ou não na lista.
		
		System.out.println(lista.contains(c2)); // false
		System.out.println("\n");
		System.out.println("------------------");
		
		
		
		// criando as contas poupanças
		
		List<ContaPoupanca> lista2 = new LinkedList<ContaPoupanca>(); //
		
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaPoupanca cp4 = new ContaPoupanca();
		
		cp1.numero = 10;
		cp1.titular = "Bibiu";
		cp1.deposita(350);
		
		cp2.numero = 20;
		cp2.titular = "Flavio";
		cp2.deposita(400);
		
		cp3.numero = 30;
		cp3.titular = "Ivo";
		cp3.deposita(450);
		
		cp4.numero = 40;
		cp4.titular = "Sandra";
		cp4.deposita(500);
		
		// inserindo os objetos na ordem 
		
		lista2.add(cp1);
		lista2.add(cp2);
		lista2.add(cp3);
		
		// inserindo no inicio da lista 
		
		//lista2.add(0, cp4);
		
		// inserindo no final da lista 
		
		lista2.add(3, cp4);
		
		System.out.println(" Inserindo conta poupança no inicio e final da lista ! \n");
		
		for(int i=0; i< lista2.size(); i++) {
			System.out.println("Numero : "+ lista2.get(i).numero + " - Nome : "+ lista2.get(i).titular + " - Saldo : "+ lista2.get(i).getSaldo() );
		}
		
		
		System.out.println(" ---------------- \n");
						
	
	}

}
