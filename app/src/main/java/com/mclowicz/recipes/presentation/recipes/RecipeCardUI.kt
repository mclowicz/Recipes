package com.mclowicz.recipes.presentation.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.mclowicz.recipes.R
import com.mclowicz.recipes.data.model.RecipeResult
import com.mclowicz.recipes.data.model.RecipeViewModel

@ExperimentalCoilApi
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RecipeCardUI(
    data: RecipeViewModel,
    onFavoriteClicked: (RecipeViewModel) -> Unit
) {
    val painter = rememberImagePainter(data = data.image) {
        placeholder(R.drawable.ic_launcher_background)
        error(R.drawable.ic_launcher_background)
    }
    Card(
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color.Black),
        elevation = 12.dp,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        onClick = {}
    ) {
        Column {
            Row() {
                Image(
                    painter = painter,
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
            )
            Row {
                Column(modifier = Modifier.weight(0.8f)) {
                    Text(
                        modifier = Modifier
                            .padding(16.dp),
                        text = data.title,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Column(
                    modifier = Modifier.weight(0.2f).padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(onClick = {
                        onFavoriteClicked(data)
                    }) {
                        Icon(
                            Icons.Default.Favorite,
                            "favorite",
                            tint = if (data.isFavorite) Color.Red else Color.Gray,
                            modifier = Modifier.alpha(0.5f),
                            )
                    }
                }
            }
        }
    }
}