public class UnidadeCurricular {
    private String nome;
    private String dia;
    private String horario;
    private String sala;
    private int Cargahoraria = 360;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargahoraria() {
        return Cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        Cargahoraria = cargahoraria;
    }

    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }

    public void exibirCargaHoraria(){

    System.out.println("unidade curricular: " + nome);    
    System.out.println("dia: " + dia);   
    System.out.println("horario: " +horario);   
    System.out.println("sala:  " + sala);   
    System.out.println("Carga Horaria: " + Cargahoraria + "horas");   
}

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}