package com.project.foryourskintype.dto;

import com.project.foryourskintype.domain.LikedItem;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class LikedItemDto {
    private Long id;
    private ItemDto item;

    public LikedItemDto(LikedItem likedItem) {
        this.id = likedItem.getId();
        this.item = new ItemDto(likedItem.getItem());
    }
}
