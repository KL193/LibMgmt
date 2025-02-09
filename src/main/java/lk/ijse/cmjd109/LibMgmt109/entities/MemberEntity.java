package lk.ijse.cmjd109.LibMgmt109.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    private String memberId;
    private String fName;
    private String lName;
    private String email;
    private LocalDate memberShipDate;
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<LendingEntity> lendings;
}
