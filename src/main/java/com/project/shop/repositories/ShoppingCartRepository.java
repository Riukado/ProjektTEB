package com.project.shop.repositories;

import com.project.account.models.AccountEntity;
import com.project.shop.models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
    ShoppingCart findBySessionToken(String  sessionToken);
    ShoppingCart findByUser(AccountEntity user);
}