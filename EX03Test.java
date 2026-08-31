// Desenvolvido por Guilherme Bertero e Guilherme Francisco

public class EX03Test {
    public static void main(String[] args) {

        Student Estudante = new Student("Maria", "Rua Vicente de Carvalho, 50", "ADS", 2026, 1250);

        System.out.println(Estudante.getProgram());
        System.out.println(Estudante.getYear());
        System.out.println(Estudante.getFee());
        Estudante.setProgram("Engenharia");
        Estudante.setYear(2025);
        Estudante.setFee(1350);
        System.out.println(Estudante);

        Staff Funcionario = new Staff("Igor", "Avenida dos Casares, 67", "Colégio Estadual Patinho Feio", 2500);

        System.out.println(Funcionario.getSchool());
        System.out.println(Funcionario.getPay());
        Funcionario.setSchool("Colégio Estadual Patinho Bonito");
        Funcionario.setPay(2750);
        System.out.println(Funcionario);
    }   
}
