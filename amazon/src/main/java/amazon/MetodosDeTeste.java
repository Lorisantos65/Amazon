package amazon;

public class MetodosDeTeste {

	
	/**
	 * Metodo respons�vel por simular a digita��o em um elemento passando duas Strings
	 * @param elemento
	 * @param texto
	 */
  //digitar
 public void digitar (String elemento, String texto) {
	 System.out.println("Digitando " + texto + "no elemento " +  elemento); ;
 }

 /**
	 * Metodo respons�vel por simular a��o clicar em um elemento
	 * @param elemento
	 */
  //clicar
 public void clicar (String elemento ) {
	 System.out.println("Clicamosno elemento " + elemento);
 }
 
 /**
	 * Metodo respons�vel por simular a valida��o de um texto
	 * @author Anderson
	 * @param elemento
	 * @param textoEsperado
	 */
 //validar texto 
 public void validarTexto (String elemento, String textoEsperado) {
	 System.out.println("validar o "+ elemento + "com o texto esperado " + textoEsperado);
 }
 
}
