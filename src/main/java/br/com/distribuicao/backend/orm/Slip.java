package br.com.distribuicao.backend.orm;

import javax.persistence.*;

@Entity
@Table(name = "slip")
public class Slip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codSlip;
    private String data;

    public Integer getCodSlip() {
        return codSlip;
    }

    public void setCodSlip(Integer codSlip) {
        this.codSlip = codSlip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
