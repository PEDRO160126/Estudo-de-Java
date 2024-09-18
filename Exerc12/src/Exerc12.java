public class Exerc12 {
    public static void main(String[] args)
    {
        System.out.println("Bem vindo(a) ao programa de Triângulo Retângulo");
        descobrirHipotenusa();
        System.out.println("Agora você pode ir embora. Sai daqui!");
    }

    public static void descobrirHipotenusa()
    {
        TrianguloRetangulo meuTri = new TrianguloRetangulo();
        meuTri.lerCateto1();
        meuTri.lerCateto2();;
        System.out.println("A hipotenusa desse triângulo vale "+
                meuTri.hipotenusa());
    }
}
