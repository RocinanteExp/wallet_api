package com.lab01.wallet.domain
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.JoinColumn

@Entity
class Wallet(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int?,
    val balance: Long = 0,
    @ManyToOne @JoinColumn(name="customer_id") val customer: Customer,) {

        override fun toString() = "wallet balance $balance $customer"
}