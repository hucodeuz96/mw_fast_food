package com.example.adminservice.entity;

/**
 * @author "Husniddin Ulachov"
 * @created 11:47 AM on 8/3/2022
 * @project adminService
 */

import com.example.adminservice.entity.templete.AbsNameEntity;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@ToString
@Where(clause = "deleted=false")
@SQLDelete(sql = "update category set deleted=true,status=false where id=?")
public class Category extends AbsNameEntity {
    @ManyToOne
    private Category parent;

    @ManyToMany
    private List<Filial> filial;

}
