public class Calculadora {
    double resultado;
    double ValorA;
    double ValorB;
    public double sumar(double a, double b) {
        resultado = ValorA + ValorB;
        return resultado;
    }

    public double restar(double a, double b) {
        resultado = ValorA - ValorB;
        return resultado;
    }

    public double multiplicar(double a, double b) {
        resultado = ValorA * ValorB;
        return resultado;
    }

    public double dividir(double a, double b) {
        resultado = ValorA / ValorB;
        return resultado;
    }
}