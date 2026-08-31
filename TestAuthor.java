// Desenvolvido por Guilherme Bertero e Guilherme Francisco

public class TestAuthor {
    public static void main(String[] args){
        Author a = new Author("Marcos Antônio", "marcosa20@example.com", 'M');
        System.out.println(a); // toString()

        a.setEmail("marcosa20@gmail.com");
        System.out.println(a.getName());
        System.out.println(a.getGender());
        System.out.println(a.getEmail());
    }
}
