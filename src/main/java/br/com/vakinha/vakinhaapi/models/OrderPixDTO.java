package br.com.vakinha.vakinhaapi.models;

//https://www.mballem.com/post/simplificando-com-builder-pattern/
//https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
public class OrderPixDTO {
    private String code;
    private String image;
    private double totalValue;

    private OrderPixDTO(OrderPixDTOBuilder builder) {
        this.code = builder.code;
        this.image = builder.image;
        this.totalValue = builder.totalValue;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public static class OrderPixDTOBuilder {
        private String image;
        private String code;
        private double totalValue;

        public OrderPixDTOBuilder(String code) {
            this.code = code;
        }

        public OrderPixDTOBuilder code(String code) {
            this.code = code;
            return this;
        }
        public OrderPixDTOBuilder image(String image) {
            this.image = image;
            return this;
        }
        public OrderPixDTOBuilder totalValue(int totalValue) {
            this.totalValue = totalValue;
            return this;
        }

        //Return the finally consrcuted User object
        public OrderPixDTO build() {
            OrderPixDTO orderPixDTO =  new OrderPixDTO(this);
            validateUserObject(orderPixDTO);
            return orderPixDTO;
        }
        private void validateUserObject(OrderPixDTO orderPixDTO) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }
}
