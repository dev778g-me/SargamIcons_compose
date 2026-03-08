package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAlignTopSimple: ImageVector
    get() {
        if (_SiAlignTopSimple != null) {
            return _SiAlignTopSimple!!
        }
        _SiAlignTopSimple = ImageVector.Builder(
            name = "Filled.SiAlignTopSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(10.6f, 7f)
                horizontalLineToRelative(2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8.6f)
                verticalLineToRelative(11.8f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, 1.6f)
                horizontalLineToRelative(-2.8f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20.4f)
                lineTo(9f, 8.6f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.6f, 7f)
            }
        }.build()

        return _SiAlignTopSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiAlignTopSimple: ImageVector? = null
