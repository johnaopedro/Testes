package app;


public class IRPF {

    private float salario;
    private float contribuicaoPrevidenciaria;
    private String[] dependentes;

    public IRPF() {
        dependentes = new String[0];
    }

    public void cadastrarSalario(float salario) {
        this.salario += salario;
    }

    public float getTotalSalario() {
        return salario;
    }

    public void cadastrarPrevidenciaOficial(float contribuicaoPrevidenciaria){
        this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
    }

    public float getPrevidenciaOficial() {
        return this.contribuicaoPrevidenciaria;
    }

    public void cadastrarDependente(String nome) {
        // Criar uma nova posicao no vetor de dependentes
        String[] temp = new String[dependentes.length + 1];
        for (int i = 0; i < dependentes.length; i++) {
            temp[i] = dependentes[i];
        }

        //Alocar novo dependente no vetor
        temp[dependentes.length] = nome;

        //atualizar referencia do vetor de dependentes
        dependentes = temp;
    }

    public float getTotalDependentes() {
        return dependentes.length * 189.59f;

//      if (dependentes.length == 1) 
//          return 189.59f; //pela tecnica de falsificacao
//      else if (dependentes.length > 1)
//          return 379.18f; //pela tecnica de falsificacao / duplicacao
//      else
//          return 0;
    }
    
}