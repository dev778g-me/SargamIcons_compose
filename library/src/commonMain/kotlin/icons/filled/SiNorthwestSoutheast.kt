package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNorthwestSoutheast: ImageVector
    get() {
        if (_SiNorthwestSoutheast != null) {
            return _SiNorthwestSoutheast!!
        }
        _SiNorthwestSoutheast = ImageVector.Builder(
            name = "Filled.SiNorthwestSoutheast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.636f, 11.293f)
                verticalLineTo(5.636f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(5.657f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(8.05f)
                lineToRelative(9.313f, 9.314f)
                verticalLineToRelative(-3.243f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(5.656f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-5.656f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(3.242f)
                lineTo(6.637f, 8.05f)
                verticalLineToRelative(3.243f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            }
        }.build()

        return _SiNorthwestSoutheast!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthwestSoutheast: ImageVector? = null
