package br.com.lucianomedeiros.candidatos2016.ws.model;

/**
 * Created by 08140905402 on 30/08/2016.
 */
public class Estado {

    private Long id;
    private String sigla;
    private String nome;
    private Object regiao;
    private Object cargos;
    private String codigo;
    private boolean capital;
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Object getRegiao() {
        return regiao;
    }

    public void setRegiao(Object regiao) {
        this.regiao = regiao;
    }

    public Object getCargos() {
        return cargos;
    }

    public void setCargos(Object cargos) {
        this.cargos = cargos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
