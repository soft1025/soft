package com.example.favoriteactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FavoriteStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_store)

        val favoriteGoodsBtn : Button = findViewById(R.id.favoriteGoodsBtn) // 즐겨찾기 조회 (상품) 버튼
        favoriteGoodsBtn.setOnClickListener{
            val intent = Intent(this, FavoriteGoodsActivity::class.java)
            startActivity(intent)
        }
    }
}