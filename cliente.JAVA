public class Cliente{
    private String ID;
    private String cognome;
    private String nome;
    private String telefono;
    private int gradoSoddisfazione;
    public Cliente(String id,String cognome,String nome,String telefono)
    {
        this.ID=id;
        this.cognome=cognome;
        this.nome=nome;
        this.telefono=telefono;
        this.gradoSoddisfazione=0;
    }
    public String getID(){
        return this.ID;
    }
    public String getCognome(){
        return this.cognome;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setID(String id){
        this.ID=id;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setGradoSoddisfazione(int gradoSoddisfazione){
        this.gradoSoddisfazione=gradoSoddisfazione;
    }
    
    public Cliente modificaDati(Cliente c)
    {
        this.ID=c.ID;
        this.cognome=c.cognome;
        this.nome=c.nome;
        this.telefono=c.telefono;
        this.gradoSoddisfazione=c.gradoSoddisfazione;
    }
    public int GradoSoddisfazione(){
        return this.gradoSoddisfazione;
    }
    public String stampa()
    {
        return "ID: "+getID+" cognome: "+getCognome+" nome: "+getNome+" telefono: "+getTelefono+" grado di soddisfazione: "+GradoSoddisfazione;
    }
}