package aula05;

import java.util.ArrayList;

class Imovel {
    private int id, numQuartos;
    private String localidade;
    private double preco;
    private boolean disponibilidade;
    private DateYMD dataInicio, dataFim;


    public static Imovel create(String localidade, int numQuartos, double preco, boolean disponibilidade,
            DateYMD dataInicio, DateYMD dataFim) {
        if (localidade == null || localidade.length() == 0 || numQuartos < 1 || preco < 0) {
            return null;
        }
        return new Imovel(localidade, numQuartos, preco, disponibilidade, dataInicio, dataFim);
    }


    public Imovel(String localidade, int numQuartos, double preco, boolean disponibilidade,
            DateYMD dataInicio, DateYMD dataFim) {
        this.localidade = localidade;
        this.numQuartos = numQuartos;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDataInicio(DateYMD dataInicio) {
        this.dataInicio = dataInicio;
    }

    public DateYMD getDataInicio() {
        return dataInicio;
    }

    public void setDataFim(DateYMD dataFim) {
        this.dataFim = dataFim;
    }

    public DateYMD getDataFim() {
        return dataFim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}

class RealEstate {
    ArrayList<Imovel> imoveis = new ArrayList<>();

    public void newProperty(String localidade, int numQuartos, double preco) {
        Imovel imovel = Imovel.create(localidade, numQuartos, preco, true, null, null);
        if (imovel != null) {
            imovel.setId(imoveis.size() + 1000);
            imoveis.add(imovel);
        }
    }

    public void sell(int id) {
        if (id > imoveis.size() + 1000) {
            System.out.println("O imóvel " + id + " não existe.");
            return;
        }
        imoveis.get(id - 1000).setDisponibilidade(false);
        System.out.println("O imóvel " + id + " foi vendido.");
    }

    public void setAuction(int id, DateYMD data, int duracao) {
        if (id > imoveis.size() + 1000) {
            System.out.println("O imóvel " + id + " não existe.");
            return;
        }

        if (!imoveis.get(id - 1000).getDisponibilidade()) {
            System.out.println("O imóvel " + id + " não está disponível.");
        }

        DateYMD dataFim = new DateYMD(data.getDay(), data.getMonth(), data.getYear());

        imoveis.get(id - 1000).setDataInicio(data);

        for (int i = 0; i < duracao;i++){
            dataFim.Increment();
        }
        
        imoveis.get(id - 1000).setDataFim(dataFim);

    }

    @Override
    public String toString() {
        String str = "Propriedades:\n";
        for (Imovel imovel : imoveis) {
            str += String.format("ID: %d, Localidade: %s, Quartos: %d, Preço: %.0f, Disponibilidade: %s ",
                    imovel.getId(), imovel.getLocalidade(), imovel.getNumQuartos(), imovel.getPreco(),
                    imovel.getDisponibilidade() ? "sim" : "não");
            if (imovel.getDataInicio() != null) {
                str += String.format("; leilão %s : %s", imovel.getDataInicio(), imovel.getDataFim());
            }
            str += "\n";
        }
        return str;
    }
}


