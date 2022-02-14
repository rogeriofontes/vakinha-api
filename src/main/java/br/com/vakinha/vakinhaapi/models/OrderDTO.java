package br.com.vakinha.vakinhaapi.models;

import java.util.List;

public class OrderDTO {
    private Long userId;
    private String cpf;
    private String address;
    private List<ShoppingCartModel> items;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ShoppingCartModel> getItems() {
        return items;
    }

    public void setItems(List<ShoppingCartModel> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "userId=" + userId +
                ", cpf='" + cpf + '\'' +
                ", address='" + address + '\'' +
                ", items=" + items +
                '}';
    }
}
