package com.company;

import java.lang.Object;
import java.lang.String;

public class LinhaEncomenda {
    private String reference;
    private String description;
    private double price;
    private double quantity;
    private double imposto;
    private double discount;

    public LinhaEncomenda(){
        this.reference = null;
        this.description = null;
        this.price = 0;
        this.quantity = 0;
        this.imposto = 0;
        this.discount = 0;
    }

    public LinhaEncomenda(String reference, String description, double price, double quantity, double imposto, double discount){
        this.reference = reference;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.imposto = imposto;
        this.discount = discount;
    }

    public LinhaEncomenda(LinhaEncomenda LinhaEncomenda){
        this.reference=LinhaEncomenda.getReference();
        this.description=LinhaEncomenda.getDescription();
        this.price=LinhaEncomenda.getPrice();
        this.quantity=LinhaEncomenda.getQuantity();
        this.imposto=LinhaEncomenda.getimposto();
        this.discount=LinhaEncomenda.getdiscount();

    }

    public String getReference(){
        return this.reference;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    public double getQuantity(){
        return this.quantity;
    }

    public double getimposto(){
        return this.imposto;
    }

    public double getdiscount(){
        return this.discount;
    }

    public void setReference(String reference){
        this.reference=reference;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    public void setimposto(double imposto){
        this.imposto = imposto;
    }

    public void setdiscount(double discount){
        this.discount = discount;
    }

    /**
     * Implementa clone
     * Cria um objeto distinto mas com os mesmos argumentos
     */
    public Object clone(){
        return new LinhaEncomenda(this);
    }

    /**
     * Implementa método equals
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (this.getClass() != o.getClass())) return false;
        LinhaEncomenda e = (LinhaEncomenda) o;
        return e.getimposto() == ((LinhaEncomenda) o).getimposto() &&
                e.getdiscount() == ((LinhaEncomenda) o).getdiscount() &&
                e.getPrice() == ((LinhaEncomenda) o).getPrice() &&
                e.getQuantity() == ((LinhaEncomenda) o).getQuantity() &&
                e.getReference().equals(((LinhaEncomenda) o).getReference()) &&
                e.getDescription().equals(((LinhaEncomenda) o).getDescription());
    }

    /**
     * Implementação mais avançada do método toString
     */
    public String toString2(){
        StringBuilder sb = new StringBuilder();
        sb.append("Reference = ");
        sb.append(this.reference);
        sb.append(" Description = ");
        sb.append(this.description);
        sb.append(" Price = ");
        sb.append(this.price);
        sb.append(" Quantity = ");
        sb.append(this.quantity);
        sb.append(" discount = ");
        sb.append(this.discount);
        sb.append(" imposto = ");
        sb.append(this.imposto);
        String str = sb.toString();
        return str;
    }

    //7. b)
    public double calculaValorLinhaEnc(){
        return (this.price*this.imposto)*(1-this.discount)*this.quantity;
    }

    //7. c)
    public double calculaValorDesconto(){
        return(this.price*this.discount*this.quantity);
    }

}
