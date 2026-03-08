package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHome: ImageVector
    get() {
        if (_SiHome != null) {
            return _SiHome!!
        }
        _SiHome = ImageVector.Builder(
            name = "Filled.SiHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveToRelative(21.1f, 6.551f)
                lineToRelative(0.03f, 0.024f)
                curveToRelative(0.537f, 0.413f, 0.87f, 1.053f, 0.87f, 1.757f)
                verticalLineToRelative(11.256f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.6f, 23f)
                horizontalLineTo(5.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.588f)
                verticalLineTo(8.332f)
                curveToRelative(0f, -0.704f, 0.333f, -1.344f, 0.87f, -1.757f)
                lineToRelative(0.029f, -0.023f)
                lineToRelative(7.79f, -5.132f)
                arcToRelative(2.195f, 2.195f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.581f, 0f)
                close()
                moveTo(10f, 13f)
                verticalLineToRelative(8f)
                horizontalLineTo(8f)
                verticalLineToRelative(-8.2f)
                curveToRelative(0f, -0.992f, 0.808f, -1.8f, 1.8f, -1.8f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.992f, 0f, 1.8f, 0.808f, 1.8f, 1.8f)
                verticalLineTo(21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
            }
        }.build()

        return _SiHome!!
    }

@Suppress("ObjectPropertyName")
private var _SiHome: ImageVector? = null
