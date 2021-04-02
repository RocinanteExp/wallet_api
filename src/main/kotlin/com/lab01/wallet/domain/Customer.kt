package com.lab01.wallet.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Column
import javax.persistence.OneToMany

@Entity
class Customer(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    @Column(nullable=false) val name: String,
    @Column(nullable=true) @OneToMany(mappedBy="customer") val listWallets: MutableList<Wallet> = mutableListOf<Wallet>(),
    // @Column(nullable=false) val surname: String,
    // @Column(nullable=false, unique=true) val email: String,
    // val delivery_address_id: Int?)
    ) {

    override fun toString(): String {
        return "customer $id has $name"
    }    

}