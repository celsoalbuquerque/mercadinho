import java.util.Date;

public class Program {

    public static void main(String[] args) {

     //   ---------------------- Funcionários -------------------------------
        Funcionario f1 = new Funcionario();
        f1.setCPF("790.493.474-00");
        f1.setNome("Felipe Carvalho Alves");


        Funcionario f2 = new Funcionario();
        f2.setCPF("560.892.444-91");
        f2.setNome("Cristina Magalhães de Lima");


        Funcionario f3 = new Funcionario();
        f3.setCPF("630.928.784-16");
        f3.setNome("Cristina Magalhães de Lima");

     //   ---------------------- Gerente ----------------------------------
        Gerente g1 = new Gerente();
        g1.setCPF("235.323.803-43");
        g1.setId(90218);
        g1.setSetor("Varejo");
        g1.setNome("Allan Correia Miranda");

     //   ---------------------- Produtos ----------------------------------
        Produto p1 = new Produto();
        p1.setNome("Pipoca");
        p1.setDescricao("Milho estourado amanteigado");
        p1.setValor(2.50);        
        p1.setValidade(null);


        Produto p2 = new Produto();
        p2.setNome("Refrigerante");
        p2.setDescricao("Líquido adocicado saborizado");
        p2.setValor(4.90);        
        p2.setValidade(null);


        Produto p3 = new Produto();
        p3.setNome("Doritos");
        p3.setDescricao("Tortilha de milho em formato de triângulo");
        p3.setValor(5.60);        
        p3.setValidade(null);


        Produto p4 = new Produto();
        p4.setNome("Chocolate em barra");
        p4.setDescricao("cacau 40% misturado ao açucar");
        p4.setValor(6.40);        
        p4.setValidade(null);


        Produto p5 = new Produto();
        p5.setNome("Água");
        p5.setDescricao("Bebida necesária para o ser humano");
        p5.setValor(2.00);        
        p5.setValidade(null);

        Cliente c1 = new Cliente();
        c1.setNome("José Saramago");
        c1.setIdade(23);
        c1.comprar();
    }
}