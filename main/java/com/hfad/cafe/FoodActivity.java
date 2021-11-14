package com.hfad.cafe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class FoodActivity extends Activity {
    public static final String EXTRA_FOODID = "foodId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        //Получить напиток из данных интента
        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Food food = Food.food[foodId];
        //Заполнение названия напитка
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(food.getName());
        //Заполнение описания напитка
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(food.getDescription());
        //Заполнение изображения напитка
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());
    }
}