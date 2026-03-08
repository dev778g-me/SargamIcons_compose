package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSearchAlt: ImageVector
    get() {
        if (_SiSearchAlt != null) {
            return _SiSearchAlt!!
        }
        _SiSearchAlt = ImageVector.Builder(
            name = "Filled.SiSearchAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.192f, 12.606f)
                lineToRelative(7.1f, 7.101f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.415f, -1.414f)
                lineToRelative(-7.1f, -7.1f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                moveTo(4f, 9f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10f, 0f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
            }
        }.build()

        return _SiSearchAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSearchAlt: ImageVector? = null
