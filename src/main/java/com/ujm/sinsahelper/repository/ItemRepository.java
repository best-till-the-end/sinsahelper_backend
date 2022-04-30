package com.ujm.sinsahelper.repository;

import com.ujm.sinsahelper.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    //    List<Item> findByMainCategoryAndSubCategoryOrderByTotalScoreDesc(String mainCategory, String subCategory);
    List<Item> findByMainCategoryAndSubCategory(String mainCategory, String subCategory);

    @Query(value = "SELECT M FROM Item m where m.itemId = :itemId")
    public Item findItemByItemId(@Param("itemId") Long itemId);
}

