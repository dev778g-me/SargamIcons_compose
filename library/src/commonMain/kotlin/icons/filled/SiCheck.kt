package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCheck: ImageVector
    get() {
        if (_SiCheck != null) {
            return _SiCheck!!
        }
        _SiCheck = ImageVector.Builder(
            name = "Filled.SiCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.633f, 6.226f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.141f, 1.407f)
                lineToRelative(-9f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.481f, 0.074f)
                lineToRelative(-5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, -1.414f)
                lineToRelative(4.219f, 4.219f)
                lineToRelative(8.3f, -10.145f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.407f, -0.141f)
            }
        }.build()

        return _SiCheck!!
    }

@Suppress("ObjectPropertyName")
private var _SiCheck: ImageVector? = null
