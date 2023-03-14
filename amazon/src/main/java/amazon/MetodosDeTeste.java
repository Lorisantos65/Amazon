package amazon;

public class MetodosDeTeste {

	
	/**
	 * Metodo responsável por simular a digitação em um elemento passando duas Strings
	 * @param elemento
	 * @param texto
	 */
  //digitar
 public void digitar (String elemento, String texto) {
	 System.out.println("Digitando " + texto + "no elemento " +  elemento); ;
 }

 /**
	 * Metodo responsável por simular ação clicar em um elemento
	 * @param elemento
	 */
  //clicar
 public void clicar (String elemento ) {
	 System.out.println("Clicamosno elemento " + elemento);
 }
 
 /**
	 * Metodo responsável por simular a validação de um texto
	 * @author Anderson
	 * @param elemento
	 * @param textoEsperado
	 */
 //validar texto 
 public void validarTexto (String elemento, String textoEsperado) {
	 System.out.println("validar o "+ elemento + "com o texto esperado " + textoEsperado);
 }
 
}
