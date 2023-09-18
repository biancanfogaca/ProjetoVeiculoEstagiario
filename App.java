public class App {
    public static void main(String[] args) {
        
        Carro c1 = new Carro(1,
                "CHASSI-CARRO-1",
                "Marca-Carro-1",
                "Modelo-Carro-1",
                2022,
                2021,
                "Fabricante-Carro-1",
                "Proprietario-Carro-1",
                "Tipo-Carro-1",
                2,
                2000,
                1800,
                4,
                4,
                "Gasolina",
                "SP",
                "São Paulo",
                "Carro",
                1,
                5,
                "PLACA-CARRO-1",
                "RENAVAM-CARRO-1",
                (float) 12.5,
                1,
                5,
                true);

        c1.Imprimir();

        Caminhao cm = new Caminhao(2,
                "CHASSI-CAMINHAO-1",
                "Marca-Caminhao-1",
                "Modelo-Caminhao-1",
                2020,
                2019,
                "Fabricante-Caminhao-1",
                "Proprietario-Caminhao-1",
                "Tipo-Caminhao-1",
                3,
                8000,
                12000,
                2,
                6,
                "Diesel",
                "RJ",
                "Rio de Janeiro",
                "Caminhao",
                2,
                3,
                "PLACA-CAMINHAO-1",
                "RENAVAM-CAMINHAO-1",
                (float) 20.5,
                (float) 10);

        cm.Imprimir();

        Onibus o1 = new Onibus(3,
                "CHASSI-ONIBUS-1",
                "Marca-Onibus-1",
                "Modelo-Onibus-1",
                2021,
                2020,
                "Fabricante-Onibus-1",
                "Proprietario-Onibus-1",
                "Tipo-Onibus-1",
                2,
                12000,
                18000,
                4,
                6,
                "Óleo Diesel",
                "MG",
                "Belo Horizonte",
                "Onibus",
                3,
                50,
                "PLACA-ONIBUS-1",
                "RENAVAM-ONIBUS-1",
                150,
                true,
                true,
                false,
                true);

        o1.Imprimir();

        Motocicleta m1 = new Motocicleta(4,
                "CHASSI-MOTO-1",
                "Marca-Moto-1",
                "Modelo-Moto-1",
                2023,
                2022,
                "Fabricante-Moto-1",
                "Proprietario-Moto-1",
                "Tipo-Moto-1",
                1,
                150,
                180,
                0,
                2,
                "Gasolina",
                "PR",
                "Curitiba",
                "Motocicleta",
                1,
                2,
                "PLACA-MOTO-1",
                "RENAVAM-MOTO-1",
                8,
                "Injeção Eletrônica");

        m1.Imprimir();

        Aviao a1 = new Aviao(5,
                "CHASSI-AVIAO-1",
                "Marca-Aviao-1",
                "Modelo-Aviao-1",
                2022,
                2021,
                "Fabricante-Aviao-1",
                "Proprietario-Aviao-1",
                "Tipo-Aviao-1",
                4,
                40000,
                60000,
                4,
                4,
                "Jet A1",
                "SP",
                "Campinas",
                "Aeronave",
                4,
                150,
                200,
                "PLACA-AVIAO-1",
                (float) 60,
                (float) 40,
                (float) 1500,
                400);

        a1.Imprimir();
    }
}