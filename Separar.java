public class Separar()
{
	//donde se guardararn las palabras separadas
	String[] palabrasSeparadas;
	//las palabras que se van a separar
	String palabrasJuntas = "el perro toma agua";

	//se separan las palabras
    File diccionario = new File(System.getProperty("user.dir")+"\\"+"Diccionario");
    FileReader leer = new FileReader(Diccionario);
    BufferedReader buff = new BufferedReader(leer);
    String linea;
    while((linea = buff.readLine()) != null)
    {
   	palabrasSeparadas = palabrasJuntas.split(",");
    }	
}

