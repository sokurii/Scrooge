package com.scrooge.scrooge.domain;

import com.scrooge.scrooge.domain.member.Member;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment_history")
@Data
@NoArgsConstructor
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "paid_at")
    private LocalDateTime paidAt;

    @Column(length = 20)
    private String category;

    @Column(nullable = false)
    private Integer amount;

    @Column(length = 255, nullable = false, name = "used_at")
    private String usedAt;

    @Column(length = 255, name = "card_name")
    private String cardName;


    @Column(name = "is_settled", columnDefinition = "boolean default false")
    private Boolean isSettled;

    // 연결
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;
}
