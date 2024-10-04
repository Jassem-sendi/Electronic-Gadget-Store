
import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import com.example.storev2.home.components.ItemCard
import com.example.storev2.home.components.NavDrawer
import com.example.storev2.home.components.SearchBar
import com.example.storev2.home.components.ShowCategories
import com.example.storev2.home.components.Title
import com.example.storev2.home.components.TopBar
import com.example.storev2.home.data.ListOfProducts

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {

    var grid = 0
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            grid=2
        }
        else -> {
            grid=1
        }
    }
    val allProducts by remember {
        mutableStateOf(ListOfProducts)
    }
    var selectedCategoryId  by rememberSaveable { mutableStateOf("0") }
    val products by remember(
        allProducts,
        selectedCategoryId,
    ) {
        mutableStateOf(allProducts.filter { it.categoryId == selectedCategoryId })
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(grid),
            modifier = Modifier.fillMaxSize()
        ) {
            item(span = { GridItemSpan(grid) }) {
               Column {
                    //NavDrawer()
                    TopBar {  }
                    Title()
                    Spacer(Modifier.height(30.dp))
                    SearchBar()
                    Spacer(Modifier.height(40.dp))
                    ShowCategories(
                        navController=navController,
                        selectedCategoryId = selectedCategoryId,
                        onCategoryClicked = { categoryId ->
                            selectedCategoryId = categoryId
                        }
                    )
                }
            }
            items(products) { item ->
                ItemCard(
                    item.name,
                    item.image
                )
            }
        }
    }
}
