package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiToggleOff: ImageVector
    get() {
        if (_SiToggleOff != null) {
            return _SiToggleOff!!
        }
        _SiToggleOff = ImageVector.Builder(
            name = "Filled.SiToggleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                horizontalLineTo(7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                moveToRelative(3f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
            }
        }.build()

        return _SiToggleOff!!
    }

@Suppress("ObjectPropertyName")
private var _SiToggleOff: ImageVector? = null
