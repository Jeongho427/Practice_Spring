package hello.itemservice.domain.item;

import lombok.Data;

@Data   //함부로 쓰기 위험함 @Getter @Setter 포함
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
