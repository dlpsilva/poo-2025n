import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //criação dos objetos da classe carro
        Carro obj1 = new Carro();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro: "));
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Digite o velocidade: "));
        obj1.marca = JOptionPane.showInputDialog("Informe marca");;
        obj1.modelo = JOptionPane.showInputDialog("Informe Modelo");
        obj1.exibirDetalhes();
        obj1.acelerar(50);


        Carro obj2 = new Carro(2023, 30, "Fiat", "Argo");
        obj2.exibirDetalhes();
        obj2.acelerar(60);
        obj2.frear(100);
        obj2.exibirDetalhes();


        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}
