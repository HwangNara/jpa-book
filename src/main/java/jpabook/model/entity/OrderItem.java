package jpabook.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by country on 2017-05-16.
 */
@Entity
@Table(name = "ORDER_ITEM")
@Getter
@Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "ORDER-ID")
    private Order order;

    private int orderPrice;
    private int count;
}
