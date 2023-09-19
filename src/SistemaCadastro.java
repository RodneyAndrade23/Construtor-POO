public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa marcos = new Pessoa("505", "MARCOS");

        marcos.setEndereco("Avenida do Magistério");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
