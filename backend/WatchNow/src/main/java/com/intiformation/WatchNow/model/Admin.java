package com.intiformation.WatchNow.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "_idPersonne")
@Data
public class Admin extends Utilisateur {

    public Admin() {
    }

}