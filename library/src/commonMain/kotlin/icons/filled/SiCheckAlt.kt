package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCheckAlt: ImageVector
    get() {
        if (_SiCheckAlt != null) {
            return _SiCheckAlt!!
        }
        _SiCheckAlt = ImageVector.Builder(
            name = "Filled.SiCheckAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.47f, 4.118f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.412f, 1.353f)
                lineToRelative(-8f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.59f, 0.236f)
                lineToRelative(-6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.415f, -1.414f)
                lineToRelative(5.046f, 5.046f)
                lineToRelative(7.365f, -13.81f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.353f, -0.411f)
            }
        }.build()

        return _SiCheckAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiCheckAlt: ImageVector? = null
