class Conta  {
    private Integer conta;
    private Double saldo;
    private String agencia;
    private String nome;

    public Conta(String nome, String agencia, int conta2, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }
}