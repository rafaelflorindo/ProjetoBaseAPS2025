class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.setId(id);
        this.setNome(nome);
        this.setSalario(salario);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Salário: " + salario;
    }
}

