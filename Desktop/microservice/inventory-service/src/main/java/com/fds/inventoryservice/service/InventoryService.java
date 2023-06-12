package com.fds.inventoryservice.service;

import com.fds.inventoryservice.dto.InventoryRespon;
import com.fds.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;
   @Transactional(readOnly = true)
    public List<InventoryRespon> isInStock(List<String> skuCode){
       return  inventoryRepository.findBySkuCodeIn(skuCode)
               .stream()
               .map(inventory ->
                   InventoryRespon.builder()
                           .skuCode(inventory.getSkuCode())
                           .isInStock(inventory.getQuantity()>0)
                           .build()
               ).collect(Collectors.toList());

    }

}
