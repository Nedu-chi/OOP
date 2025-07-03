public class Patient {
    public String name;
    private int medicalID;
    private String diagnosis;

    public String getDiagnosis (){
        return diagnosis;
    }


    public void setDiagnosis (String diog){
        diagnosis = diog;
    }
}