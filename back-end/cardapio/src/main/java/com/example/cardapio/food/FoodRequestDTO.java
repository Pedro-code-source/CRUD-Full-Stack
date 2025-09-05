package com.example.cardapio.food;

public record FoodRequestDTO(String title, String img, Integer price) {
    public FoodRequestDTO(Food food){
        this(food.getTitle(), food.getImg(), food.getPrice());

    }
}
