public class UsaPessoa {
    public static void main(String[] args) {
        pessoa p =new pessoa("fulano, 40,1000.0");
        System.out.println("nome:"+ p.nome);
        System.out.println("idade:" + p.idade);
        System.out.println("renda:" + p.renda);
    }
}
