package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiMap: ImageVector
    get() {
        if (_SiMap != null) {
            return _SiMap!!
        }
        _SiMap = ImageVector.Builder(
            name = "Filled.SiMap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.872f, 2.007f)
                curveToRelative(0.149f, -0.019f, 0.301f, -0.003f, 0.444f, 0.044f)
                lineToRelative(5.705f, 1.902f)
                lineToRelative(6.705f, -1.915f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.726f, 0.962f)
                lineToRelative(-7f, 2f)
                curveToRelative(-0.193f, 0.055f, -0.4f, 0.05f, -0.59f, -0.014f)
                lineToRelative(-5.706f, -1.902f)
                lineToRelative(-6.704f, 1.916f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 21f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.447f, 0.296f, -0.84f, 0.726f, -0.962f)
                lineToRelative(7f, -2f)
                close()
                moveTo(14f, 5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                close()
                moveTo(8f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _SiMap!!
    }

@Suppress("ObjectPropertyName")
private var _SiMap: ImageVector? = null
