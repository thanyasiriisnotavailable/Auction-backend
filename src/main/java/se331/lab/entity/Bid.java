package se331.lab.entity;

import jakarta.persistence.*;
import lombok.*;
import se331.lab.entity.AuctionItem;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    Long amount;
    String datetime;
    @ManyToOne
    AuctionItem auctionItem;
}
