package com.example.a15dias_ikerlabargacuadra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a15dias_ikerlabargacuadra.data.Invento
import com.example.a15dias_ikerlabargacuadra.data.invetos
import com.example.a15dias_ikerlabargacuadra.ui.theme._15Dias_IkerLabargaCuadraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _15Dias_IkerLabargaCuadraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    diasApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun diasApp() {
    Scaffold(
        topBar = {
            InventoTopBar()
        }
    ) { it ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(1),// SI LAS DESCRIPCIONES FUERAN MAS PEQUEÑAS UTILIZARIA MAS COLUMNAS, PERO LO VEO REBOSANTE
            contentPadding = it,

            modifier = Modifier.padding(
                start = dimensionResource(id = R.dimen.padding_small),
                end = dimensionResource(id = R.dimen.padding_small)
            )
        ) {
            items(invetos) { invento ->
                InventoItem(invento = invento, modifier = Modifier.padding(2.dp))
            }
        }

    }
}

@Composable
fun InventoItem(
    invento: Invento, modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clip(MaterialTheme.shapes.large)
    ) {
        Column() {
            InventoIcon(invento.imageId)
            Row(
                modifier = modifier
                    .fillMaxSize()
                    .padding(
                        bottom = dimensionResource(id = R.dimen.padding_small),
                        start = dimensionResource(id = R.dimen.padding_small)
                    )
            ) {

                InventoInformation(invento.nombre, invento.descripcion, invento.año)
            }
        }

    }
}

@Composable
fun InventoIcon(
    @DrawableRes invetoIcon: Int, modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(invetoIcon),
        contentDescription = null,
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small)
    )
}

@Composable
fun InventoInformation(
    @StringRes InventoName: Int,
    @StringRes InventoDesc: Int,
    @StringRes inventoAño: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(InventoName),
            style = MaterialTheme.typography.displayLarge,

            )
        Text(
            text = stringResource(inventoAño),
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = stringResource(InventoDesc),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventoTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.image_size))
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    painter = painterResource(R.drawable.topbarbombilla),
                    contentDescription = null
                )
                Text(
                    text = stringResource(id = R.string.titleapp),
                    style = MaterialTheme.typography.displayLarge

                )
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _15Dias_IkerLabargaCuadraTheme {
        diasApp()
    }
}