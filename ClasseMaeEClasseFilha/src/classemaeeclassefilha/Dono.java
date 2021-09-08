/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classemaeeclassefilha;

/**
 *
 * @author wiliam.patricio
 */
public class Dono extends Gerente {
    public String ContaBancaria;
    public String NomeDaEmpresa;
    public String Estimativa;
    public String NomeDaPessoa;
    public String produto;
    public String localidade; 
    
     String[] contaDN = {"U"};
     int[] acessoDN = {99};

    public Dono(String Estimativa, String localidade, String produto, String NomeDaPessoa, String ContaBancaria, String NomeDaEmpresa) {
        this.Estimativa = Estimativa;
        this.NomeDaEmpresa = NomeDaEmpresa;
        this.localidade = localidade;
        this.produto = produto;
        this.NomeDaPessoa = NomeDaPessoa;
        this.ContaBancaria = ContaBancaria;

    }

    Dono() {
    }

    public String getContaBancaria() {
        return ContaBancaria;
    }

    public void setContaBancaria(String ContaBancaria) {
        this.ContaBancaria = ContaBancaria;
    }

    public String getNomeDaEmpresa() {
        return NomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String NomeDaEmpresa) {
        this.NomeDaEmpresa = NomeDaEmpresa;
    }

    public String getEstimativa() {
        return Estimativa;
    }

    public void setEstimativa(String Estimativa) {
        this.Estimativa = Estimativa;
    }

    public String getNomeDaPessoa() {
        return NomeDaPessoa;
    }

    public void setNomeDaPessoa(String NomeDaPessoa) {
        this.NomeDaPessoa = NomeDaPessoa;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String[] getContaDN() {
        return contaDN;
    }

    public void setContaDN(String[] contaDN) {
        this.contaDN = contaDN;
    }

    public int[] getAcessoDN() {
        return acessoDN;
    }

    public void setAcessoDN(int[] acessoDN) {
        this.acessoDN = acessoDN;
    }

    public String[] getContaGE() {
        return contaGE;
    }

    public void setContaGE(String[] contaGE) {
        this.contaGE = contaGE;
    }

    public int[] getAcessoGE() {
        return acessoGE;
    }

    public void setAcessoGE(int[] acessoGE) {
        this.acessoGE = acessoGE;
    }

    public String[] getContaOP() {
        return contaOP;
    }

    public void setContaOP(String[] contaOP) {
        this.contaOP = contaOP;
    }

    public int[] getAcessoOP() {
        return acessoOP;
    }

    public void setAcessoOP(int[] acessoOP) {
        this.acessoOP = acessoOP;
    }

    
   
}
