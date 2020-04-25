/*
	  A API de Collections traz a interface java.util.List , que especifica o que uma classe deve ser
   capaz de fazer para ser uma lista. 
   
   A implementa��o mais utilizada da interface List � a ArrayList , que trabalha com um array
   interno para gerar uma lista. Portanto, ela � mais r�pida na pesquisa do que sua concorrente, a
   LinkedList , que � mais r�pida na inser��o e remo��o de itens nas pontas.
   
   ARRAYLIST N�O � UM ARRAY!
   
   O que ocorre � que ARRAYLIST, internamente, ela usa um array como estrutura para armazenar os dados, por�m este
   atributo est� propriamente encapsulado e voc� n�o tem como acess�-lo.
   
   Repare, tamb�m, que voc� n�o pode usar [] com uma ArrayList , nem acessar atributo length . N�o h� rela��o!
	 */
	
import java.util.List; 
import java.util.ArrayList;
import java.util.LinkedList;
 


public class Principal {
	
	
	public static void main(String [] args) {
		
		//Para criar um ArrayList , basta chamar o construtor:
     
		//List lista = new ArrayList();
		
		// � sempre poss�vel abstrair a lista a partir da interface List :	
		
		/*A interface List possui dois m�todos add que recebe o objeto ou o elemento(inteiro, string, double, etc..) a ser inserido e os coloca no final da lista ou 
		 * na posi��o especificada no parametro. EX:
		 */
		
		// criando uma lista de String
		
		/*
		Geralmente, n�o nos interessa uma lista com v�rios tipos de objetos misturados; no dia-a-dia,
		usamos listas de um determinado tipo como ex: contas correntes. No Java 5.0, podemos usar o recurso de Generics para
		restringir as listas a um determinado tipo de objetos (e n�o qualquer Object ): EX :				
		*/
		
		List<String> listaNomes = new ArrayList<String>(); // especificando o tipo da lista
		
		listaNomes.add("Claudio");
		listaNomes.add("Fafima");
		listaNomes.add("Terezinha"); 
		listaNomes.add("Batma");
		
		for(int i=0; i< listaNomes.size(); i++) { //listaNomes.size()  retorna a quantidade de elementos da lista
			System.out.println(" Nome : "+ listaNomes.get(i));  // listaNomes.get(i) retorna o elemento da posi��o especificada no parametro
		}
		System.out.println("\n");
		System.out.println("------------------");
		
		//criando uma lista de Contas Correntes:	
		/*O uso de Generics tamb�m elimina a necessidade de casting, j� que, seguramente, todos os objetos
		inseridos na lista ser�o do tipo ContaCorrente : conforme o ex:*/
		
	   /*	A partir do Java 7, se voc� instancia um tipo gen�rico na mesma linha de sua declara��o, n�o �
		necess�rio passar os tipos novamente, basta usar new ArrayList<>() . � conhecido como operador
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
		System.out.println(lista.lastIndexOf(c4)); // retorna o �ndice da �ltima ocorr�ncia do elemento especificado nesta lista ou -1 se essa lista n�o contiver o elemento
		System.out.println("\n");
		System.out.println("------------------");
		
		//remover 
		
		
		lista.remove(c2); // remove o objeto especificado da lista

		for(int i=0; i<lista.size(); i++) {
			System.out.println("Numero : "+ lista.get(i).numero +" - Nome : "+ lista.get(i).titular +" - Saldo : "+ lista.get(i).getSaldo());			
		}	
		
		//contains() , que recebe um objeto como argumento e devolve true ou false , indicando se o	elemento est� ou n�o na lista.
		
		System.out.println(lista.contains(c2)); // false
		System.out.println("\n");
		System.out.println("------------------");
		
		
		
		// criando as contas poupan�as
		
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
		
		System.out.println(" Inserindo conta poupan�a no inicio e final da lista ! \n");
		
		for(int i=0; i< lista2.size(); i++) {
			System.out.println("Numero : "+ lista2.get(i).numero + " - Nome : "+ lista2.get(i).titular + " - Saldo : "+ lista2.get(i).getSaldo() );
		}
		
		
		System.out.println(" ---------------- \n");
						
	
	}

}
