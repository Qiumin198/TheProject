package online.qms198.springboot_stu.pojo.recruitment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.qms198.springboot_stu.pojo.user.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_recruitment_group__mapping")
public class UserRecruitmentGroupMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , referencedColumnName = "user_account")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id" , referencedColumnName = "group_account")
    private RecruitmentGroup recruitmentGroup;
}