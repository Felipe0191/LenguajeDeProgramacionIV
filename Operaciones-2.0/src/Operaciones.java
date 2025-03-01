public class Operaciones {
    double resultado;
    double ValorA;
    double ValorB;
    public double sumar(double a, double b) {
        ValorA=a;
        ValorB=b;
        resultado = ValorA + ValorB;
        return resultado;
    }

    public double restar(double a, double b) {
        ValorA=a;
        ValorB=b;
        resultado = ValorA - ValorB;
        return resultado;
    }

    public double multiplicar(double a, double b) {
        ValorA=a;
        ValorB=b;
        resultado = ValorA * ValorB;
        return resultado;
    }

    public double dividir(double a, double b) {
        ValorA=a;
        ValorB=b;
        resultado = ValorA / ValorB;
        return resultado;
    }
}