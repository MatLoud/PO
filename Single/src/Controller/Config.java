
package Controller;

public class Config {
   private static Config instance;
   private String tema, idioma;
   private String object[];
    private Config() {
        this.tema = "Oscuro";
        this.idioma = "Espanol";
    }
    public static Config Inicializar(){
    {instance=new Config();}
    return instance;} 

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void mostrarConfig(){System.out.println("Idioma: "+idioma+" Tema: "+tema);}
}
