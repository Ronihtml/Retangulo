public class Retangulo {
    public double largura;
    public double altura;

    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return (largura + altura) * 2.0;
    }

    public double diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }

    public String toString(){
        return "Area: " + String.format("%.2f",area()) +
                "\nPerimetro: " + String.format("%.2f",perimetro()) +
                "\nDiagonal: " + String.format("%.2f",diagonal());
    }
}
