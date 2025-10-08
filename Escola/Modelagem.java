public class Modelagem extends UnidadeCurricular {
    
    @Override
    public void exibirCargaHoraria(){
        setCargahoraria(280);
        System.out.println("Unidade Curricular: " + getNome());
        System.out.println("Dia: " + getDia());
        System.out.println("horaria: " + getHorario());
        System.out.println("sala: " + getSala());
        System.out.println("Carga Horaria: " + getCargahoraria() + "horas");
        

    }
    
}
