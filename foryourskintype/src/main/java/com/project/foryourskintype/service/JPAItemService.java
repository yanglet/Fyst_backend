package com.project.foryourskintype.service;

import com.project.foryourskintype.domain.Item;
import com.project.foryourskintype.domain.SkinType;
import com.project.foryourskintype.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class JPAItemService implements ItemService{

    private final EntityManager em;
    private final ItemRepository itemRepository;

    @Transactional
    @Override
    public Long save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Item findOne(Long id) {
        return itemRepository.findOne(id).orElse(Item.createNullItem());
    }

    @Transactional
    @Override
    public void delete(Long id) {
        itemRepository.delete(id);
    }

    @Override
    public List<Item> findDrItem() {
        return em.createQuery("select i from Item i where i.brand=:brand", Item.class)
                .setParameter("brand", "drjart")
                .getResultList();
    }

    @Override
    public List<Item> findInItem() {
        return em.createQuery("select i from Item i where i.brand=:brand", Item.class)
                .setParameter("brand", "innisfree")
                .getResultList();
    }

    @Override
    public List<Item> findSiItem() {
        return em.createQuery("select i from Item i where i.brand=:brand", Item.class)
                .setParameter("brand", "sidmool")
                .getResultList();
    }

    @Override
    public List<Item> findBeItem() {
        return em.createQuery("select i from Item i where i.brand=:brand", Item.class)
                .setParameter("brand", "beplain")
                .getResultList();
    }

    @Override
    public List<Item> findBySkinType(SkinType skinType) {
        return em.createQuery("select i from Item i where i.skinType=:skinType", Item.class)
                .setParameter("skinType", skinType)
                .getResultList();
    }

    @Override
    public List<Item> findByBrand(String brand) {
        return em.createQuery("select i from Item i where i.brand=:brand", Item.class)
                .setParameter("brand", brand)
                .getResultList();
    }
}
