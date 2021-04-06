package com.lab01.wallet.controllers

import com.lab01.wallet.repositories.WalletRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/")
class WalletController {

    @Autowired
    lateinit var walletRepository: WalletRepository

    @GetMapping("/w") 
    fun getWallet() {
        //walletRepository.findAll().forEach(::println)
        println("CIAO")
        walletRepository.findAll().forEach(::println)
    }


}